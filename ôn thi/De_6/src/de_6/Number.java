/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_6;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class Number implements Serializable{
    private float gtriA;
    private float gtriB;

    public Number() {
    }

    public Number(float gtriA, float gtriB) {
        this.gtriA = gtriA;
        this.gtriB = gtriB;
    }

    public float getGtriA() {
        return gtriA;
    }

    public void setGtriA(float gtriA) {
        this.gtriA = gtriA;
    }

    public float getGtriB() {
        return gtriB;
    }

    public void setGtriB(float gtriB) {
        this.gtriB = gtriB;
    }

    
    public float cong(){
        return gtriA+gtriB;
    }
    
    public float tru(){
        return gtriA-gtriB;
        
    }
    
    public float nhan(){
        return gtriA*gtriB;
    }
    
    public float chia(){
        return gtriA/gtriB;
    }
    public float UCLN(){
        if(gtriA==0||gtriB==0){
            return gtriA+gtriB;
        }
        while(gtriA!=gtriB){
            if(gtriA>gtriB){
                gtriA-=gtriB;
            }else{
                gtriB-=gtriA;
            }
        }
        return gtriA;
    }
   
}
