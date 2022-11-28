/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class HoDan {
    private int soThanhVien;
   private String diaChi;
   private ArrayList <Person7> dshd=new ArrayList<>();

    public HoDan() {
    }

    public HoDan(int soThanhVien, String diaChi) {
        this.soThanhVien = soThanhVien;
        this.diaChi = diaChi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<Person7> getDshd() {
        return dshd;
    }

    public void setDshd(ArrayList<Person7> dshd) {
        this.dshd = dshd;
    }
   public void nhap ()
   {
       System.out.println("Nhap so nha cua ho dan: ");
       setDiaChi(new Scanner(System.in).nextLine());
       System.out.println("Nhap so nguoi trong so nha "+getDiaChi());
       setSoThanhVien(new Scanner(System.in).nextInt());
       for(int i=0; i<getSoThanhVien();i++)
       {
           System.out.println("Nhap thanh vien: ");
           Person7 ng = new Person7();
           ng.nhap();
           dshd.add(ng);
       }
   }
   public void xuat()
   {
       System.out.println("\nHo dan: " + getDiaChi()+ "\t" + "co so nguoi: "+getSoThanhVien());
       for(int i=0 ; i<dshd.size() ; i++)
       {
           dshd.get(i).xuat();
       }
   }
}   
