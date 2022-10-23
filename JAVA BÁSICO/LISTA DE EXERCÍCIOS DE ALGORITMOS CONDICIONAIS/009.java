/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexerciciosdois;

/**
 *
 * @author Bianca
 */

import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
      /*) Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que 
calcule seu peso ideal, utilizando as seguintes fórmulas: 
● para homens: (72.7 * h) – 58; 
● para mulheres: (62.1 * h) – 44.7.*/
      Scanner lerdados = new Scanner(System.in);
      float calculo;
      System.out.print("Informe o sexo: [Femininno - F | M - Masculino]");
      String sexo = lerdados.nextLine();
      
      System.out.print("Informe a sua altura: ");
      float altura = lerdados.nextFloat();
      
      switch(sexo){
          case "F":
              calculo = (float) ((62.1 * altura)-44.7);
              System.out.println("PESO IDEAL: "+calculo);
              break;
          case "M":
              calculo = (float) ((72.7 * altura) -58);
              System.out.println("PESO IDEAL: "+calculo);
              break;
          default:
              System.out.println("ALGUMA INFORMAÇÃO ESTÁ INVÁLIDA!");
      }
      
    
    }  
      
  }
   
      
  

