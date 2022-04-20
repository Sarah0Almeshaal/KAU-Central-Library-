package KAULibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static KAULibrary.Search.book;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Book {

    private String bookTitle;
    private String authorName;
    private String classification;
    private String ISBN;
    private int availability;
    private Connection con;

    public Book(String bookTitle, String authorName, String classification, String ISBN, int availability) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.classification = classification;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    public Book() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    // a method to delete an exisiting book from the KAU library database
    public boolean deleteBook(String isbn) {
        boolean result = true;
        try {
            // initialize connection with the database 
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");
            Statement st = con.createStatement();
            // delete query, book get deleted where it match the isbn
            st.executeUpdate("delete from book where isbn= '" + isbn + "'");
            con.close();
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
            s.printStackTrace();
            result = false;
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    // a method to update an exisiting book from the KAU library database
    public boolean updateBook(String adminID, String title, String isbn, String author, String classification, int availability) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");
            Statement st = con.createStatement();
            // a prepared query to update the book where it matches the book isbn
            String query = "update book set book_title = ?, author_name = ?, classification = ?, availability = ?  WHERE isbn = '" + isbn + "'";
            PreparedStatement preparedStmt1 = con.prepareStatement(query);
            preparedStmt1.setString(1, title);
            preparedStmt1.setString(2, author);
            preparedStmt1.setString(3, classification);
            preparedStmt1.setInt(4, availability);
            preparedStmt1.executeUpdate();
            // a call for a method that store the update process
            bookUpdateHistory(isbn, adminID);
            st.close();
            con.close();
            result = true;
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
            result = false;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    // a method that help with user usability to fill the fields with the book information to get updated later
    public Book getBookInfo(Book book) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            Connection con = DriverManager.getConnection(ConnectionURL, "root", "root");
            String selectSQL = "SELECT book_title, classification, availability, isbn, author_name FROM book where isbn= '" + book.getISBN() + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);
            if (rs.next()) {
                book.setBookTitle(rs.getString("book_title"));
                book.setISBN(rs.getString("isbn"));
                book.setAuthorName(rs.getString("author_name"));
                book.setAvailability(rs.getInt("availability"));
                book.setClassification(rs.getString("classification"));
                return book;
            }
        } catch (Exception e) {
            System.out.println("SQL statement is not executed!");
            System.err.println(e.getMessage());
        }
        return null;
    }

    // a method to add a new book to the kau library database
    public boolean addBook(String adminID, String isbn, String bookTitle, String authorName, String classification, int availability) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");
            // a prepared query to add the new book
            String query = " insert into book (isbn, book_title, author_name, classification, availability)"
                    + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, isbn);
            preparedStmt.setString(2, bookTitle);
            preparedStmt.setString(3, authorName);
            preparedStmt.setString(4, classification);
            preparedStmt.setInt(5, availability);
            preparedStmt.execute();
            // a call for a method that store the add process
            bookUpdateHistory(isbn, adminID);
            con.close();
            result = true;
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
            result = false;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    // a method to help with the gui, it get all the books from the database and display it on a tabel for the user and admin
    public boolean populateBookTabel(JTable bookTabel) {
        // initialize a default table to manually add the rows and columns 
        DefaultTableModel bookTable = (DefaultTableModel) bookTabel.getModel();
        boolean isPopulated = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            Connection con = DriverManager.getConnection(ConnectionURL, "root", "root");
            // a quesry that get the book information to display it on the table
            String selectSQL = "SELECT ISBN, book_title, classification FROM book";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);
            while (rs.next()) {
                // store each book information into an array to add it to the tabel
                String[] row = {rs.getString("ISBN"), rs.getString("book_title"), rs.getString("classification")};
                bookTable.addRow(row);
            }
            st.close();
            isPopulated = true;
        } catch (Exception e) {
            System.out.println("SQL statement is not executed!");
            System.err.println(e.getMessage());
        }
        return isPopulated;
    }

    // a method to issue a book to the user 
    public boolean issueBook(String userID, String isbn) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");

            // a query to get the user id and status
            String selectSQL = "SELECT status, id FROM user WHERE Id = '" + userID + "'";
            PreparedStatement preparedStmt = con.prepareStatement(selectSQL);
            ResultSet stmtResult = preparedStmt.executeQuery();

            // a query to get the book isbn
            String selectSQL2 = "SELECT ISBN, availability FROM book WHERE isbn = '" + isbn + "'";
            PreparedStatement preparedStmt2 = con.prepareStatement(selectSQL2);
            ResultSet stmtResult2 = preparedStmt2.executeQuery();

            // get the system(util) date and convert it to sql date 
            Calendar c = Calendar.getInstance();
            java.util.Date currentDate = new Date();
            java.sql.Date sqlBorrowDate = new java.sql.Date(currentDate.getTime());
            c.setTime(currentDate);
            // caculate the 5 days after the borrowing date to return the book
            c.add(Calendar.DAY_OF_MONTH, 5);
            java.sql.Date sqlDueDate = new java.sql.Date(c.getTimeInMillis());

            stmtResult.next();

            if (stmtResult.getBoolean("status")) {
                stmtResult2.next();

                // a prepared query to fill the issued book table with the user id, book isbn, due date to return, borrowed date
                String query = " insert into issued_book (userID, ISBN, borrowed_date, due_date)"
                        + " values (?, ?, ?, ?)";
                PreparedStatement preparedStmt3 = con.prepareStatement(query);
                preparedStmt3.setString(1, stmtResult.getString("id"));
                preparedStmt3.setString(2, stmtResult2.getString("ISBN"));
                preparedStmt3.setDate(3, sqlBorrowDate);
                preparedStmt3.setDate(4, sqlDueDate);
                preparedStmt3.execute();
                // a call of method to decrease the copied of the book
                decreaseBookAvailability(isbn);
                result = true;
            }
            con.close();
        } catch (SQLException s) {
            System.out.println(s);
            System.out.println("SQL statement is not executed!");
            result = false;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }

        return result;
    }

    // a method that check if the book has avalilable copies 
    public boolean checkBook(String isbn) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");

            String selectSQL = "SELECT availability FROM book WHERE ISBN = '" + isbn + "'";
            PreparedStatement preparedStmt = con.prepareStatement(selectSQL);
            ResultSet stmtResult = preparedStmt.executeQuery();
            stmtResult.next();
            if (stmtResult.getInt("availability") > 0) {
                result = true;
            }
            con.close();
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // a method to decrease the number of the book copied if a student borrowed a copy
    public boolean decreaseBookAvailability(String isbn) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");

            String selectSQL = "SELECT availability FROM book WHERE isbn = '" + isbn + "'";
            PreparedStatement preparedStmt = con.prepareStatement(selectSQL);
            ResultSet stmtResult = preparedStmt.executeQuery();
            stmtResult.next();
            String query = "update book set availability = ? WHERE isbn = '" + isbn + "'";
            PreparedStatement preparedStmt2 = con.prepareStatement(query);
            preparedStmt2.setInt(1, stmtResult.getInt("availability") - 1);
            preparedStmt2.executeUpdate();
            con.close();
            result = true;
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /*  a method that check if the user is allowed to borrow a book
         user is not allowed to borrow a book if there is 5 issued books to their profile if they has 5 books their status become false */
    public boolean checkUserHistory(String id) {
        boolean result = true;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");

            String selectSQL = "SELECT userID, COUNT(userID) FROM issued_book WHERE userID = '" + id + "'";
            PreparedStatement preparedStmt = con.prepareStatement(selectSQL);
            ResultSet stmtResult = preparedStmt.executeQuery();
            stmtResult.next();
            if (stmtResult.getInt("count(userID)") < 5) {
                //result = true;
                String query = "update user set status = ? WHERE id = '" + id + "'";
                PreparedStatement preparedStmt2 = con.prepareStatement(query);
                preparedStmt2.setBoolean(1, true);
                preparedStmt2.executeUpdate();
                con.close();
                return true;
            } else {
                String query = "update user set status = ? WHERE id = '" + id + "'";
                PreparedStatement preparedStmt2 = con.prepareStatement(query);
                preparedStmt2.setBoolean(1, false);
                preparedStmt2.executeUpdate();
                con.close();
                return false;
            }
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
            result = false;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    // a method to store the process that happens on the book along with the admin that updated the book inventory
    public boolean bookUpdateHistory(String ISBN, String adminID) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");

            String selectSQL = "SELECT admin_ID FROM admin WHERE admin_ID = '" + adminID + "'";
            PreparedStatement preparedStmt = con.prepareStatement(selectSQL);
            ResultSet stmtResult = preparedStmt.executeQuery();

            String selectSQL2 = "SELECT ISBN FROM book WHERE isbn = '" + ISBN + "'";
            PreparedStatement preparedStmt2 = con.prepareStatement(selectSQL2);
            ResultSet stmtResult2 = preparedStmt2.executeQuery();

            java.util.Date date = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            stmtResult.next();
            stmtResult2.next();
            String query = " insert into inventory_history (ISBN, adminID, update_date)"
                    + " values (?, ?, ?)";
            PreparedStatement preparedStmt3 = con.prepareStatement(query);
            preparedStmt3.setInt(1, stmtResult2.getInt("ISBN"));
            preparedStmt3.setString(2, stmtResult.getString("admin_ID"));
            preparedStmt3.setDate(3, sqlDate);
            preparedStmt3.execute();
            con.close();
            result = true;
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // a method to display all the issued books of the user on a table
    public boolean populateUserTabel(JTable borrowedBook, String id) {
        DefaultTableModel userTabel = (DefaultTableModel) borrowedBook.getModel();
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            Connection con = DriverManager.getConnection(ConnectionURL, "root", "root");

            String selectSQL = "SELECT ISBN, return_date, due_date, borrowed_date FROM issued_book where userID = '" + id + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);

            while (rs.next()) {
                String selectSQL2 = "SELECT book_title FROM book WHERE isbn = '" + rs.getString("isbn") + "'";
                PreparedStatement preparedStmt2 = con.prepareStatement(selectSQL2);
                ResultSet rs2 = preparedStmt2.executeQuery();
                rs2.next();
                String[] row = {rs.getString("ISBN"), rs2.getString("book_title"), rs.getString("return_date"), rs.getString("due_date"), rs.getString("borrowed_date")};
                userTabel.addRow(row);
            }
            st.close();
            result = true;
        } catch (Exception e) {
            System.out.println("SQL statement is not executed!");
            System.err.println(e.getMessage());
        }
        return result;
    }

    // a method that allows the user to cancle a borrowing process
    public boolean borrowCancelation(String isbn, String userID) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            Connection con = DriverManager.getConnection(ConnectionURL, "root", "root");
            Statement st = con.createStatement();
            st.executeUpdate("delete from issued_book where isbn= '" + isbn + "' AND userID = '" + userID + "'");
            increaseBookAvailability(isbn);
            result = true;
        } catch (Exception e) {
            System.out.println("SQL statement is not executed!");
            System.err.println(e.getMessage());
        }
        return result;
    }

    // a method to increase the number of copied when a user cancle their borrowing
    public boolean increaseBookAvailability(String isbn) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            con = DriverManager.getConnection(ConnectionURL, "root", "root");

            String selectSQL = "SELECT availability FROM book WHERE isbn = '" + isbn + "'";
            PreparedStatement preparedStmt = con.prepareStatement(selectSQL);
            ResultSet stmtResult = preparedStmt.executeQuery();
            stmtResult.next();
            String query = "update book set availability = ? WHERE isbn = '" + isbn + "'";
            PreparedStatement preparedStmt2 = con.prepareStatement(query);
            preparedStmt2.setInt(1, stmtResult.getInt("availability") + 1);
            preparedStmt2.executeUpdate();
            con.close();
            result = true;
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // a method that assist the search process when using filters
    public String searchQuery(String filter, String search) {
        // this method return a query with the choosen search filter that the user/admin chose 
        if (filter.equalsIgnoreCase("Title")) {
            return "SELECT ISBN, book_title, classification FROM book where book_title like '%" + search + "%'";
        } else if (filter.equalsIgnoreCase("Classification")) {
            return "SELECT ISBN, book_title, classification FROM book where Classification like '%" + search + "%'";
        } else if (filter.equalsIgnoreCase("ISBN")) {
            return "SELECT ISBN, book_title, classification FROM book where ISBN like '%" + search + "%'";
        } else if (filter.equalsIgnoreCase("Author")) {
            return "SELECT ISBN, book_title, classification FROM book where author_name like '%" + search + "%'";
        }
        return "";
    }

    // a method that display all the search results to the user and the admin
    public boolean search(String filter, JTable bookTabel, String search) {
        DefaultTableModel bookTable = (DefaultTableModel) bookTabel.getModel();
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL = "jdbc:mysql://localhost:3306/KAULibraryDB";
            Connection con = DriverManager.getConnection(ConnectionURL, "root", "root");
            String sql = searchQuery(filter, search);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String[] row = {rs.getString("ISBN"), rs.getString("book_title"), rs.getString("classification")};
                bookTable.addRow(row);
            }
            result = true;
        } catch (Exception e) {
            System.out.println("SQL statement is not executed!");
            System.err.println(e.getMessage());
        }
        return result;
    }
}
