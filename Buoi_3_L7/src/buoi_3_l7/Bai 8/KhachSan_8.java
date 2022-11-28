/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class KhachSan_8 {
    private int soNgayTro;
    private String loaiPhongTro;
    private double giaPhong;
    private int soKhachTro;
    private ArrayList<Nguoi_8> p= new ArrayList<>();

    public KhachSan_8() {
    }

    public KhachSan_8(int soNgayTro, String loaiPhongTro, double giaPhong, int soKhachTro) {
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
        this.soKhachTro=soKhachTro;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getSoKhachTro() {
        return soKhachTro;
    }

    public void setSoKhachTro(int soKhachTro) {
        this.soKhachTro = soKhachTro;
    }

    
    public ArrayList<Nguoi_8> getP() {
        return p;
    }

    public void setP(ArrayList<Nguoi_8> p) {
        this.p = p;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so ngay tro: ");
        setSoNgayTro(sc.nextInt());
        System.out.println("Nhap loai phong tro: ");
        sc.nextLine();
        setLoaiPhongTro(sc.nextLine());
        System.out.println("Nhap gia phong: ");
        setGiaPhong(sc.nextDouble());
        System.out.println("Nhap so khach tro: ");
        setSoKhachTro(sc.nextInt());
        for(int i=0;i<getSoKhachTro();i++){
            System.out.println("Nhap khach tro thu: "+(i+1));
            Nguoi_8 n=new Nguoi_8();
            n.nhap();
            p.add(n);
            
        }
    }
    
    public void hien(){
        System.out.println("So ngay tro: "+getSoNgayTro());
        System.out.println("Loai phong tro:"+getLoaiPhongTro());
        System.out.println("Gia phong:"+getGiaPhong());
        for(int i=0;i<p.size();i++){
            p.get(i).hien();
        }
    }

    
}
