/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetores;

/**
 *
 * @author Bianca
 */
public class Vetores {

    public static void main(String[] args) {
       String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
       int diastotal[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       System.out.println("Um ano tem " +meses.length + " meses!");
       for(int contador=0; contador<=meses.length-1; contador++){
           System.out.println("Estamos no mês de "+meses[contador]);
               System.out.println("O mês de  "+ meses[contador] + " tem " + diastotal[contador]+ " dias!");
               
           
       }
        }
    
}
