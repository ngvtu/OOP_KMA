/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3_lh;

/**
 *
 * @author DELL 3520
 */
public class SinhVien {
    private String hoTen;
    private String maSV;
    private float diemhp;
    private float diemqt;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, float diemhp, float diemqt) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemhp = diemhp;
        this.diemqt = diemqt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemhp() {
        return diemhp;
    }

    public void setDiemhp(float diemhp) {
        this.diemhp = diemhp;
    }

    public float getDiemqt() {
        return diemqt;
    }

    public void setDiemqt(float diemqt) {
        this.diemqt = diemqt;
    }
    
    public float diemtb(){
        return (float) (diemqt*0.3+diemhp*0.7);
    }
    
    public void hien(){
        System.out.println("Ho ten:"+hoTen);
        System.out.println("ma sv:"+maSV);
        System.out.println("Diem hp:"+diemhp);
        System.out.println("Diem qt:"+diemqt);
        System.out.println("Diem tb:"+diemtb());
    }
}
