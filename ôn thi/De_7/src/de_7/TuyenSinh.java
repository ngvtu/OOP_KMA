/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class TuyenSinh {

   
    private String khoi;
    ArrayList<TS_A> a=new ArrayList<>();
    ArrayList<TS_C> c=new ArrayList<>();
    private int n;

    public TuyenSinh() {
    }

    public TuyenSinh(String khoi, int n) {
        this.khoi = khoi;
        this.n = n;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    public void nhap_ts(){
        Scanner sc=new Scanner(System.in);
        String dk;
        do{
            System.out.println("Nhap khoi:");
            setKhoi(sc.nextLine());
            if(getKhoi().equalsIgnoreCase("a")){
                System.out.println("Nhap so thi sinh khoi A:");
                setN(sc.nextInt());
                for(int i=0;i<n;i++){
                    System.out.println("");
                    System.out.println("Nhap thi sinh thu :"+(i+1));
                    TS_A ta=new TS_A();
                    ta.nhap();
                    a.add(ta);
                }
            }
            
            if(getKhoi().equalsIgnoreCase("c")){
                System.out.println("Nhap so thi sinh khoi C:");
                setN(sc.nextInt());
                for(int i=0;i<n;i++){
                    System.out.println("");
                    System.out.println("Nhap thi sinh thu 1:"+(i+1));
                    TS_C tc=new TS_C();
                    tc.nhap();
                    c.add(tc);
                }

            }
            
            System.out.println("Nhap tiep?");
            sc.nextLine();
            dk=sc.nextLine();          
        }while(!dk.equalsIgnoreCase("n"));
    
    }
    
    public void hien_ts(){
        for(int i=0;i<a.size();i++){
            a.get(i).hien();
        }
        for(int i=0;i<c.size();i++){
            c.get(i).hien();
        }
    }
    
    public void xet(){
        for(TS_A x:a){
            if(x.tong()>20){
               x.hien();            
            }
        }
        for(TS_C y:c){
            if(y.tong()>20){
               y.hien();            
            }
        }
        
    }
    
    public static void main(String[] args) {
        TuyenSinh ts=new TuyenSinh();
        ts.nhap_ts();
        System.out.println("Danh sach thi sinh");
        ts.hien_ts();
        System.out.println("");
        System.out.println("Danh sach thi sinh co diem tren 20");      
        ts.xet();
    }

    
        
}
