/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class SinhVienATTT extends SinhVien{
    private float hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienATTT(float hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienATTT{" +super.toString()+ "hocPhi=" + hocPhi + '}';
    }

    
    
}
