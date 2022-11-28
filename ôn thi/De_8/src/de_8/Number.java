/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_8;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Number {
    private int value;
    private int min;
    private int max;

    public Number() {
    }

    public Number(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    
    public int kiemtrasnt(int value){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhap value:");
//        value=sc.nextInt();
        if(value<2){
            return 0;
        }else{
            for(int i=2;i<value;i++){
                if(value%i==0){
                    return 0;
                }
            }
        }
        return 1;
    }
    
    
}
