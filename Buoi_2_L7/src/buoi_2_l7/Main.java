/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Main {
    ArrayList<SinhVien> sinhvien=new ArrayList<>();
    public void nhap_sv(){
        String a;
        Scanner sc=new Scanner(System.in);
        do{
            SinhVien sv=new SinhVien();
            sv.nhap();
            sinhvien.add(sv);
            System.out.println("Nhap tiep?");
            a=sc.nextLine();
            
        }while(!a.equalsIgnoreCase("n"));
    }
    
    public void hien_sv(){
        System.out.printf("|%-10s|%-20s|%-10s|%-10s|%-10s|\n","MaSV","Ho ten","DiemLT","DiemTH","Tong");
        for(int i=0;i<sinhvien.size();i++){
            sinhvien.get(i).hien();
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int chon;
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("\t\tMENU\t\t");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien va tinh diem trung binh");
            System.out.println("3. Ket thuc");
            System.out.println("Moi ban chon:");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                    m.nhap_sv();
                    break;
                case 2:
                    m.hien_sv();
                    break;
                
            }
        }while(chon!=3);
    }
    
}
