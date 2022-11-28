/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Person7 {
    public String hoTen;
   public int tuoi;
   private String nghe;

    public Person7() {
    }

    public Person7(String hoTen, int tuoi, String nghe) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.nghe=nghe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }
   public void nhap()
   {
       Scanner sc=new Scanner(System.in);
       sc.nextLine();
       System.out.println("Nhap ho ten: ");
       setHoTen(sc.nextLine());
       System.out.println("Nhap tuoi: ");
       setTuoi(sc.nextInt());
       System.out.println("Nhap nghe nghiep:");
       sc.nextLine();
       setNghe(sc.nextLine());
        
   }
   public void xuat()
   {
       System.out.println("Ho ten: "+getHoTen()+"\n"+"Tuoi: "+getTuoi());
       System.out.println("Nghe nghiep:"+nghe);
   }
}
