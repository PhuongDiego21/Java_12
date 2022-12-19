/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldatphongks.Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static qldatphongks.Connection.getConnection;
import qldatphongks.Tiennghi;

/**
 *
 * @author Admin
 */
public class Tiennghi_form extends javax.swing.JFrame {

    /**
     * Creates new form Tiennghi_form
     */
    public Tiennghi_form() {
        initComponents();
        getConnection();
        hienThiDanhSachTiennghi();
    }

    Connection con = null;
    Statement st = null;

    public ArrayList<Tiennghi> layDanhSachTiennghi() {
        ArrayList<Tiennghi> dstn = new ArrayList<>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM Tiennghi";
            // Thực thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            Tiennghi tn;
            while (rs.next()) {
                tn = new Tiennghi(rs.getString("Matn"), rs.getString("Tentn"), rs.getDouble("Giatn"));

                //Thêm vào danh sách
                dstn.add(tn);
            }
        } catch (SQLException ex) {
        }
        return dstn;
    }

    public void hienThiDanhSachTiennghi() {
        String colTieuDe1[] = new String[]{"Mã tiện nghi", "Tên tiện nghi", "Giá tiện nghi"};
        ArrayList<Tiennghi> dstn = layDanhSachTiennghi();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dstn.size(); i++) {

            row = new Object[3];

            // GÃ�N GIÃ� TRá»Š
            row[0] = dstn.get(i).getMatn();
            row[1] = dstn.get(i).getTentn();
            row[2] = dstn.get(i).getGiatn();

            model.addRow(row);
        }
        Tabletiennghi.setModel(model);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        lbtiennghi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabletiennghi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtmatn = new javax.swing.JTextField();
        txttentn = new javax.swing.JTextField();
        txtgiatn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnthemtn = new javax.swing.JButton();
        btnsuatn = new javax.swing.JButton();
        btnxoatn = new javax.swing.JButton();
        btnnhaplaitn = new javax.swing.JButton();
        btnthoattn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BẢNG TIỆN NGHI");

        lbtiennghi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbtiennghi.setText("TIỆN NGHI");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabletiennghi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tiện nghi", "Tên tiện nghi", "Giá tiện nghi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabletiennghi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabletiennghiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabletiennghi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mã tiện nghi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Tên tiện nghi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Giá tiện nghi");

        btnthemtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnthemtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\29.PNG")); // NOI18N
        btnthemtn.setText("Thêm");
        btnthemtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemtnActionPerformed(evt);
            }
        });

        btnsuatn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsuatn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\24.PNG")); // NOI18N
        btnsuatn.setText("Sửa");
        btnsuatn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuatnActionPerformed(evt);
            }
        });

        btnxoatn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnxoatn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\26.PNG")); // NOI18N
        btnxoatn.setText("Xóa");
        btnxoatn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoatnActionPerformed(evt);
            }
        });

        btnnhaplaitn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnnhaplaitn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\27.PNG")); // NOI18N
        btnnhaplaitn.setText("Nhập lại");
        btnnhaplaitn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhaplaitnActionPerformed(evt);
            }
        });

        btnthoattn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnthoattn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\28.PNG")); // NOI18N
        btnthoattn.setText("Thoát");
        btnthoattn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoattnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmatn, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txttentn)
                            .addComponent(txtgiatn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnthemtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsuatn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoatn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnhaplaitn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthoattn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmatn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttentn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgiatn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnthoattn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoatn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsuatn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnthemtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnhaplaitn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lbtiennghi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtiennghi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemtnActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
            st = (Statement) con.createStatement();
            String query = "INSERT INTO Tiennghi(Matn,Tentn, Giatn) VALUES('" + txtmatn.getText() + "',"
                    + "'" + txttentn.getText() + "','" + txtgiatn.getText() + "')";

            st.execute(query);
            hienThiDanhSachTiennghi();

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnthemtnActionPerformed

    private void btnsuatnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuatnActionPerformed
        // TODO add your handling code here:
         if (Tabletiennghi.getSelectedRow() == -1) {
            if (Tabletiennghi.getRowCount() == 0) {
               lbtiennghi.setText("Table is empty");
            } else {
                 lbtiennghi.setText("You must choose a service");
            }
        } else {
            DefaultTableModel model = (DefaultTableModel) Tabletiennghi.getModel();
            model.setValueAt(txtmatn.getText(), Tabletiennghi.getSelectedRow(), 0);
            model.setValueAt(txttentn.getText(), Tabletiennghi.getSelectedRow(), 1);
            model.setValueAt(txtgiatn.getText(), Tabletiennghi.getSelectedRow(), 2);
            
        }
    }//GEN-LAST:event_btnsuatnActionPerformed

    private void btnxoatnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoatnActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
            st = (Statement) con.createStatement();
            String query = "DELETE FROM Tiennghi WHERE Matn = '" + txtmatn.getText() + "'";
            st.executeUpdate(query);
            hienThiDanhSachTiennghi();

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnxoatnActionPerformed

    private void btnnhaplaitnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhaplaitnActionPerformed
        // TODO add your handling code here:
        txtmatn.setText("");
        txttentn.setText("");
        txtgiatn.setText("");
        txtmatn.requestFocus();
    }//GEN-LAST:event_btnnhaplaitnActionPerformed

    private void btnthoattnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoattnActionPerformed
        // TODO add your handling code here:
         btnthoattn.setToolTipText("Ấn thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát bảng"
                + " tiện nghi", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_btnthoattnActionPerformed

    private void TabletiennghiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabletiennghiMouseClicked
        // TODO add your handling code here:
         int i = Tabletiennghi.getSelectedRow();
        TableModel model = Tabletiennghi.getModel();
        txtmatn.setText(model.getValueAt(i, 0).toString());
        txttentn.setText(model.getValueAt(i, 1).toString());
        txtgiatn.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_TabletiennghiMouseClicked

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
            java.util.logging.Logger.getLogger(Tiennghi_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiennghi_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiennghi_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiennghi_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tiennghi_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabletiennghi;
    private javax.swing.JButton btnnhaplaitn;
    private javax.swing.JButton btnsuatn;
    private javax.swing.JButton btnthemtn;
    private javax.swing.JButton btnthoattn;
    private javax.swing.JButton btnxoatn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtiennghi;
    private javax.swing.JTextField txtgiatn;
    private javax.swing.JTextField txtmatn;
    private javax.swing.JTextField txttentn;
    // End of variables declaration//GEN-END:variables
}