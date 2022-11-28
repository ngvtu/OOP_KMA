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
public class Bai_3 {
    int n;
    int [] a = new int [100] ;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("\na[%d]=",i);
            a[i]=sc.nextInt();
        }
    }
    
    public void sapxep()
    {
        int t= a[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
    }
    public void inmang()
    {
        for(int i=0;i<n;i++){
            System.out.printf("%5d", a[i]);
        }
    } 
    public int max(){
        int max =a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i]){
                max=a[i];
                
            }           
        }
        return max;
    }
    
    
    public void maxds(){
        int max =a[0];
        int vt=0;
        for(int i=0;i<n;i++)
        {
            if(max<a[i]){
                max=a[i];
                vt=i+1;
            }           
        }
        System.out.printf("Phan tu lon nhat cua mang la %d o vi tri thu %d",max,vt);
    }
    
    
    public void max2ds()
    {
       int max2=0;
       int vt=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max2 && a[i]<max()){
                max2=a[i];
                vt=i+1;
            }            
        }
        System.out.printf("\nPhan tu lon thu hai cua mang la %d o vi tri thu %d",max2,vt);
    }
    
    public void them()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("them k phan tu");
        int k = sc.nextInt();
        for(int i =n;i<n+k;i++)
        {
            System.out.printf("a[%d]=",i);
            a[i]= sc.nextInt();
        }
        n=n+k;
        sapxep();
        inmang();
    }
    
    
    public static void main(String[] args) {
        Bai_3 a = new Bai_3();
        int chon;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n\t\t\tMENU\t\t");
            System.out.println("1. Nhap mang A gom n phan tu");
            System.out.println("2. Sap xep mang tang dan");
            System.out.println("3. Tim phan tu lon nhat va phan tu lon thu 2");
            System.out.println("4. Chen mot phan tu");
            System.out.println("5. Ket thuc");
            System.out.println("Moi chon:");
            chon=sc.nextInt();
            switch(chon)
            {
                case 1:
                    
                    a.nhap();
                    break;
                case 2:
                    System.out.println("Mang ban dau:");
                    a.inmang();
                    a.sapxep();
                    System.out.println("\nMang sau khi sap xep:");
                    a.inmang();
                    break;
                case 3:
                    a.maxds();
                    a.max2ds();
                    break;
                case 4:
                    a.them();
                    break;                   
            }
        }while(chon!=5);
       
        
    }
}
    








