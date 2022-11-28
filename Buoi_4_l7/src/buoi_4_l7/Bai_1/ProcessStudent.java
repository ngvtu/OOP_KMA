/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_4_l7.Bai_1;

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
public class ProcessStudent extends Student{
    File file = new File("customer.txt");
    ArrayList<Student> s=new ArrayList<>();
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        String a;
        do{
            Student hs=new Student();
            hs.nhap();
            s.add(hs);
            System.out.println("Nhap tiep?");
            a=sc.nextLine();
                    
        }while(!a.equalsIgnoreCase("n"));
    }
    
    
    public void saveFile (){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            nhap();
            oos.writeObject(s);
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
            s =(ArrayList<Student>) ois.readObject();
            for(int i=0;i<s.size();i++){
                s.get(i).hien();
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
