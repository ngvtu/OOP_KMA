/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_2;

import javax.xml.transform.Source;

/**
 *
 * @author DELL 3520
 */
public class SinhVien extends Person{
    private String chuyenNganh;
    private float diemqt;
    private float diemhp;

    public SinhVien() {
        super();
    }

    public SinhVien(String chuyenNganh, float diemqt, float diemhp) {
        this.chuyenNganh = chuyenNganh;
        this.diemqt = diemqt;
        this.diemhp = diemhp;
    }

    public SinhVien(String chuyenNganh, float diemqt, float diemhp, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.chuyenNganh = chuyenNganh;
        this.diemqt = diemqt;
        this.diemhp = diemhp;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public float getDiemqt() {
        return diemqt;
    }

    public void setDiemqt(float diemqt) {
        this.diemqt = diemqt;
    }

    public float getDiemhp() {
        return diemhp;
    }

    public void setDiemhp(float diemhp) {
        this.diemhp = diemhp;
    }
    
    public void hienthi(){
        super.hienThi();
        System.out.println("chuyen nganh:"+chuyenNganh);
        System.out.println("Diem qt:"+diemqt);
        System.out.println("Diem hp:"+diemhp);
//        if(xephang()==1){
//            System.out.println("Xep hang D");
//        }
        System.out.println(xephang());     
    }
    
    
    public String xephang(){
        float diemtk=(float) (diemqt*0.3+diemhp*0.7);
         if(diemtk<4){
            return "Xep hang E";
         }else if(diemtk>4 && diemtk<5){
             return("Xep hang D");
         }else if(diemtk>=5 && diemtk<6){
             return ("Xep hang C");
         } else if(diemtk>=6 && diemtk<8.5){
             return("Xep hang B");
         } else if(diemtk>8.5){
             return("Xep hang A");
         }
        return null;
         
     }

    
    
}
