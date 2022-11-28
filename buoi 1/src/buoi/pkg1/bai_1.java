/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi.pkg1;

/**
 *
 * @author DELL 3520
 */
import java.util.Scanner;
public class bai_1 {
    public static void main(String[] args) {
        int date, month, year;
        int a;
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                a=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                a=30;
                break;
            case 2:
                if(year%400==0 || (year % 4 ==0 && year % 100!=0)){
                    a=29;
                }
                else{
                    a=28;
                }
                break;
            default: a=0;
        }
        if(date==a){
               if(month==12){
                   date =1;
                   month =1;
                   year++;
               }
               else{
                   date =1;
                   month++;
               }
            }
            else{
                date++;
            }
        }
        System.out.printf("%d/%d/%d", date, month, year);
    }
    
}

