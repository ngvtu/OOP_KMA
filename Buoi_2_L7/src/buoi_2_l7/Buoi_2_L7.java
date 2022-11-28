/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Buoi_2_L7 {

    ArrayList<Thi_sinh> thisinh=new ArrayList<>();
    public void nhap_TS(){
        String a;
        Scanner sc= new Scanner(System.in);
        do
        {
            Thi_sinh ts=new Thi_sinh();
            ts.nhap();
            thisinh.add(ts);
            System.out.println("Nhap tiep?");
            a=sc.nextLine();
        }while(!a.equalsIgnoreCase("n"));
    }
    
    public void hien_TS(){
        System.out.println("Danh sach thi sinh:");
        for(int i=0;i<thisinh.size();i++){
            thisinh.get(i).hienThi();
        }
    }
    
    public double max(){
        
        double max=0;
        for(int i=0;i<thisinh.size();i++){
            if(max< thisinh.get(i).tongdiem()){
                max=thisinh.get(i).tongdiem();
            }           
        }      
        return max;
    }
    
    public void inmax(){
        
        for(int i=0;i<thisinh.size();i++){
            if(thisinh.get(i).tongdiem()== max()){
                thisinh.get(i).hienThi();
            }
        }
    }
    
    public void sapxep()
    {
        Collections.sort(thisinh,(Thi_sinh a,Thi_sinh b)->a.getHoten().compareTo(b.getHoten()));
        hien_TS();    
    }
    
    
    
    public static void main(String[] args) {
        
        int chon;
        Buoi_2_L7 m=new Buoi_2_L7();
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("\t\tMENU\t\t");
            System.out.println("1. Nhap danh sach thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh va tinh tong diem thi sinh");
            System.out.println("3. Hien thi thi sinh co tong diem cao nhat");
            System.out.println("4. Sap xep danh sach theo ho ten");
            System.out.println("5. Ket thuc");
            System.out.println("Moi ban chon:");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                    m.nhap_TS();
                    break;
                case 2:
                    m.hien_TS();
                    break;
                case 3:
                    System.out.println("Thi sinh co tong diem cao nhat la:");
                    m.inmax();
                    break;
                case 4:
                    m.sapxep();
                    break;
            }
        }while(chon!=5);
    }
    
}
