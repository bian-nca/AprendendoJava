/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturarepeticaoiii;

/**
 *
 * @author Bianca
 */
import java.util.Scanner;
public class EstruturaRepeticaoIII {

    public static void main(String[] args) {
      Scanner lerdados = new Scanner(System.in);
       int total = 0;
      for(int contador =0; contador<=10; contador++) {
          System.out.print("Informe um numero: ");
          float numerodigitado = lerdados.nextFloat();
            if(numerodigitado>0 && numerodigitado<10) {
              total = total + 1;
          }
         
      }
       System.out.println("Quantidade total de valores entre 0 e 10: " +total);
      
    }
}
