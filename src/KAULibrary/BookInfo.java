package KAULibrary;

import static KAULibrary.Search.book;
import static KAULibrary.Login.id;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class BookInfo extends javax.swing.JFrame {

    public BookInfo() {
        initComponents();
        Image image = null;
        try {
            image = ImageIO.read(getClass().getResource("/IMG/" + book.getISBN() + ".jpeg"));
            if (book.getISBN().isEmpty()) {
            } else {
                Book details = book.getBookInfo(book);
                ImageIcon icon = new ImageIcon(image);
                bookTittleLabel.setText(details.getBookTitle());
                isbnLabel.setText(details.getISBN());
                authorNameLabel.setText(details.getAuthorName());
                classificationLabel.setText(details.getClassification());
                bookPic.setIcon(icon);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
        } catch (IllegalArgumentException e) {
        }
        issueBookResult.setVisible(false);
    }

    public ArrayList fileName() {
        ArrayList<String> results = new ArrayList<String>();

        File[] files = new File("/IMG/").listFiles();
//If this pathname does not denote a directory, then listFiles() returns null. 

        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }

        }
        return results;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        borrowButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bookTitleLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        classificationLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bookPic = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        bookTittleLabel = new javax.swing.JLabel();
        authorNameLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        issueBookResult = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 242, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrowButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        borrowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/borrow (2).png"))); // NOI18N
        borrowButton.setText("Borrow");
        borrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowButtonActionPerformed(evt);
            }
        });
        jPanel1.add(borrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 150, -1));

        jPanel2.setBackground(new java.awt.Color(213, 201, 201));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(323, 77));

        bookTitleLabel.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        bookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookTitleLabel.setText("Book Details");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logoApp2.PNG"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout2.PNG"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        classificationLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        classificationLabel.setText("jLabel5");
        jPanel1.add(classificationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 170, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Classification:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jPanel3.setBackground(new java.awt.Color(213, 201, 201));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(323, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Mybooks.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setVisible(true);
        jButton4.setOpaque(false);
        jButton4.setFocusPainted(false);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 70, 52));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/backSmall.png"))); // NOI18N
        jButton1.setVisible(true);
        jButton1.setOpaque(false);
        jButton1.setFocusPainted(false);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("My Books");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 450, -1));

        bookPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/unavailable.png"))); // NOI18N
        jPanel1.add(bookPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 130, 180));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("ISBN:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 70, -1));

        isbnLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        isbnLabel.setText("jLabel5");
        jPanel1.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 230, -1));

        bookTittleLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bookTittleLabel.setText("Book Title:");
        jPanel1.add(bookTittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 340, -1));

        authorNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        authorNameLabel.setText("jLabel7");
        jPanel1.add(authorNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 170, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setText("Author Name: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        issueBookResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        issueBookResult.setForeground(new java.awt.Color(0, 153, 255));
        issueBookResult.setText("jLabel2");
        jPanel1.add(issueBookResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 300, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 520));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void borrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowButtonActionPerformed
        boolean issueBook = book.issueBook(id, book.getISBN());
        boolean checkBook = book.checkBook(book.getISBN());
        boolean checkUserHistory = book.checkUserHistory(id);
        if (!checkBook) {
            issueBookResult.setVisible(true);
            issueBookResult.setForeground(Color.RED);
            issueBookResult.setText("Sorry! There is no avaliable copies to borrow.");
        }
        if (!checkUserHistory) {
            issueBookResult.setVisible(true);
            issueBookResult.setForeground(Color.RED);
            issueBookResult.setText("Sorry! You are not allowed to borrow.");
        }
        if (checkUserHistory && checkBook) {
            if (issueBook) {
                issueBookResult.setVisible(true);
                issueBookResult.setText("Book is issued successfully!");
            } else {
                issueBookResult.setVisible(true);
                issueBookResult.setForeground(Color.RED);
                issueBookResult.setText("Sorry, you already borrowed this book!");
            }
        }
    }//GEN-LAST:event_borrowButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MyBooks myBorrow = new MyBooks();
        myBorrow.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Search search = new Search();
        search.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JLabel bookPic;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JLabel bookTittleLabel;
    private javax.swing.JButton borrowButton;
    private javax.swing.JLabel classificationLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel issueBookResult;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
