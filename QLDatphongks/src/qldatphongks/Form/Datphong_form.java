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
import qldatphongks.Datphong;
import qldatphongks.khachhang;

/**
 *
 * @author Admin
 */
public class Datphong_form extends javax.swing.JFrame {

    /**
     * Creates new form Datphong_form
     */
    public Datphong_form() {
        initComponents();
        getConnection();
        hienThiDanhSachDatphong();
    }

    Connection con = null;
    Statement st = null;

    public ArrayList<Datphong> layDanhSachDatphong() {
        ArrayList<Datphong> dsdp = new ArrayList<>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM Datphong";
            // Thực thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            Datphong dp;
            while (rs.next()) {
                dp= new Datphong(rs.getString("Madp"), rs.getString("Maph"),rs.getString("Makh"), rs.getString("Mahd"), rs.getDate("ngaythue"), rs.getDate("Ngaytra"));

                //Thêm vào danh sách
                dsdp.add(dp);
            }
        } catch (SQLException ex) {
        }
        return dsdp;
    }

    public void hienThiDanhSachDatphong() {
        String colTieuDe1[] = new String[]{"Mã đặt phòng", "Mã phòng", "Mã khách hàng","Mã hóa đơn", "Ngày thuê","Ngày trả"};
        ArrayList<Datphong> dsdp = layDanhSachDatphong();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dsdp.size(); i++) {

            row = new Object[6];

            // GÃ�N GIÃ� TRá»Š
            row[0] = dsdp.get(i).getMadp();
            row[1] = dsdp.get(i).getMaph();
            row[2] = dsdp.get(i).getMakh();
            row[3] = dsdp.get(i).getMahd();
            row[4] = dsdp.get(i).getngaythue();
            row[5] = dsdp.get(i).getngaytra();

            model.addRow(row);
        }
        Tabledatphong.setModel(model);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbdatphong = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtmadp = new javax.swing.JTextField();
        txtmaph = new javax.swing.JTextField();
        txtmakh = new javax.swing.JTextField();
        txtmahd = new javax.swing.JTextField();
        txtngaythue = new javax.swing.JTextField();
        txtngaytra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnnhaplai = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabledatphong = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BẢNG ĐẶT PHÒNG");

        lbdatphong.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbdatphong.setText("ĐẶT PHÒNG");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mã đặt phòng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Mã phòng");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Mã khách hàng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Mã hóa đơn");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Ngày thuê");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Ngày trả");

        btnthem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\29.PNG")); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\26.PNG")); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\24.PNG")); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnnhaplai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnnhaplai.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\27.PNG")); // NOI18N
        btnnhaplai.setText("Nhập lại");
        btnnhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhaplaiActionPerformed(evt);
            }
        });

        btnthoat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnthoat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\ks\\28.PNG")); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(btnthem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmadp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaph, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnxoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnhaplai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnthoat)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmadp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaythue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnxoa)
                        .addComponent(btnthoat)
                        .addComponent(btnnhaplai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnsua)
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabledatphong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đặt phòng", "Mã phòng", "Mã khách hàng", "Mã hóa đơn", "Ngày thuê", "Ngày trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabledatphong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabledatphongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabledatphong);
        if (Tabledatphong.getColumnModel().getColumnCount() > 0) {
            Tabledatphong.getColumnModel().getColumn(0).setResizable(false);
            Tabledatphong.getColumnModel().getColumn(1).setResizable(false);
            Tabledatphong.getColumnModel().getColumn(2).setResizable(false);
            Tabledatphong.getColumnModel().getColumn(3).setResizable(false);
            Tabledatphong.getColumnModel().getColumn(4).setResizable(false);
            Tabledatphong.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lbdatphong))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdatphong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String query = "INSERT INTO Datphong(Madp,Maph, Makh,Mahd,Ngaythue,Ngaytra) VALUES('" + txtmadp.getText() + "',"
                    + "'" + txtmaph.getText() + "','" + txtmakh.getText() + "','" + txtmahd.getText() +"','" + txtngaythue.getText() +"','" + txtngaytra.getText() +"')";

            st.execute(query);
            hienThiDanhSachDatphong();

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        if (Tabledatphong.getSelectedRow() == -1) {
            if (Tabledatphong.getRowCount() == 0) {
               lbdatphong.setText("Table is empty");
            } else {
                 lbdatphong.setText("You must choose a service");
            }
        } else {
            DefaultTableModel model = (DefaultTableModel) Tabledatphong.getModel();
            model.setValueAt(txtmadp.getText(), Tabledatphong.getSelectedRow(), 0);
            model.setValueAt(txtmaph.getText(), Tabledatphong.getSelectedRow(), 1);
            model.setValueAt(txtmakh.getText(), Tabledatphong.getSelectedRow(), 2);
            model.setValueAt(txtmahd.getText(), Tabledatphong.getSelectedRow(), 3);
            model.setValueAt(txtngaythue.getText(), Tabledatphong.getSelectedRow(), 4);
            model.setValueAt(txtngaytra.getText(), Tabledatphong.getSelectedRow(), 5);
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
         Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String query = "DELETE FROM Datphong WHERE Madp = '" + txtmadp.getText() + "'";
            st.executeUpdate(query);
            hienThiDanhSachDatphong();

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnnhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhaplaiActionPerformed
        // TODO add your handling code here:
        txtmadp.setText("");
        txtmaph.setText("");
        txtmakh.setText("");
        txtmahd.setText("");
        txtngaythue.setText("");
        txtngaytra.setText("");
        txtmadp.requestFocus();
    }//GEN-LAST:event_btnnhaplaiActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
         btnthoat.setToolTipText("Ấn thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát bảng"
                + " Dặt phòng", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_btnthoatActionPerformed

    private void TabledatphongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabledatphongMouseClicked
        // TODO add your handling code here:
        int i = Tabledatphong.getSelectedRow();
        TableModel model = Tabledatphong.getModel();
        txtmadp.setText(model.getValueAt(i, 0).toString());
        txtmaph.setText(model.getValueAt(i, 1).toString());
        txtmakh.setText(model.getValueAt(i, 2).toString());
        txtmahd.setText(model.getValueAt(i, 3).toString());
        txtngaythue.setText(model.getValueAt(i, 4).toString());
        txtngaytra.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_TabledatphongMouseClicked

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
            java.util.logging.Logger.getLogger(Datphong_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datphong_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datphong_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datphong_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Datphong_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabledatphong;
    private javax.swing.JButton btnnhaplai;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbdatphong;
    private javax.swing.JTextField txtmadp;
    private javax.swing.JTextField txtmahd;
    private javax.swing.JTextField txtmakh;
    private javax.swing.JTextField txtmaph;
    private javax.swing.JTextField txtngaythue;
    private javax.swing.JTextField txtngaytra;
    // End of variables declaration//GEN-END:variables
}
