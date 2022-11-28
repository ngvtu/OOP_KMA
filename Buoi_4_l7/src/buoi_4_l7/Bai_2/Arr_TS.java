/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_4_l7.Bai_2;

import buoi_4_l7.Bai_1.Student;
import buoi_4_l7.Bai_2.ThiSinh;
import buoi_4_l7.Bai_2.TuyenSinh;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.reflect.Array.get;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Arr_TS {
    File file = new File("thisinh.dat");
    ArrayList<TuyenSinh> tuyensinh=new ArrayList<>();
    public void nhap_sv(){
        String s;
        Scanner sc=new Scanner(System.in);
        do{           
            TuyenSinh ts=new TuyenSinh();
            ts.nhap();
            tuyensinh.add(ts);
            System.out.println("Nhap tiep?");
            s=sc.nextLine();
        }while(!s.equalsIgnoreCase("n"));
    }
    
    public void hien_sv(){
            for(int i=0;i<tuyensinh.size();i++){            
                tuyensinh.get(i).hien();
            }
    }

    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        String sbd;
        System.out.println("Nhap so bao danh can tim: ");
        sbd=sc.nextLine();
        
        for(int i=0;i<tuyensinh.size();i++){
            if(tuyensinh.get(i).getSbd().equalsIgnoreCase(sbd)){
                System.out.println("Thong tin thi sinh can tim kiem la: ");
                tuyensinh.get(i).hien();
            }
        }
    }
    
    public void saveFile (){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            nhap_sv();
            oos.writeObject(tuyensinh);
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
            tuyensinh =(ArrayList<TuyenSinh>) ois.readObject();
            for(int i=0;i<tuyensinh.size();i++){
                tuyensinh.get(i).hien();
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
