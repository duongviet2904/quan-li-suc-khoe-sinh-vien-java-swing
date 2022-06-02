/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author ducth
 */
public class SVXinNghi extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SVXinNghi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_ngay = new javax.swing.JTextField();
        tieude_ngay6 = new javax.swing.JLabel();
        bt_gui = new javax.swing.JButton();
        bt_file = new javax.swing.JButton();
        tieude_ngaybd = new javax.swing.JLabel();
        file_name = new javax.swing.JLabel();
        tieude_masv = new javax.swing.JLabel();
        text_ngaybd = new javax.swing.JTextField();
        tieude_khoa1 = new javax.swing.JLabel();
        tieude_tensv = new javax.swing.JLabel();
        tieude_ngay3 = new javax.swing.JLabel();
        text_lop = new javax.swing.JTextField();
        tieude_khoa = new javax.swing.JLabel();
        text_ngaykt = new javax.swing.JTextField();
        tieude = new javax.swing.JLabel();
        tieude_ngay4 = new javax.swing.JLabel();
        text_tensv = new javax.swing.JTextField();
        cb_lydo = new javax.swing.JComboBox<>();
        tieude_ngay = new javax.swing.JLabel();
        tieude_ngay5 = new javax.swing.JLabel();
        text_msv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_chitiet = new javax.swing.JTextArea();
        text_khoa = new javax.swing.JTextField();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();
        m_gvTroGiup = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_ngay.setEditable(false);
        text_ngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ngayActionPerformed(evt);
            }
        });

        tieude_ngay6.setText("Các tài liệu/hình ảnh liên quan:");

        bt_gui.setText("Gửi");
        bt_gui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guiMouseClicked(evt);
            }
        });
        bt_gui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guiActionPerformed(evt);
            }
        });

        bt_file.setText("Chọn file");
        bt_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fileActionPerformed(evt);
            }
        });

        tieude_ngaybd.setText("Ngày bắt đầu");

        file_name.setText("No file selected");

        tieude_masv.setText("Mã sinh viên");

        text_ngaybd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ngaybdActionPerformed(evt);
            }
        });

        tieude_khoa1.setText("Lớp");

        tieude_tensv.setText("Tên sinh viên");

        tieude_ngay3.setText("Ngày kết thúc");

        text_lop.setEditable(false);
        text_lop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_lopActionPerformed(evt);
            }
        });

        tieude_khoa.setText("Khoa");

        text_ngaykt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ngayktActionPerformed(evt);
            }
        });

        tieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tieude.setText("Đơn Xin Nghỉ Phép");

        tieude_ngay4.setText("Lý do xin nghỉ");

        text_tensv.setEditable(false);
        text_tensv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tensvActionPerformed(evt);
            }
        });

        cb_lydo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ốm nhập viện", "Việc cá nhân", "Mắc Covid-19", "Khác" }));
        cb_lydo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lydoActionPerformed(evt);
            }
        });

        tieude_ngay.setText("Ngày gửi");

        tieude_ngay5.setText("Mô tả chi tiết:");

        text_msv.setEditable(false);
        text_msv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_msvActionPerformed(evt);
            }
        });

        text_chitiet.setColumns(20);
        text_chitiet.setRows(5);
        jScrollPane1.setViewportView(text_chitiet);

        text_khoa.setEditable(false);
        text_khoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_khoaActionPerformed(evt);
            }
        });

        m_gvTrangChu.setText("Trang Chủ");
        m_gvTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvTrangChuMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvTrangChu);

        m_gvTroGiup.setText("Trợ Giúp");
        menu_gv.add(m_gvTroGiup);

        setJMenuBar(menu_gv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tieude_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(text_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tieude_khoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tieude_ngay5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135)
                                        .addComponent(tieude_ngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_ngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_lop, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(tieude_ngay3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_ngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(tieude, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tieude_ngay6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(bt_file)))
                        .addGap(5, 5, 5)
                        .addComponent(file_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(bt_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(tieude_ngay4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(cb_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(272, 272, 272)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tieude_masv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text_msv, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tieude_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(tieude_ngay)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_ngay)
                            .addComponent(text_khoa, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tieude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tieude_ngay)
                    .addComponent(text_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tieude_masv)
                    .addComponent(text_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieude_khoa)
                            .addComponent(text_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(tieude_tensv))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tieude_khoa1)
                            .addComponent(text_lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tieude_ngay5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tieude_ngaybd)
                        .addComponent(text_ngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieude_ngay3)
                            .addComponent(text_ngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tieude_ngay4)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tieude_ngay6))
                    .addComponent(bt_file)
                    .addComponent(file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(bt_gui)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_ngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ngayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ngayActionPerformed

    private void bt_guiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_guiActionPerformed

    private void bt_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fileActionPerformed
        // TODO add your handling code here:
        // if the user presses the save button show the save dialog
        // if the user presses the save button show the save dialog
        String com = evt.getActionCommand();

        if (com.equals("Gửi")) {
            // create an object of JFileChooser class
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

            // allow multiple file selection
            j.setMultiSelectionEnabled(true);

            // invoke the showsSaveDialog function to show the save dialog
            int r = j.showSaveDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                // get the selelcted files
                File files[] = j.getSelectedFiles();

                int t = 0;
                // set text to blank
                file_name.setText("");

                // set the label to the path of the selected files
                while (t++ < files.length)
                file_name.setText(file_name.getText() + "; " + files[t - 1].getName());
            }
            // if the user cancelled the operation
            else
            file_name.setText("the user cancelled the operation");
        }

        // if the user presses the open dialog show the open dialog
        else {
            // create an object of JFileChooser class
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

            // allow multiple file selection
            j.setMultiSelectionEnabled(true);

            // invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                // get the selelcted files
                File files[] = j.getSelectedFiles();

                // set text to blank
                file_name.setText("");

                int t = 0;
                // set the label to the path of the selected files
                while (t++ < files.length)
                file_name.setText(file_name.getText() + " " + files[t - 1].getName());
            }
            // if the user cancelled the operation
            else
            file_name.setText("the user cancelled the operation");
        }
    }//GEN-LAST:event_bt_fileActionPerformed

    private void text_ngaybdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ngaybdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ngaybdActionPerformed

    private void text_lopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_lopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_lopActionPerformed

    private void text_ngayktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ngayktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ngayktActionPerformed

    private void text_tensvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tensvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tensvActionPerformed

    private void cb_lydoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lydoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_lydoActionPerformed

    private void text_msvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_msvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_msvActionPerformed

    private void text_khoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_khoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_khoaActionPerformed

    private void m_gvTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTrangChuMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_m_gvTrangChuMouseClicked

    private void bt_guiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guiMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_guiMouseClicked

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
            java.util.logging.Logger.getLogger(SVXinNghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SVXinNghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SVXinNghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SVXinNghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SVXinNghi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_file;
    private javax.swing.JButton bt_gui;
    private javax.swing.JComboBox<String> cb_lydo;
    private javax.swing.JLabel file_name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenu m_gvTroGiup;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JTextArea text_chitiet;
    private javax.swing.JTextField text_khoa;
    private javax.swing.JTextField text_lop;
    private javax.swing.JTextField text_msv;
    private javax.swing.JTextField text_ngay;
    private javax.swing.JTextField text_ngaybd;
    private javax.swing.JTextField text_ngaykt;
    private javax.swing.JTextField text_tensv;
    private javax.swing.JLabel tieude;
    private javax.swing.JLabel tieude_khoa;
    private javax.swing.JLabel tieude_khoa1;
    private javax.swing.JLabel tieude_masv;
    private javax.swing.JLabel tieude_ngay;
    private javax.swing.JLabel tieude_ngay3;
    private javax.swing.JLabel tieude_ngay4;
    private javax.swing.JLabel tieude_ngay5;
    private javax.swing.JLabel tieude_ngay6;
    private javax.swing.JLabel tieude_ngaybd;
    private javax.swing.JLabel tieude_tensv;
    // End of variables declaration//GEN-END:variables
}