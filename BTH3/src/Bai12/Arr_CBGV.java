/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Arr_CBGV {
    ArrayList<CBGV> list=new ArrayList<>();
    File file=new File("b12.txt");
    public void nhap_gv(){
        String a;
        Scanner sc= new Scanner(System.in);
        do{
            CBGV gv=new CBGV();
            gv.nhap();
            list.add(gv);
            System.out.println("Nhap tiep?");
            a=sc.nextLine();
            
        }while(!a.equalsIgnoreCase("n"));
    }
    
    public void hien_gv(){
        for(int i=0;i<list.size();i++){
            list.get(i).hien();
        }
    }
    
    public void saveFile (){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            nhap_gv();
            oos.writeObject(list);
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
            list =(ArrayList<CBGV>) ois.readObject();
            for(int i=0;i<list.size();i++){
                list.get(i).hien();
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
//    
   }
}
