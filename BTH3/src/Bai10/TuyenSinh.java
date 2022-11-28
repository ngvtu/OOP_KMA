/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import Bai10.TS_KhoiC;
import Bai10.TS_KhoiB;
import Bai10.TS_KhoiA;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class TuyenSinh {
    private String khoi;
    private ArrayList<TS_KhoiA> a=new ArrayList<>();
    private ArrayList<TS_KhoiB> b=new ArrayList<>();
    private ArrayList<TS_KhoiC> c=new ArrayList<>();
    File file =new File("b10.txt");
    private int n;


    public TuyenSinh() {
    }

    public TuyenSinh(String khoi) {
        this.khoi = khoi;
    }
    
    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }
    

    public ArrayList<TS_KhoiA> getA() {
        return a;
    }

    public void setA(ArrayList<TS_KhoiA> a) {
        this.a = a;
    }

    public ArrayList<TS_KhoiB> getB() {
        return b;
    }

    public void setB(ArrayList<TS_KhoiB> b) {
        this.b = b;
    }

    public ArrayList<TS_KhoiC> getC() {
        return c;
    }

    public void setC(ArrayList<TS_KhoiC> c) {
        this.c = c;
    }

 
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        String s;
        do{
            System.out.println("Nhap khoi:");
            setKhoi(sc.nextLine());
            if(getKhoi().equalsIgnoreCase("a")){
                System.out.println("Nhap so thi sinh:");
                n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("\nNhap thi sinh thu :"+(i+1));
                    TS_KhoiA khoia =new TS_KhoiA();
                    khoia.nhap();
                    a.add(khoia);
                    
                }
                
            } 
            if(getKhoi().equalsIgnoreCase("b")){
                System.out.println("Nhap so thi sinh:");
                n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("\nNhap thi sinh thu "+(i+1));            
                    TS_KhoiB khoib =new TS_KhoiB();
                    khoib.nhap();
                    b.add(khoib);
                }
            } 
            if(getKhoi().equalsIgnoreCase("c")){
                System.out.println("Nhap so thi sinh:");
                n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("\nNhap thi sinh thu :"+(i+1));           
                    TS_KhoiC khoic =new TS_KhoiC();
                    khoic.nhap();
                    c.add(khoic);
                }
            }
            System.out.println("Nhap tiep?");
            sc.nextLine();
            s=sc.nextLine();
        }while(!s.equalsIgnoreCase("n"));
    }
    
    public void hien(){
            for(int i=0;i<a.size();i++){
                a.get(i).hien();
            } 
                
            for(int i=0;i<b.size();i++){
                b.get(i).hien();
            }
 
            for(int i=0;i<c.size();i++){
                c.get(i).hien();
            }
    }

    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        String sbd;
        System.out.println("Nhap so bao danh can tim: ");
        sbd=sc.nextLine();
        for(int i=0;i<a.size();i++){
            if(a.get(i).getSbd().equalsIgnoreCase(sbd)){
                System.out.println("Thong tin thi sinh can tim kiem la: ");
                a.get(i).hien();
            }
        }
        for(int i=0;i<b.size();i++){
            if(b.get(i).getSbd().equalsIgnoreCase(sbd)){
                System.out.println("Thong tin thi sinh can tim kiem la: ");
                b.get(i).hien();
            }
        }
        for(int i=0;i<c.size();i++){
            if(c.get(i).getSbd().equalsIgnoreCase(sbd)){
                System.out.println("Thong tin thi sinh can tim kiem la: ");
                c.get(i).hien();
            }
        }
    }

    public void saveFile(){
        try {
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            nhap();
            if(getKhoi().equalsIgnoreCase("a")){
                oos.writeObject(a);
            }
            if(getKhoi().equalsIgnoreCase("b")){
                oos.writeObject(b);
            }
            if(getKhoi().equalsIgnoreCase("c")){
                oos.writeObject(c);
            }
            
            oos.close();
            fos.close();
            System.out.println("Success");
            
        } catch (FileNotFoundException e) {
            System.out.printf("\nLoi tao file!!!");
        } catch (IOException e) {
            System.out.printf("\nLoi ghi file");
        }
    }
    
    public void readFile(){
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            if(getKhoi().equalsIgnoreCase("a")){
                a= (ArrayList<TS_KhoiA>) ois.readObject();
                for(int i=0;i<a.size();i++){
                    a.get(i).hien();
                }
            }
            if(getKhoi().equalsIgnoreCase("b")){
                b= (ArrayList<TS_KhoiB>) ois.readObject();
                for(int i=0;i<b.size();i++){
                    b.get(i).hien();
                }
            }
            if(getKhoi().equalsIgnoreCase("c")){
                c= (ArrayList<TS_KhoiC>) ois.readObject();
                for(int i=0;i<c.size();i++){
                    c.get(i).hien();
                }
            }
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.printf("\nloi doc file!!!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
