/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class DienThoai extends HangHoa{
    protected String nhaSx;
    protected double dungLuong;
    protected String mau;

    public DienThoai() {
    }

    public DienThoai(String nhaSx, int dungLuong, String mau) {
        this.nhaSx = nhaSx;
        this.dungLuong = dungLuong;
        this.mau = mau;
    }

    public DienThoai(String nhaSx, int dungLuong, String mau, String maHang, String tenHang, double gia) {
        super(maHang, tenHang, gia);
        this.nhaSx = nhaSx;
        this.dungLuong = dungLuong;
        this.mau = mau;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }

    public double getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(double dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "Ma Hang=" + super.maHang + "Ten hang=" + super.tenHang + "Gia ban=" + super.gia + "nhaSx=" + nhaSx + ", dungLuong=" + dungLuong + ", mau=" + mau + '}';
    }
    
    
    
}
