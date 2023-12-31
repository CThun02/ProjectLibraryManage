/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModels.DocGia;
import Services.Impl.DocGiaService;
import Utilities.SetSize;
import java.awt.Dimension;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmQuanLyDocGia extends javax.swing.JPanel {
    final SetSize setsize = new SetSize();
    final DocGiaService service = new DocGiaService();
    static int chucNang = -1;
    static int checkIndexDocGia= 0;
    List<DocGia> _lst = service.getAll();
    
    public FrmQuanLyDocGia() {
        initComponents();
        this.seticon();
        this.loadList(_lst);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnDocGia = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        btnThem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSuaThongTin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnReset = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnLstDocGia = new javax.swing.JPanel();

        jpnDocGia.setBackground(new java.awt.Color(255, 255, 255));
        jpnDocGia.setPreferredSize(new java.awt.Dimension(780, 530));
        jpnDocGia.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel5.setBackground(new java.awt.Color(125, 200, 150));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setPreferredSize(new java.awt.Dimension(780, 50));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setPreferredSize(new java.awt.Dimension(24, 24));
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });
        jPanel5.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        txtTuKhoa.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTuKhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTuKhoa.setPreferredSize(new java.awt.Dimension(64, 24));
        txtTuKhoa.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTuKhoa.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtTuKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 174, -1));

        btnThem.setBackground(new java.awt.Color(125, 200, 150));
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 125), null, null));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel2.setText("Thêm độc giả");
        btnThem.add(jLabel2);

        jPanel5.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 100, 30));

        btnXoa.setBackground(new java.awt.Color(125, 200, 150));
        btnXoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 125), null, null));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel3.setText("Xóa độc giả");
        btnXoa.add(jLabel3);

        jPanel5.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 100, 30));

        btnSuaThongTin.setBackground(new java.awt.Color(125, 200, 150));
        btnSuaThongTin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 125), null, null));
        btnSuaThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaThongTinMouseClicked(evt);
            }
        });

        jLabel5.setText("Sửa thông tin");
        btnSuaThongTin.add(jLabel5);

        jPanel5.add(btnSuaThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 100, 30));

        btnReset.setBackground(new java.awt.Color(125, 200, 150));
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 125), null, null));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        jLabel4.setText("Reset");
        btnReset.add(jLabel4);

        jPanel5.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 30));

        jpnDocGia.add(jPanel5);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Danh sách độc giả");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        jpnDocGia.add(jPanel1);

        jScrollPane1.setBackground(new java.awt.Color(125, 200, 150));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(780, 450));

        jpnLstDocGia.setBackground(new java.awt.Color(255, 255, 255));
        jpnLstDocGia.setAutoscrolls(true);
        jpnLstDocGia.setMaximumSize(new java.awt.Dimension(880, 380));
        jpnLstDocGia.setPreferredSize(new java.awt.Dimension(780, 450));
        jpnLstDocGia.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jpnLstDocGia);

        jpnDocGia.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpnDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpnDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        String tuKhoa = txtTuKhoa.getText();
        if(tuKhoa.trim().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hoặc tên độc giả để thực hiện!");
            return;
        }
        _lst = service.getBySearch(tuKhoa);
        if(_lst.isEmpty()){
            if(jpnLstDocGia.getComponentCount() == service.getAll().size()){
                _lst = service.getAll();
            }
            JOptionPane.showMessageDialog(this, "Không tìm thấy độc giả!");
        }
        this.loadList(_lst);
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        chucNang =1;
        this.getLstFrm();
        FrmDocGia docGia = new FrmDocGia();
        docGia.setVisible(true);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaThongTinMouseClicked
        // TODO add your handling code here:
        int index = 0;
        chucNang = 0;
        this.getLstFrm();
        String ma="";
        int checkUpdate = 0;
        for (FrmDocGiaKhung frm : getLstFrm()) {
            if(frm.checkChk()){
                checkIndexDocGia = index;
                checkUpdate++;
                ma = frm.getMa();
                if(checkUpdate>1){
                    JOptionPane.showMessageDialog(this, "Vui lòng chỉ chọn 1 độc giả để sửa!");
                    return;
                }
            }
            index++;
        }
        if(checkUpdate==0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn độc giả để sửa!");
            return;
        }
        DocGia docGia = service.getByMa(ma);
        FrmDocGia docGiafrm = new FrmDocGia();
        docGiafrm.setDisplay(docGia);
        docGiafrm.setVisible(true);
        checkIndexDocGia=0;
    }//GEN-LAST:event_btnSuaThongTinMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        this.getLstFrm();
        String ma="";
        for (FrmDocGiaKhung frm : getLstFrm()) {
            if(frm.checkChk()){
                ma = frm.getMa();
                service.delete(ma);
            }
        }
        if(ma.equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn độc giả để xóa!");
            return;
        }
        this.loadList(service.getAll());
        JOptionPane.showMessageDialog(this, "Xóa thành công!");
        
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        this.loadList(service.getAll());
    }//GEN-LAST:event_btnResetMouseClicked
    
    //Hàm set icon
    private void seticon(){
        URL urlSearch = getClass().getResource("/Images/search.png");
        btnTimKiem.setIcon(setsize.setSizeAnh(urlSearch, 24, 24));
    }
    
    //hàm thêm form độc giả và set size cho form giao diện
    public static void update(FrmDocGiaKhung docGiafrm, int size){
        docGiafrm.setPreferredSize(new Dimension(350, 120));
        int index = Math.round(size/2)+1;
        jpnLstDocGia.setPreferredSize(new Dimension(WIDTH, index*126));
        jpnLstDocGia.add(docGiafrm);
        jpnLstDocGia.revalidate();
        jpnLstDocGia.repaint();
    }
    
    // hàm dùng để tải độc giả lên giao diện
    public void loadList(List<DocGia> _lst){
        jpnLstDocGia.removeAll();
        this.setSizeFrm(_lst.size());
        for (DocGia docGia : _lst) {
            FrmDocGiaKhung docGiafrm = new FrmDocGiaKhung();
            docGiafrm.setFrm(docGia.getHoTen(), docGia.getDiaChi(), docGia.getMa(), docGia.getImg());
            update(docGiafrm, _lst.size());
        }
    }
    
    //Hàm dùng để lấy toàn bộ khung trên giao diện
    public List<FrmDocGiaKhung> getLstFrm(){
        jpnLstDocGia.revalidate();
        jpnLstDocGia.repaint();
        int stt = jpnLstDocGia.getComponentCount();
        List<FrmDocGiaKhung> _lstDocGiaFrm = new ArrayList<>();
        for (int i = 0; i < stt; i++) {
            _lstDocGiaFrm.add((FrmDocGiaKhung) jpnLstDocGia.getComponent(i));
        }
        return _lstDocGiaFrm;
    }
    
    //Hàm set kích cỡ khi giao diện quá tải
    public void setSizeFrm(int i){
        int index = Math.round(i/2);
        jpnLstDocGia.setPreferredSize(new Dimension(WIDTH, index*126));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnReset;
    private javax.swing.JPanel btnSuaThongTin;
    private javax.swing.JPanel btnThem;
    private javax.swing.JLabel btnTimKiem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnDocGia;
    public static javax.swing.JPanel jpnLstDocGia;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}
