/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL 3520
 */
public class FormNV extends javax.swing.JFrame {

    ArrayList<NhanVien> list=new ArrayList<>();
    NhanVien nv=new NhanVien();
            
    /**
     * Creates new form FormNV
     */
    public FormNV() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tht = new javax.swing.JTextField();
        tcb = new javax.swing.JTextField();
        ttn = new javax.swing.JTextField();
        tns = new javax.swing.JTextField();
        tdc = new javax.swing.JTextField();
        ths = new javax.swing.JTextField();
        rnam = new javax.swing.JRadioButton();
        rnu = new javax.swing.JRadioButton();
        tpb = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ho ten");

        jLabel2.setText("Ngay sinh");

        jLabel3.setText("QLNV");

        jLabel4.setText("Dia chi");

        jLabel5.setText("Gioi tinh");

        jLabel6.setText("Phong ban");

        jLabel7.setText("He so luong");

        jLabel8.setText("Luong cb");

        jLabel9.setText("Tham nien");

        ttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttnActionPerformed(evt);
            }
        });

        buttonGroup1.add(rnam);
        rnam.setText("Nam");

        buttonGroup1.add(rnu);
        rnu.setText("Nu");
        rnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnuActionPerformed(evt);
            }
        });

        tpb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thiet bi", "Nhan su", "R&D", "Kinh Doanh" }));
        tpb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpbActionPerformed(evt);
            }
        });

        add.setText("Them");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        save.setText("Luu");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setText("Xoa");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addGap(16, 16, 16)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tht)
                            .addComponent(tns)
                            .addComponent(tdc)
                            .addComponent(tcb)
                            .addComponent(ths)
                            .addComponent(ttn)
                            .addComponent(tpb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rnam)
                                        .addGap(34, 34, 34)
                                        .addComponent(rnu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 107, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rnam)
                    .addComponent(rnu))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tpb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(save)
                    .addComponent(clear))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttnActionPerformed

    private void rnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnuActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if(tht.getText().equals("")||tns.getText().equals("")||tdc.getText().equals("")||ths.getText().equals("")||ttn.getText().equals("")||tcb.getText().equals("")||(!rnam.isSelected()&&!rnu.isSelected())||tpb.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Yeu cau nhap thong tin");
        }
        else{
            nv.setHoTen(tht.getText());
            nv.setNgaySinh(tns.getText());
            nv.setDiaChi(tdc.getText());
            if(rnam.isSelected())
            {
                nv.setGioiTinh("Nam");
            }else{
                nv.setGioiTinh("Nu");
            }
            nv.setPhongBan(tpb.getSelectedItem().toString());
            nv.setHsl(Integer.parseInt(ths.getText()));
            nv.setThamnien(Integer.parseInt(ttn.getText()));
            nv.setLuongcb(Float.parseFloat(tcb.getText()));
            list.add(nv);
            System.out.println(nv.toString());
            JOptionPane.showMessageDialog(this, "Them thanh cong");
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        tht.setText("");
        tns.setText("");
        tdc.setText("");
        ths.setText("");
        ttn.setText("");
        tcb.setText("");
        buttonGroup1.clearSelection();
        tpb.setSelectedIndex(0);
        
    }//GEN-LAST:event_clearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        ghiFile();
    }//GEN-LAST:event_saveActionPerformed

    private void tpbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpbActionPerformed

    public void ghiFile(){
        try {
            FileOutputStream fos=new FileOutputStream("nhanvien.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            String line="";
            for(NhanVien nvien:list){
                line+=nvien.getHoTen();
                line+=nvien.getNgaySinh();
                line+=nvien.getDiaChi();
                if(rnam.isSelected()){
                    line+="Nam";
                }else{
                    line+="Nu";
                }
                line+=nvien.getPhongBan();
                line+=nvien.getHsl();
                line+=nvien.getThamnien();
                line+=nvien.getLuongcb();
                line+=nvien.luongthuc();
                bw.write(line);
                bw.newLine();
            }
            JOptionPane.showMessageDialog(this, "Luu thanh cong");
            bw.close();
            osw.close();
            fos.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Loi tao file");
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, "Loi ghi file");
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(FormNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rnam;
    private javax.swing.JRadioButton rnu;
    private javax.swing.JButton save;
    private javax.swing.JTextField tcb;
    private javax.swing.JTextField tdc;
    private javax.swing.JTextField ths;
    private javax.swing.JTextField tht;
    private javax.swing.JTextField tns;
    private javax.swing.JComboBox<String> tpb;
    private javax.swing.JTextField ttn;
    // End of variables declaration//GEN-END:variables
}
