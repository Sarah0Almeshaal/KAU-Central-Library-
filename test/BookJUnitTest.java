
import KAULibrary.Book;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookJUnitTest {

    public BookJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addBookTest() {
        Book instance = new Book();
        assertFalse(instance.addBook("0003932686", "9780071771818", "General Aviation Law", "Jerry Eichenberger", "Law", 5));
    }

    @Test
    public void issueBookTest() {
        Book instance = new Book();
        assertFalse(instance.issueBook("1805372", "9788120345164"));
    }

    @Test
    public void populateBookTabelTest() {
        Book instance = new Book();
        JTable table = new JTable();
        assertTrue(instance.populateBookTabel(table));
    }
    
    @Test 
    public void deleteBookTest(){
        Book instance = new Book();
        assertTrue(instance.deleteBook("9781305272378   "));
    }

    @Test
    public void borrowCancelationTest() {
        Book instance = new Book();
        String isbn = "0130200387";
        String userID = "0007364163 ";
        assertTrue("delete from issued_book where isbn= " + isbn + " AND userID = '" + userID + "'", instance.borrowCancelation(isbn, userID));
    }

    
    @Test
    public void searchQueryTest() {
        Book instance = new Book();
        String search="General Aviation Law";
        assertEquals("SELECT ISBN, book_title, classification FROM book where book_title like '%" + search + "%'",instance.searchQuery("Title", "General Aviation Law"));
    }
    
    @Test
    public void searchTest() {
        Book instance = new Book();
         String search="General Aviation Law";
         String filter="Title";
        JTable table = new JTable();
        assertTrue(instance.search(filter,table,search));
    }
    
      @Test
    public void increaseBookAvailabilityTest() {
        Book instance = new Book();
        String isbn = "9781292097619";
       assertTrue(instance.increaseBookAvailability(isbn));
    }
    
     public void populateUserTabelTest() {
        JTable borrowedBook = new JTable();
        String isbn = "0130200387";
        Book instance = new Book();
       assertTrue( instance.populateUserTabel(borrowedBook, isbn));     
    }
     
     @Test
    public void decreaseBookAvailabilitytest() {
        Book instance = new Book();
        String isbn = "9781292097619";
        assertTrue(instance.decreaseBookAvailability(isbn));
    }
    
    @Test
    public void checkBookTest() {
        Book instance = new Book();
        assertTrue(instance.checkBook("0130194921"));
    }
    
    @Test
    public void checkUserHistoryTest() {
        Book instance = new Book();
        assertTrue(instance.checkUserHistory("1805763"));
    }
    
    @Test
    public void bookUpdateHistoryTest() {
        Book instance = new Book();
        assertFalse(instance.bookUpdateHistory("9781292023403", "0005482740"));
    }
    
     @Test 
    public void updatedBookTest(){
        Book instance = new Book();
        assertTrue(instance.updateBook("0003932686", "Business_law", "9781292023403", "Cheeseman J", "Law", 4));
    }
    @Test
    public void getBookInfoTest() {
        Book instance = new Book();
        Book expResult = null;
        assertEquals(expResult, instance.getBookInfo(instance));
    }
}
