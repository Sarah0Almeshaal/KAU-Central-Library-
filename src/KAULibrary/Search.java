package KAULibrary;

import static KAULibrary.Login.id;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

public class Search extends javax.swing.JFrame {

    static DefaultTableModel bookTable;
    static Book book;
    static String searchf;
    static Object selectedItem;

    public Search() {
        initComponents();
        setLocationRelativeTo(null);
        Book book = new Book();
        book.populateBookTabel(jTable1);
        detailsButton.setVisible(true);
        addButton.setVisible(false);
        updateButton.setVisible(false);
        deleteButton.setVisible(false);
    }

    public Search(String AdminID) {
        initComponents();
        setLocationRelativeTo(null);
        Book book = new Book();
        book.populateBookTabel(jTable1);
        detailsButton.setVisible(false);
        myBookButtons.setVisible(false);
        jLabel3.setVisible(false);
    }

    public Search(boolean b) {
        initComponents();
        setLocationRelativeTo(null);
        searchComboBox.setSelectedItem(selectedItem);
        book.search(searchComboBox.getSelectedItem().toString(), jTable1, book.getBookTitle());
        searchTypeTextField.setText(searchf);
        detailsButton.setVisible(true);
        addButton.setVisible(false);
        updateButton.setVisible(false);
        deleteButton.setVisible(false);
    }

    public Search(int x) {
        initComponents();
        setLocationRelativeTo(null);
        searchComboBox.setSelectedItem(selectedItem);
        book.search(searchComboBox.getSelectedItem().toString(), jTable1, book.getBookTitle());
        searchTypeTextField.setText(searchf);
        detailsButton.setVisible(false);
        addButton.setVisible(true);
        updateButton.setVisible(true);
        deleteButton.setVisible(true);
        jLabel3.setVisible(false);
        myBookButtons.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        myBookButtons = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchTypeTextField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        detailsButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 242, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(213, 201, 201));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(323, 77));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logoApp2.PNG"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout2.PNG"))); // NOI18N
        jButton2.setVisible(true);
        jButton2.setOpaque(false);
        jButton2.setFocusPainted(false);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(84, 84, 84)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jPanel3.setBackground(new java.awt.Color(213, 201, 201));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myBookButtons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Mybooks.png"))); // NOI18N
        myBookButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBookButtonsActionPerformed(evt);
            }
        });
        myBookButtons.setVisible(true);
        myBookButtons.setOpaque(false);
        myBookButtons.setFocusPainted(false);
        myBookButtons.setBorderPainted(false);
        myBookButtons.setContentAreaFilled(false);
        myBookButtons.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jPanel3.add(myBookButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 70, 52));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("My Books");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 583, 450, 80));

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "ISBN", "Author", "Classification" }));
        jPanel1.add(searchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 110, 36));
        jPanel1.add(searchTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 273, 36));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search (2).png"))); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 172, 129), 3));
        search.setPreferredSize(new java.awt.Dimension(35, 35));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 33, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Book Title", "Classification"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 413, 310));

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        deleteButton.setText("Delete Book");
        deleteButton.setBorder(new javax.swing.border.MatteBorder(null));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 80, 40));

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addButton.setText("Add Book");
        addButton.setBorder(new javax.swing.border.MatteBorder(null));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 80, 40));

        updateButton.setBackground(new java.awt.Color(204, 204, 204));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        updateButton.setText("Update Book");
        updateButton.setBorder(new javax.swing.border.MatteBorder(null));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 80, 40));

        detailsButton.setBackground(new java.awt.Color(204, 204, 204));
        detailsButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        detailsButton.setText("View Details");
        detailsButton.setBorder(new javax.swing.border.MatteBorder(null));
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(detailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 90, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        book = new Book();
        boolean b = false;
        int x = 0;
        book.setBookTitle(searchTypeTextField.getText().trim());
        searchf = searchTypeTextField.getText();
        selectedItem = searchComboBox.getSelectedItem();
        if (!searchTypeTextField.getText().equalsIgnoreCase("") && !id.startsWith("000")) {
            Search search = new Search(b);
            search.show();
            dispose();
        } else if (searchTypeTextField.getText().equalsIgnoreCase("") && !id.startsWith("000")) {
            Search search = new Search();
            search.show();
            dispose();
        } else if (searchTypeTextField.getText().equalsIgnoreCase("") && id.startsWith("000")) {
            Search search = new Search(id);
            search.show();
            dispose();
        } else if (!searchTypeTextField.getText().equalsIgnoreCase("") && id.startsWith("000")) {
            Search search = new Search(x);
            search.show();
            dispose();
        }
    }//GEN-LAST:event_searchActionPerformed

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
        book = new Book();
        book.setISBN(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        BookInfo bookInfo = new BookInfo();
        bookInfo.show();
        dispose();
    }//GEN-LAST:event_detailsButtonActionPerformed

    private void myBookButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBookButtonsActionPerformed
        MyBooks myBorrow = new MyBooks();
        myBorrow.show();
        dispose();
    }//GEN-LAST:event_myBookButtonsActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ManageBook manageBook = new ManageBook();
        manageBook.show();
        dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        book = new Book();
        book.getBookInfo(book);
        book.setISBN(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        book.getBookInfo(book);
        ManageBook manageBook = new ManageBook(book);
        manageBook.show();
        dispose();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        book = new Book();
        book.getBookInfo(book);
        book.setISBN(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        book.deleteBook(book.getISBN());
        Search search = new Search(id);
        search.show();
        dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton detailsButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton myBookButtons;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> searchComboBox;
    private transient javax.swing.JTextField searchTypeTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}
