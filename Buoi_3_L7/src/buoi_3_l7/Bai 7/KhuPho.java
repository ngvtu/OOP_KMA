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
public class KhuPho {
    private  String tenKhuPho;
   private int soHoDan;
   private ArrayList<HoDan> dskp= new ArrayList<>();

    public KhuPho() {
    }

    public KhuPho(String tenKhuPho, int soHoDan) {
        this.tenKhuPho = tenKhuPho;
        this.soHoDan = soHoDan;
    }

    public String getTenKhuPho() {
        return tenKhuPho;
    }

    public void setTenKhuPho(String tenKhuPho) {
        this.tenKhuPho = tenKhuPho;
    }

    public int getSoHoDan() {
        return soHoDan;
    }

    public void setSoHoDan(int soHoDan) {
        this.soHoDan = soHoDan;
    }

    public ArrayList<HoDan> getDskp() {
        return dskp;
    }

    public void setDskp(ArrayList<HoDan> dskp) {
        this.dskp = dskp;
    }
   public void nhap()
   {
       System.out.println("Nhap ten khu pho: ");
       setTenKhuPho(new Scanner(System.in).nextLine());
       System.out.println("Nhap so ho dan: ");
       setSoHoDan(new Scanner(System.in).nextInt());
       for (int i=0 ; i< soHoDan;i++)
       {
           HoDan hd= new HoDan();
           hd.nhap();
           dskp.add(hd);
           
       }
       
   }
   public void xuat()
   {
       System.out.println("Ten Khu Pho: "+getTenKhuPho()+"\tSo ho dan: "+getSoHoDan());
       for(int i=0 ; i<dskp.size();i++)
       {
           dskp.get(i).xuat();
       }
   }
        
    
    
}
