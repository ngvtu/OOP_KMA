/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7.Bai_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Arr_SV {
    File file = new File("customer.txt");
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
        System.out.printf("\n%-20s|%-10s|%-10s|%-10s|%-10s","Ho ten","Nam sinh","Ma SV", "DiemTB","Xep Loai");
        for(int i=0;i<sinhvien.size();i++)
        {
            sinhvien.get(i).hien();
            System.out.printf("%10s",sinhvien.get(i).xepLoai());
        }
    }
    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        String code;
        System.out.println("\nNhap vao ma sinh vien can tim: ");
        code=sc.nextLine();
        for(int i=0;i<sinhvien.size();i++){
            if(sinhvien.get(i).getMaSV().equalsIgnoreCase(code)){
                sinhvien.get(i).hien();
            }
        }
    }
    public static Comparator<SinhVien> compare = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
           if(sv1.getDiemTB()<sv2.getDiemTB()){
               return 1;
        }else{
               if(sv1.getDiemTB()==sv2.getDiemTB()){
                   return 0;
               } else return -1;
           }
        }
    };
    public void sapXep(){
        Collections.sort(sinhvien, compare);
        System.out.println("\nDanh sach sinh vien sau khi sap xep la: ");
        for(int i=0;i<sinhvien.size();i++){
            sinhvien.get(i).hien();
        }
    }
    
    public void saveFile (){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            nhap_sv();
            oos.writeObject(sinhvien);
            oos.close();
            fos.close();
            System.out.println("Success");
        } catch (FileNotFoundException e) {
            System.out.printf("\nLoi tao file!!!");
        } catch (IOException e) {
            System.out.printf("\nLoi ghi file");
        }
    }
    public void readFile (){
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sinhvien =(ArrayList<SinhVien>) ois.readObject();
            for(int i=0;i<sinhvien.size();i++)
        {
            sinhvien.get(i).hien();
            System.out.printf("%10s",sinhvien.get(i).xepLoai());
        }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.printf("\nloi doc file!!!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            
       
    }

    
}
    
    
    
    
        
        
    
    

