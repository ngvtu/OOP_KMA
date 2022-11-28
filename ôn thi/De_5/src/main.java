

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class main {
    ArrayList<NhanVien> list=new ArrayList<>();
    NhanVien nv=new NhanVien();
    int i=0;
    
    
    public void nhap(){
        NhanVien nv;
        Scanner sc=new Scanner(System.in);
        String a;
        do{
            nv=new NhanVien();
            nv.nhap();
            list.add(nv);
            System.out.println("Nhap tiep?");
            a=sc.nextLine();
        }while(!a.equalsIgnoreCase("n"));
    }
    
    
    public void ghiFile(){
        try {
            FileOutputStream fos=new FileOutputStream("Nhanvien.dat");
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
           String line="";
            
            for(NhanVien nv:list){
                line+=nv.getHoTen()+"$";
                line+=nv.getNgaySinh()+"$";
                line+=nv.getDiaChi()+"$";
                line+=nv.getGioiTinh()+"$";
                line+=nv.getMaNV()+"$";
                line+=nv.getHsl()+"$";
                line+=nv.getDvi()+"$";
                bw.write(line);
                bw.newLine();              
            }
            bw.close();
            osw.close();
            fos.close();
           System.out.println("Thanh cong");            
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file");
        } catch (IOException e){
            System.out.println("Loi ghi file");
        }
    }
    
    public void docfile(){
        try {
            FileInputStream fis=new FileInputStream("Nhanvien.dat");
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            String line="";
            while((line=br.readLine())!=null){
                String[] a=line.split("\\$");
                String ht=a[0];
                String ns=a[1];
                String dc=a[2];
                String gt=a[3];
                String ma=a[4];
                int hsl=Integer.parseInt(a[5]);
                String dv=a[6];
                NhanVien nv=new NhanVien(ma, hsl, dv, ht, ns, dc, gt);
                list.add(nv);
                nv.hienthi();
                
            }
            br.close();
            isr.close();
            fis.close();
            System.out.println("Doc thanh cong");
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }
    
}
