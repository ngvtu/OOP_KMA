
package buoi.pkg1;

import java.util.Scanner;


public class Bai_2 {
    
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
    public static void insnt(int n)
    {
        if(n==2)
            System.out.printf("%5d",2);
        else{
            for(int i=2;i<n;i++){
                if(snt(i)==1){
                    System.out.printf("%5d",i);
                }
            }
        }
    }
    public static int uoc(int n)
    {
        int s=0;
        if(n==0)
            return 0;
       for(int i=1;i<n;i++)
       {
           if(n%i==0)
               s=s+i;
       }
       return s;
    }
    public static void ktra(int n)
    {
        if(n==0){
            System.out.printf("\n%d khong phai la so hoan hao",n);
        }else
        {
            if(uoc(n)==n){
                System.out.printf("\n%d la so hoan hao",n); 
            }
            else{
                System.out.printf("\n%d khong phai la so hoan hao",n);
            }
        }
    }
    
    public static void inshh(int n){
        for(int i=1;i<n;i++)
        {
            if(uoc(i)==i){
                System.out.printf("%5d",i);
                        
            }
        }
        
    }
    
    public static int UCLN(int a, int b)
    {
        if(a==0||b==0){
            return a+b;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }

    public static void pstg(int tu, int mau)
    {
        if(mau==0)
        {
            System.out.println("Phan so khong ton tai");
        }
        else{
            if(tu==0){
                System.out.printf("\nPhan so co dang toi gian = %d", 0);
            }else
            {               
                System.out.printf("\n Phan so co dang toi gian la %d/%d",tu/UCLN(tu,mau),mau/UCLN(tu,mau));
            }
        }
        
    }
    
    public static void main(String[] args) {
        int chon;
        int n,m,a,b,tu, mau;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n\t\t\tMENU\t\t");
            System.out.println("1. Nhap n va in snt");
            System.out.println("2. Nhap m, kiem tra so hoan hao");
            System.out.println("3. Tim UCLN");
            System.out.println("4. In phan so toi gian");
            System.out.println("5. Ket thuc");
            System.out.println("Moi chon:");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                    System.out.println("Nhap so nguyen duong n:");
                    n=sc.nextInt();
                    if(snt(n)==1)
                    {
                        System.out.printf("\n%d La so nguyen to",n);
                    }else
                    {
                        System.out.printf("\n%d khong phai la snt",n);
                    }
                    System.out.printf("\nCac so nguyen to < %d la:",n);
                    insnt(n);
                    break;
                case 2:
                    System.out.println("Nhap so nguyen duong m:");
                    m=sc.nextInt();
                    ktra(m);
                    System.out.printf("\nCac so hoan hao < %d la:",m);
                    inshh(m);
                    break;
                case 3:
                    System.out.println("Nhap a:");
                    a=sc.nextInt();
                    System.out.println("Nhap b:");
                    b=sc.nextInt();
                    System.out.printf("UCLN cua %d va %d la %d ",a,b,UCLN(a,b));
                    break;
                case 4:
                    System.out.println("Nhap tu so:");
                    tu=sc.nextInt();
                    System.out.println("Nhap mau so:");
                    mau=sc.nextInt();
                    pstg(tu, mau);                


            }
        }while(chon!=5);
    }
}

