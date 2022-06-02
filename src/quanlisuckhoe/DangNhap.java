/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import object.TaiKhoan;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import object.ReadWriteObject;
/**
 *
 * @author duongv
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    ArrayList<TaiKhoan> tk = new ArrayList<TaiKhoan>();
    ReadWriteObject rw = new ReadWriteObject();
    
    public DangNhap() throws IOException {
        initComponents();
        getTK();
        
    }
    public void getTK() throws IOException
    {
//        TaiKhoan a1 = new TaiKhoan("TK01","Admin","123",2);
//        TaiKhoan a2 = new TaiKhoan("TK02","GV01","123",1);
//        TaiKhoan a3 = new TaiKhoan("TK03","SV01","123",0);
//        tk.add(a1);
//        tk.add(a2);
//        tk.add(a3);
        try {
            tk = (ArrayList<TaiKhoan>) rw.ReadObject("src\\data\\TaiKhoan.txt");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "danh sach hien tai rong");
        }
    }
    
    public int checkTK(String name, String pass)
    {
        for(TaiKhoan t : tk)
        {
        if(t.getTenDangNhap().equals(name) && t.getMatKhau().equals(pass))
            {
                return t.getVaiTro();
            }
        }
        return -1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTroGiup = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên đăng nhập");

        jLabel2.setText("Mật khẩu");

        tf_name.setText("Tên đăng nhập");

        tf_pass.setText("Mật khẩu");

        bt_login.setText("Đăng nhập");
        bt_login.setToolTipText("");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jButton2.setText("Quên mật khẩu?");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tf_name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        m_gvTroGiup.setText("Trợ Giúp");

        jMenuItem1.setText("Liên hệ");
        m_gvTroGiup.add(jMenuItem1);

        jMenuItem2.setText("Thông tin ứng dụng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        m_gvTroGiup.add(jMenuItem2);

        menu_gv.add(m_gvTroGiup);

        setJMenuBar(menu_gv);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        // TODO add your handling code here:
        String name = tf_name.getText();
        String pass = tf_pass.getText();
            if (name == "" || pass == "") {
                JOptionPane.showMessageDialog(null, "Hãy nhập đầy đủ thông tin đăng nhập!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            } else{
                int vaitro = checkTK(name, pass);
                if(vaitro == -1)
                {
                    JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }else if(vaitro == 0)
                            {
                                TrangChuSinhVien frame = new TrangChuSinhVien();
                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                Container contentPane = frame.getContentPane();
                                frame.setVisible(true);
                            }else if(vaitro == 1)
                            {
                                TrangChuGiaoVien frame = new TrangChuGiaoVien();
                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                Container contentPane = frame.getContentPane();
                                frame.setVisible(true);
                            }else if(vaitro == 2)
                            {
                                TrangChuNguoiQuanTri frame = new TrangChuNguoiQuanTri();
                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                Container contentPane = frame.getContentPane();
                                frame.setVisible(true);
                            }else{
                                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra, hãy liên hệ Admin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                            }
                
            }
    
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_loginMouseClicked

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DangNhap().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu m_gvTroGiup;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_pass;
    // End of variables declaration//GEN-END:variables
}
