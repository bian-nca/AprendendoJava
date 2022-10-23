/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturarepwhile;

/**
 *
 * @author Bianca
 */
public class EstruturaRepWhile {

    public static void main(String[] args) {
       int cc = 0;
       while (cc<10) {
           cc++;
           if(cc==2 || cc==3) {
               continue;
           }
           if (cc==5){
               break;
           }
           System.out.println(cc);
           
       }
       System.out.println("FIM");
    }
}
