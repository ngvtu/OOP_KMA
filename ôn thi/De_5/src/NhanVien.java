
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class NhanVien extends Person{
    private String maNV;
    private int hsl;
    private String dvi;

    public NhanVien() {
        super();
    }

    public NhanVien(String maNV, int hsl, String dvi) {
        this.maNV = maNV;
        this.hsl = hsl;
        this.dvi = dvi;
    }

    public NhanVien(String maNV, int hsl, String dvi, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.hsl = hsl;
        this.dvi = dvi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma nv:");
        maNV=sc.nextLine();
        System.out.println("Nhap he so luong:");
        hsl=sc.nextInt();
        System.out.println("Nhap don vi:");
        sc.nextLine();
        dvi=sc.nextLine();
                
    }
    public void hienthi(){
        super.hienThi();
        System.out.println("Ma NV:"+maNV);
        System.out.println("He so luong:"+hsl);
        System.out.println("Don vi:"+dvi);
    }

    
}
