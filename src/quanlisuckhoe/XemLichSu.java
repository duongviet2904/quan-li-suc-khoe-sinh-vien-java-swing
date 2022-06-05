/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;


import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import object.DocGhi;
import object.DonKBYTGiaoVien;
import object.DonKBYTSinhVien;
import object.DonXinNghiGV;
import object.DonXinNghiSV;
import object.GiaoVien;
import object.Khoa;
import object.LichSu;
import object.LopHoc;
import object.SinhVien;
import table.TableLichSu;

/**
 *
 * @author reis
 */
public class XemLichSu extends javax.swing.JFrame {

    /**
     * Creates new form XemLichSu
     */
//    private Object s = new SinhVien("SV01", "Nguyễn Minh Anh", "Nữ", "012345678", "abc@gmail.com", "2001-01-16", "L01");
//    private Object s = new GiaoVien("GV01", "Nguyễn Văn Mạnh", "K01");

    
    private Object s;
    private SinhVien sv;
    private GiaoVien gv;
    private int vaitro = -1;
    private int tongLS;
    ArrayList<LichSu> ls = new ArrayList<>();
    int dong = -1;
    public XemLichSu() {
        System.out.println(vaitro);
        initComponents();
        getLichSu();
        table_ls.setModel(new TableLichSu(ls));
    }
    public XemLichSu(int vt) {
        this.vaitro = vt;
        System.out.println(vaitro);
        initComponents();
        getLichSu();
        table_ls.setModel(new TableLichSu(ls));
    }
    public XemLichSu(Object s, int vt) {
        this.s = s;
        this.vaitro = vt;
        System.out.println(vaitro);
        initComponents();
        convertObj();
        getLichSu();
        table_ls.setModel(new TableLichSu(ls));
        
    }
    public void convertObj()
    {
        if(vaitro == 0)
        {
            sv = (SinhVien)s;
        }
        if(vaitro == 1)
        {
            gv = (GiaoVien)s;
        }
    }
    public int getVaitro() {
        return vaitro;
    }

    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }
    
    public Object getSv() {
        return s;
    }

    public void setSv(Object s) {
        this.s = s;
    }
    

    public void getLichSu()
    {
        DocGhi rw = new DocGhi();
        try {
            
            ArrayList<LichSu> DSLS = (ArrayList<LichSu>) rw.ReadObject("./src/data/LichSu.txt");
            tongLS=DSLS.size();
            for(LichSu l : DSLS)
            {
                if(vaitro == 0){
                    if(l.getTaiKhoan().equals(sv.getMaSV()))
                    {
                        ls.add(l);
                    }
                }else if(vaitro == 1){
                    if(l.getTaiKhoan().equals(gv.getMaGV()))
                    {
                        ls.add(l);
                    }
                }
                else if(vaitro == 2){
                    if(l.getTaiKhoan().equals("Admin"))
                    {
                        ls.add(l);
                    }
                }
            
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    public Image getAnh()
    {
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/images/logo.png");
        return icon;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_ls = new javax.swing.JTable();
        bt_chitiet = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lịch sử hoạt động");
        setBackground(new java.awt.Color(250, 250, 250));
        setIconImage(getAnh());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Lịch sử hoạt động");

        table_ls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_lsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_ls);

        bt_chitiet.setText("Đóng");
        bt_chitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chitietActionPerformed(evt);
            }
        });

        m_gvTrangChu.setText("Trang Chủ");
        m_gvTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvTrangChuMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvTrangChu);

        setJMenuBar(menu_gv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(bt_chitiet)))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE)
                .addComponent(bt_chitiet)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(65, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(78, 78, 78)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_gvTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTrangChuMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_m_gvTrangChuMouseClicked

    private void bt_chitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_chitietActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_chitietActionPerformed

    private void table_lsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_lsMouseClicked
        // TODO add your handling code here:
        dong = table_ls.getSelectedRow();
        if(table_ls.getValueAt(dong, 4).equals("Có thể xem lại"))
        {
            
        
        if(dong != -1){
            LichSu l = ls.get(dong);
            if(vaitro == 0){
            if(l.getNoiDung().equals("Khai báo y tế"))
            {
                DonKBYTSinhVien d = new DonKBYTSinhVien();
                d = (DonKBYTSinhVien) l.getChiTiet();
                System.out.println(d.toString());
                SVKhaiBaoChiTiet frame = new SVKhaiBaoChiTiet(d);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
            }
            if(l.getNoiDung().equals("Xin nghỉ"))
            {
                DonXinNghiSV d = new DonXinNghiSV();
                d = (DonXinNghiSV) l.getChiTiet();
                System.out.println(d.toString());
                SVXinNghiChiTiet frame = new SVXinNghiChiTiet(d);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
            }
            }else if(vaitro == 1){
            if(l.getNoiDung().equals("Khai báo y tế"))
            {
                DonKBYTGiaoVien d = new DonKBYTGiaoVien();
                d = (DonKBYTGiaoVien) l.getChiTiet();
//                System.out.println(d.toString());
                GVKhaiBaoChiTiet frame = new GVKhaiBaoChiTiet(d);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
            }
            if(l.getNoiDung().equals("Xin nghỉ"))
            {
                DonXinNghiGV d = new DonXinNghiGV();
                d = (DonXinNghiGV) l.getChiTiet();
//                System.out.println(d.toString());
                GVNghiChiTiet frame = new GVNghiChiTiet(d);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
            }
            }else if(vaitro == 2){
            
            }
            
            
//        sv = dsSV.get(dong);
//        txtMaSV.setText(sv.getMasv()+"");
//        txtHoTen.setText(sv.getHoten()+"");
//        cbMaLop.setSelectedItem(sv.getMalop());
//        txtDiem1.setText(sv.getDiem1()+"");
//        txtDiem2.setText(sv.getDiem2()+"");
//        txtDiemTB.setText(sv.getDiemtb()+"");
//        txtKetQua.setText(sv.getKetqua()+"");
        }
        }
    }//GEN-LAST:event_table_lsMouseClicked

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
            java.util.logging.Logger.getLogger(XemLichSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemLichSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemLichSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemLichSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemLichSu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_chitiet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JTable table_ls;
    // End of variables declaration//GEN-END:variables
}
