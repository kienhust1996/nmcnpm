/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import daoImpl.IReceptionImpl;
import daoImpl.IReservationImpl;
import daoImpl.IRoomImpl;
import daoImpl.IRoomTypeImpl;
import entities.Reception;
import entities.Reservation;
import entities.RoomType;
import entities._Account;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ICHIGEKI
 */
public class Phong extends javax.swing.JFrame {

    /**
     * Creates new form FARoom
     */
    public Phong() {
        initComponents();
        initData();
        lockField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtRoomNoS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbRoomType = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDes = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grView = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "TÌM PHÒNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        txtRoomNoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNoSActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("SỐ PHÒNG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(txtRoomNoS, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomNoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "PHÒNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(618, 186));

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("MÔ TẢ");

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("LOẠI PHÒNG");

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("SỐ PHÒNG");

        txtaDes.setColumns(20);
        txtaDes.setRows(5);
        jScrollPane1.setViewportView(txtaDes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomNo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(618, 169));

        grView.setAutoCreateRowSorter(true);
        grView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room No.", "Type", "Status", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grView.getTableHeader().setReorderingAllowed(false);
        grView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grView);
        if (grView.getColumnModel().getColumnCount() > 0) {
            grView.getColumnModel().getColumn(0).setMinWidth(0);
            grView.getColumnModel().getColumn(0).setPreferredWidth(0);
            grView.getColumnModel().getColumn(0).setMaxWidth(0);
            grView.getColumnModel().getColumn(3).setMinWidth(0);
            grView.getColumnModel().getColumn(3).setPreferredWidth(0);
            grView.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(178, 208, 254));

        btnSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnSearch.setText("TÌM KIẾM");
        btnSearch.setPreferredSize(new java.awt.Dimension(90, 43));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.setText("THÊM");
        btnAdd.setPreferredSize(new java.awt.Dimension(90, 43));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdate.setText("SỬA");
        btnUpdate.setPreferredSize(new java.awt.Dimension(90, 43));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 153, 255));
        btnDelete.setText("XÓA");
        btnDelete.setPreferredSize(new java.awt.Dimension(90, 43));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 153, 255));
        btnReset.setText("CẬP NHẬT");
        btnReset.setPreferredSize(new java.awt.Dimension(90, 43));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 153, 255));
        btnBack.setText("BACK");
        btnBack.setPreferredSize(new java.awt.Dimension(90, 43));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String name = txtRoomNoS.getText();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập số phòng");
            txtRoomNoS.requestFocus();
        } else if (!Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE).matcher(name).matches()) {
            JOptionPane.showMessageDialog(null, "Số phòng phải là chữ số");
            txtRoomNoS.requestFocus();
        } else {
            rs.setRowFilter(RowFilter.regexFilter(name, 1));
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        rs.setRowFilter(RowFilter.regexFilter("", 0));
        txtRoomNoS.setText("");
        txtRoomNo.setText("");
        cbbRoomType.setSelectedIndex(0);
        txtaDes.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (btnStt) {
            String no = txtRoomNo.getText();
            String type = (String) cbbRoomType.getSelectedItem();
            String desc = txtaDes.getText();
            if (!Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE).matcher(no).matches()) {
                JOptionPane.showMessageDialog(null, "Số phòng phải là chữ số");
                txtRoomNo.requestFocus();
                return;
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).toString() == no) {
                    JOptionPane.showMessageDialog(null, "Số phòng đã tồn tại");
                    txtRoomNo.requestFocus();
                    return;
                }
            }
            entities.Room a = new entities.Room(0, Integer.parseInt(no), getType(type), 1, desc);
            new IRoomImpl().insert(a);
            model.setRowCount(0);
            initData();
            unlockBtn();
            btnResetActionPerformed(evt);
            btnStt = false;
        } else {
            lockBtn(btnAdd);
            btnStt = true;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (grView.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Chọn phòng để xóa");
            return;
        }
        for (Reception r : new IReceptionImpl().getList()) {
            if ((Integer) grView.getValueAt(grView.getSelectedRow(), 0) == r.getRoomID()) {
                JOptionPane.showMessageDialog(null, "Không thể xóa");
                return;
            }
        }
        for (Reservation rs : new IReservationImpl().getList()) {
            if (rs.getExpectedRoom().length() == 1) {
                if (grView.getValueAt(grView.getSelectedRow(), 0).toString().equals(rs.getExpectedRoom())) {
                    JOptionPane.showMessageDialog(null, "Không thể xóa");
                    return;
                }
            } else {
                for (String s : rs.getExpectedRoom().split(" ")) {
                    if (grView.getValueAt(grView.getSelectedRow(), 0).toString().equals(s)) {
                        JOptionPane.showMessageDialog(null, "Không thể xóa");
                        return;
                    }
                }
            }
        }
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa", "Xác nhận", JOptionPane.YES_NO_OPTION) == 0) {
            new IRoomImpl().delete((Integer) grView.getValueAt(grView.getSelectedRow(), 0));
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            model.setRowCount(0);
            initData();
        } else {
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (btnStt) {
            rs.setRowFilter(RowFilter.regexFilter("", 0));
            txtRoomNoS.setText("");
            txtRoomNo.setText("");
            cbbRoomType.setSelectedIndex(0);
            txtaDes.setText("");
            unlockBtn();
            btnStt = false;
        } else {
            GDAdmin f = new GDAdmin();
            f.setAccount(acc);
            f.setLocationRelativeTo(this);
            f.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (btnStt) {
            if (grView.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Chọn phòng để cập nhật");
                return;
            }
            int id = (int) grView.getValueAt(grView.getSelectedRow(), 0);
            String no = txtRoomNo.getText();
            String type = (String) cbbRoomType.getSelectedItem();
            String desc = txtaDes.getText();
            if (!Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE).matcher(no).matches()) {
                JOptionPane.showMessageDialog(null, "Số phòng phải là chữ số");
                txtRoomNo.requestFocus();
                return;
            }
            entities.Room a = new entities.Room(id, Integer.parseInt(no), getType(type), 1, desc);
            System.out.println(new IRoomImpl().update(a));
            model.setRowCount(0);
            initData();
            unlockBtn();
            btnResetActionPerformed(evt);
            btnStt = false;
        } else {
            lockBtn(btnUpdate);
            btnStt = true;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void grViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grViewMouseClicked
        if (btnStt && btnUpdate.isEnabled()) {
            int i = grView.getSelectedRow();
            txtRoomNo.setText(String.valueOf(grView.getValueAt(i, 1)));
            cbbRoomType.setSelectedItem(grView.getValueAt(i, 2));
            txtaDes.setText(String.valueOf(grView.getValueAt(i, 4)));
        }
    }//GEN-LAST:event_grViewMouseClicked

    private void txtRoomNoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNoSActionPerformed
        String name = txtRoomNoS.getText();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập số phòng");
            txtRoomNoS.requestFocus();
        } else if (!Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE).matcher(name).matches()) {
            JOptionPane.showMessageDialog(null, "Số phòng phải là chữ số");
            txtRoomNoS.requestFocus();
        } else {
            rs.setRowFilter(RowFilter.regexFilter(name, 1));
        }
    }//GEN-LAST:event_txtRoomNoSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phong().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbbRoomType;
    private javax.swing.JTable grView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtRoomNoS;
    private javax.swing.JTextArea txtaDes;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
    TableRowSorter<TableModel> rs;
    boolean btnStt;
    _Account acc = new _Account();

    public void setAccount(_Account aa) {
        acc = aa;
    }

    public void initData() {
        for (RoomType o : new IRoomTypeImpl().getList()) {
            cbbRoomType.addItem(o.getRoomTypeName());
        }
        model = (DefaultTableModel) grView.getModel();
        for (Vector v : new IRoomImpl().listFARoom()) {
            model.addRow(v);
        }
        rs = (TableRowSorter<TableModel>) grView.getRowSorter();
    }

    public void lockBtn(JButton a) {
        if (a == btnAdd) {
            btnSearch.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAdd.setIcon(new ImageIcon(getClass().getResource("/image/btnSave.png")));
            btnBack.setIcon(new ImageIcon(getClass().getResource("/image/btnCancel.png")));
        }
        if (a == btnUpdate) {
            btnSearch.setEnabled(false);
            btnAdd.setEnabled(false);
            btnDelete.setEnabled(false);
            txtRoomNo.setEditable(false);
            btnUpdate.setIcon(new ImageIcon(getClass().getResource("/image/btnSave.png")));
            btnBack.setIcon(new ImageIcon(getClass().getResource("/image/btnCancel.png")));
        }
        unlockField();
    }

    public void unlockBtn() {
        btnSearch.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnAdd.setEnabled(true);
        btnAdd.setIcon(new ImageIcon(getClass().getResource("/image/btnAdd.png")));
        btnBack.setIcon(new ImageIcon(getClass().getResource("/image/btnBack.png")));
        btnUpdate.setIcon(new ImageIcon(getClass().getResource("/image/btnUpdate.png")));
        lockField();
    }

    public void lockField() {
        txtRoomNo.setEditable(false);
        txtaDes.setEditable(false);
        cbbRoomType.setEnabled(false);
    }

    public void unlockField() {
        txtRoomNo.setEditable(true);
        txtaDes.setEditable(true);
        cbbRoomType.setEnabled(true);
    }

    public String getType(int i) {
        for (RoomType r : new IRoomTypeImpl().getList()) {
            if (r.getRoomTypeID() == i) {
                return r.getRoomTypeName();
            }
        }
        return null;
    }

    public int getType(String i) {
        for (RoomType r : new IRoomTypeImpl().getList()) {
            if (r.getRoomTypeName() == null ? i == null : r.getRoomTypeName().equals(i)) {
                return r.getRoomTypeID();
            }
        }
        return -1;
    }
}
