/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi.pkg1;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String s=sc.nextLine();
        char ch;
        int Dem=0;
        int dem=0;
        int so=0;
        int kt=0;
        int kitu=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            int a=(int)ch;
            if(a>=65 && a<=90){
                Dem++;
            }
            if(a>=97 && a<=122){
                dem++;
            }
            if(a>=48 && a<=57){
                so++;
            }
            if(a==32)
            {
                kt++;
            }
            else if(a>=33 && a<=47 || a>=58 && a<=64 || a>=123 && a<=126)
            {
                kitu++;
            }
        }
        System.out.println("So chu in hoa:"+Dem);
        System.out.println("So chu in thuong:"+dem);
        System.out.println("So chu so:"+so);
        System.out.println("so khoang trang:"+kt);
        System.out.println("So ki tu dac biet:"+kitu);
    }
    
    
}
