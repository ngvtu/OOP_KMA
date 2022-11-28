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
public class Bai_5 {
    public static void nhap(int n,int m,int[][] a){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("\na[%d][%d]=",i,j);
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    public static void hien(int n,int m,int[][] a){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%5d",a[i][j]);              
            }
            System.out.println("");
        }
    }
    
    public static int snt(int n){
        if(n<2)
            return 0;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return 0;
                }
            }
        }
        return 1;
    }
    
    public static void in(int n,int m,int[][] a){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int vt=a[i][j];
                if(snt(vt)==1){
                    System.out.printf("%5d",vt);
                }              
                else
                {
                    System.out.printf("%5d",0);
                }
            }
            System.out.println("");
        }
    }
    
    public static void maxMT(int n,int m,int[][] a){
        int max =a[0][0];
        int vt1=0,vt2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max<a[i][j]){
                    max=a[i][j];
                    vt1=i;
                    vt2=j;
                }              
            }
            
        } 
        System.out.printf("Phan tu lon nhat cua ma tran la %d nam o vi tri thu a[%d][%d]",max,vt1,vt2);
    }
    
    public static void sapxep(int n, int m,int[][] a)
    {
        for(int k = 0; k<n ; k++){
            for(int i = 0; i<m-1 ; i++){
                for(int j = m-1; j>i ; j--){
                    if(a[j][k]<a[j-1][k])
                    {
                        int temp = a[j][k];
                        a[j][k] = a[j-1][k];
                        a[j-1][k] = temp;
                    }
                 }
            }
        }
        hien(n,m,a);
    }

    public static void main(String[] args) {
        int n;
        int m;
        int[][] a; 
        int chon;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so hang n:");
        n=sc.nextInt();
        System.out.println("Nhap so cot m:");
        m=sc.nextInt();
        a=new int[n][m];                     
        do{
            System.out.println("\n\t\t\tMENU\t\t");
            System.out.println("1. Nhap ma tran A va hien thi");
            System.out.println("2. Tim phan tu lon nhat cua ma tran");
            System.out.println("3. Tim va in cac phan tu la so nguyen to");
            System.out.println("4. Sap xep cot theo thu tu tang dan");
            System.out.println("5. Ket thuc");
            System.out.println("Moi chon:");
            chon=sc.nextInt();
            switch(chon)
            {
                case 1:  
                    nhap(n,m,a);
                    System.out.println("Ma tran co dang:");
                    hien(n,m,a);
                    break;
                case 2:
                    maxMT(n,m,a);
                    break;
                case 3:
                    in(n,m,a);
                    break;
                case 4:
                    sapxep(n,m,a);
                    break;                   
            }
        }while(chon!=5);       
    }
    
}
    
