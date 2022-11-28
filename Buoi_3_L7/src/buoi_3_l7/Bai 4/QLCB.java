/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class QLCB {
    ArrayList<CongNhan> cnhan=new ArrayList<>();
    ArrayList<NhanVien> nvien=new ArrayList<>();
    ArrayList<KySu> ksu=new ArrayList<>();
    public void nhap_CN(){
        CongNhan cn;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong cong nhan: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin cong nhan thu "+(i+1));
            cn=new CongNhan();
            cn.nhap();
            cnhan.add(cn);
        }
    }
    public void xuat_CN(){
        for(int i=0;i<cnhan.size();i++){
            System.out.println("Cong nhan thu "+(i+1));
            cnhan.get(i).hien();
        }
    }
    public void timKiem_CN(){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhap ten cong nhan can tim: ");
        name=sc.nextLine();
        for(int i=0;i<cnhan.size();i++){
            if(cnhan.get(i).getHoTen().equalsIgnoreCase(name)){
                System.out.println("Thong tin cong nhan can tim kiem la: ");
                cnhan.get(i).hien();
            }
        }
    }
    public void nhap_NV(){
        NhanVien nv;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong nhan vien: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin nhan vien thu "+(i+1));
            nv=new NhanVien();
            nv.nhap();
            nvien.get(i).hien();
        }
    }
    public void xuat_NV(){
        for(int i=0;i<nvien.size();i++){
            System.out.println("Nhan vien thu "+(i+1));
            nvien.get(i).hien();
        }
    }
    public void timKiem_NV(){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhap ten nhan vien can tim: ");
        name=sc.nextLine();
        for(int i=0;i<nvien.size();i++){
            if(nvien.get(i).getHoTen().equalsIgnoreCase(name)){
                System.out.println("Thong tin nhan vien can tim kiem la: ");
                nvien.get(i).hien();
            }
        }
    }
    public void nhap_KS(){
        KySu ks;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong ky su: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin ky su thu"+(i+1));
            ks=new KySu();
            ks.nhap();
            ksu.add(ks);
        }
    }
    public void xuat_KS(){
        for(int i=0;i<ksu.size();i++){
            System.out.println("Nhan vien thu "+(i+1));
            ksu.get(i).hien();
        }
    }
    public void timKiem_KS(){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhap ten nhan vien can tim: ");
        name=sc.nextLine();
        for(int i=0;i<ksu.size();i++){
            if(ksu.get(i).getHoTen().equalsIgnoreCase(name)){
                System.out.println("Thong tin ky su can tim kiem la: ");
                ksu.get(i).hien();
            }
        }
    }
}
