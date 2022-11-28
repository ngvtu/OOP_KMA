/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class SinhVienMM extends SinhVien{
    private String dvi;
    private float luong;

    public SinhVienMM() {
    }

    public SinhVienMM(String dvi, float luong) {
        this.dvi = dvi;
        this.luong = luong;
    }

    public SinhVienMM(String dvi, float luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.dvi = dvi;
        this.luong = luong;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVienMM{" +super.toString()+ "dvi=" + dvi + ", luong=" + luong + '}';
    }
    
    
}
