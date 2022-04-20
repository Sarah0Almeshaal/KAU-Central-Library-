package KAULibrary;

import javax.swing.JOptionPane;
import static KAULibrary.Login.id;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

public class ManageBook extends javax.swing.JFrame {

    public ManageBook() {
        initComponents();
        setLocationRelativeTo(null);
        errorLabel.setVisible(false);
        errorLabel2.setVisible(false);
        errorLabel3.setVisible(false);
        updateButton.setVisible(false);
        label.setVisible(true);
    }

    public ManageBook(Book book) {
        initComponents();
        setLocationRelativeTo(null);
        addButton.setVisible(false);
        errorLabel.setVisible(false);
        errorLabel2.setVisible(false);
        errorLabel3.setVisible(false);
        
        label.setVisible(false);
        titleTextField.setText(book.getBookTitle());
        isbnTextField.setText(book.getISBN() + "");
        isbnTextField.enable(false);
        authorTextField.setText(book.getAuthorName());
        classficationCombo.setSelectedItem(book.getClassification());
        availabilityField.setText(book.getAvailability() + "");
        label.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        errorLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        authorTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        availabilityField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        errorLabel2 = new javax.swing.JLabel();
        classficationCombo = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 242, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorLabel3.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel3.setText("errorLabel3");
        jPanel1.add(errorLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jPanel2.setBackground(new java.awt.Color(213, 201, 201));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(323, 77));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage book");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logoApp2.PNG"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout2.PNG"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 449, 78));

        jPanel3.setBackground(new java.awt.Color(213, 201, 201));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(323, 77));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/backSmall.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setVisible(true);
        jButton2.setOpaque(false);
        jButton2.setFocusPainted(false);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 450, 80));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Book Title:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 152, -1, -1));
        jPanel1.add(titleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 213, 29));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Author:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 263, -1, -1));
        jPanel1.add(isbnTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 213, 29));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Classification:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("ISBN:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 207, -1, -1));
        jPanel1.add(authorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 213, 29));

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(new javax.swing.border.MatteBorder(null));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 80, 43));

        updateButton.setBackground(new java.awt.Color(204, 204, 204));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(new javax.swing.border.MatteBorder(null));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 80, 43));

        errorLabel.setBackground(new java.awt.Color(255, 0, 0));
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorLabel.setText("errorLabel");
        jPanel1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 163, -1));
        jPanel1.add(availabilityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 213, 29));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Availability:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        errorLabel2.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel2.setText("jLabel8");
        jPanel1.add(errorLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        classficationCombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classficationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Applied Sciences", "Computer And Technology", "Philosophy", "Natural Science", "Law", "Medical", "Science And Mathematics", "Arts", "Language" }));
        classficationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classficationComboActionPerformed(evt);
            }
        });
        jPanel1.add(classficationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 213, 29));

        label.setForeground(new java.awt.Color(255, 0, 0));
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background.png"))); // NOI18N
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 540));

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
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Book book = new Book();
        try {
            if (availabilityField.getText().matches("[a-zA-Z]+") && !availabilityField.getText().isEmpty()) {
                errorLabel3.setVisible(true);
                errorLabel3.setText("Availability must be a number");
            } else {
                errorLabel3.setVisible(false);
            }
        } catch (NumberFormatException ex) {
        }
        if (isbnTextField.getText().matches("[a-zA-Z]+") && !isbnTextField.getText().isEmpty()) {
            errorLabel.setVisible(true);
            errorLabel.setText("ISBN must be all number");
        } else {
            errorLabel.setVisible(false);
        }
        if (titleTextField.getText().isEmpty() || isbnTextField.getText().isEmpty() || authorTextField.getText().isEmpty() || availabilityField.getText().isEmpty()) {
            errorLabel2.setVisible(true);
            errorLabel2.setText("Please fill all the fields");
        } else {
            errorLabel2.setVisible(false);
            try {
                boolean isAdded = book.addBook(id, isbnTextField.getText(), titleTextField.getText(), authorTextField.getText(), classficationCombo.getSelectedItem().toString(), Integer.parseInt(availabilityField.getText()));
                if (isAdded) {
                    JOptionPane.showMessageDialog(null, "The Book is Added Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "The Book Already Exists");
                }
            } catch (NumberFormatException ex) {
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Book book = new Book();
        try {
            if (availabilityField.getText().matches("[a-zA-Z]+") && !availabilityField.getText().isEmpty()) {
                errorLabel3.setVisible(true);
                errorLabel3.setText("Availability must be a number");
            } else {
                errorLabel3.setVisible(false);
            }
        } catch (NumberFormatException ex) {
        }
        if (titleTextField.getText().isEmpty() || isbnTextField.getText().isEmpty() || authorTextField.getText().isEmpty() || availabilityField.getText().isEmpty()) {
            errorLabel2.setVisible(true);
            errorLabel2.setText("Please fill all the fields");
        } else {
            errorLabel2.setVisible(false);
            try {
                boolean isAdded = book.updateBook(id, titleTextField.getText(), isbnTextField.getText(), authorTextField.getText(), classficationCombo.getSelectedItem().toString(), Integer.parseInt(availabilityField.getText()));
                errorLabel.setVisible(false);
                if (isAdded) {
                    JOptionPane.showMessageDialog(null, "The Book is Updated Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "The Book Is Not Updated");
                }
                if (isbnTextField.getText().equals(" ") || titleTextField.getText().equals(" ") || authorTextField.getText().equals(" ") || availabilityField.getText().equals(" ")) {
                    errorLabel2.setVisible(true);
                    errorLabel2.setText("Please fill all the fields");
                }
            } catch (NumberFormatException ex) {
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void classficationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classficationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classficationComboActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Search search = new Search(id);
        search.show();
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
            java.util.logging.Logger.getLogger(ManageBook.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JTextField availabilityField;
    private javax.swing.JComboBox<String> classficationCombo;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel errorLabel2;
    private javax.swing.JLabel errorLabel3;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
