package kelompok5.cafemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Items extends javax.swing.JFrame {

    public Items() {
        initComponents();
        showProducts();
    }
    
    ResultSet rs = null,rs1 = null;
    Connection con = null;
    Statement st = null,st1 = null;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tb_nama_produk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tb_harga_produk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kategori_produk_cb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        filter_item = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_produk = new javax.swing.JTable();
        RefreshBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel4.setText("LIST PRODUCT");

        tb_nama_produk.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tb_nama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_nama_produkActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("Kategori");

        tb_harga_produk.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tb_harga_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_harga_produkActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setText("Nama Produk");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setText("Harga");

        kategori_produk_cb.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        kategori_produk_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuman", "Snack", "Dessert" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel8.setText("PRODUCT MANAGEMENT");

        filter_item.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        filter_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuman", "Snack", "Dessert" }));
        filter_item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filter_itemItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel9.setText("Filter :");

        AddBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        list_produk.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        list_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Produk", "Kategori", "Harga"
            }
        ));
        list_produk.setRowHeight(29);
        list_produk.setShowHorizontalLines(true);
        list_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_produkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list_produk);

        RefreshBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        RefreshBtn.setText("REFRESH");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(filter_item, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(251, 251, 251))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tb_nama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(kategori_produk_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(tb_harga_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(264, 264, 264)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_nama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategori_produk_cb)
                    .addComponent(tb_harga_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filter_item)
                    .addComponent(jLabel9)
                    .addComponent(RefreshBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(562, Short.MAX_VALUE)))
        );

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setText("Produk");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton2.setText("Detail Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addGap(303, 303, 303)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int id_produk;
    
    private void countProducts()
    {
        try
        {
            st1 = con.createStatement();
            rs1 = st1.executeQuery("SELECT MAX (id_produk) FROM product");
            rs1.next();
            id_produk = rs1.getInt(1)+1;
        }
        catch (Exception e)
        {
                    
        }        
    }
    
    private void showProducts() 
    {
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagement", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM product");

            DefaultTableModel model = new DefaultTableModel();

            java.sql.ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) 
            {
                model.addColumn(metaData.getColumnLabel(columnIndex));
            }

            while (rs.next()) 
            {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            list_produk.setModel(model);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    private void filterProducts() 
    {
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagement", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM product WHERE kategori_produk = '" + filter_item.getSelectedItem().toString() + "'");

            DefaultTableModel model = new DefaultTableModel();

            java.sql.ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) 
            {
                model.addColumn(metaData.getColumnLabel(columnIndex));
            }

            while (rs.next()) 
            {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            list_produk.setModel(model);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
    private void tb_nama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_nama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_nama_produkActionPerformed

    private void tb_harga_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_harga_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_harga_produkActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
    if (tb_nama_produk.getText().isEmpty() || tb_harga_produk.getText().isEmpty() || kategori_produk_cb.getSelectedIndex() == -1) 
    {
        JOptionPane.showMessageDialog(this, "Missing Information!");
    } 
    else 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagement", "root", "");
                 PreparedStatement pst = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?)")) 
            {
                countProducts();
                pst.setInt(1, id_produk);
                pst.setString(2, tb_nama_produk.getText());
                pst.setString(3, kategori_produk_cb.getSelectedItem().toString());
                pst.setInt(4, Integer.parseInt(tb_harga_produk.getText()));

                int row = pst.executeUpdate();
                if (row > 0) 
                    {
                        JOptionPane.showMessageDialog(this, "Item Berhasil Ditambahkan");
                        con.close();
                        showProducts();
                    } 
                else 
                    {
                        JOptionPane.showMessageDialog(this, "Gagal Menambahkan Item");
                    }

                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(this, "SQL Exception: " + ex.getMessage());
                }
            } 
            catch (ClassNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(this, "Class not found: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if (tb_nama_produk.getText().isEmpty() || tb_harga_produk.getText().isEmpty() || kategori_produk_cb.getSelectedIndex() == -1) 
    {
        JOptionPane.showMessageDialog(this, "Missing Information!");
    } 
    else 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagement", "root", "");
                 PreparedStatement pst = con.prepareStatement("UPDATE product SET nama_produk=?,kategori_produk=?,harga=? WHERE id_produk=?")) 
            {
                countProducts();
                pst.setInt(4, key);
                pst.setString(1, tb_nama_produk.getText());
                pst.setString(2, kategori_produk_cb.getSelectedItem().toString());
                pst.setInt(3, Integer.parseInt(tb_harga_produk.getText()));

                int row = pst.executeUpdate();
                if (row > 0) 
                    {
                        JOptionPane.showMessageDialog(this, "Item Berhasil DiEdit");
                        con.close();
                        showProducts();
                    } 
                else 
                    {
                        JOptionPane.showMessageDialog(this, "Gagal Mengedit Item");
                    }

                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(this, "SQL Exception: " + ex.getMessage());
                }
            } 
            catch (ClassNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(this, "Class not found: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
    if (tb_nama_produk.getText().isEmpty() || tb_harga_produk.getText().isEmpty() || kategori_produk_cb.getSelectedIndex() == -1) 
    {
        JOptionPane.showMessageDialog(this, "Missing Information!");
    } 
    else 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagement", "root", "");
                 PreparedStatement pst = con.prepareStatement("DELETE FROM product WHERE id_produk = ?")) 
            {
                countProducts();
                pst.setInt(1, key);

                int row = pst.executeUpdate();
                if (row > 0) 
                    {
                        JOptionPane.showMessageDialog(this, "Item Berhasil Dihapus");
                        con.close();
                        showProducts();
                    } 
                else 
                    {
                        JOptionPane.showMessageDialog(this, "Gagal Menghapus Item");
                    }

                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(this, "SQL Exception: " + ex.getMessage());
                }
            } 
            catch (ClassNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(this, "Class not found: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed
    
    int key = 0;
    private void list_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_produkMouseClicked
        DefaultTableModel model = (DefaultTableModel) list_produk.getModel();
        int myindex = list_produk.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(myindex, 0).toString());
        tb_nama_produk.setText(model.getValueAt(myindex, 1).toString());
        //kategori_produk_cb.setText(model.getValueAt(myindex, 2).toString());
        tb_harga_produk.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_list_produkMouseClicked

    private void filter_itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filter_itemItemStateChanged
        filterProducts();
    }//GEN-LAST:event_filter_itemItemStateChanged

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
       showProducts();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Items().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ViewSells().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JComboBox<String> filter_item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategori_produk_cb;
    private javax.swing.JTable list_produk;
    private javax.swing.JTextField tb_harga_produk;
    private javax.swing.JTextField tb_nama_produk;
    // End of variables declaration//GEN-END:variables
}
