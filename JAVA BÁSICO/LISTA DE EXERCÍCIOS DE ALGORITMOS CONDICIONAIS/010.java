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
      /*10) O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar 
umaindicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
 
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo 
com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso 
*/
      Scanner lerdados = new Scanner(System.in);
      System.out.print("Informe o seu peso em kg: ");
      float kg = lerdados.nextFloat();
      System.out.print("Informe a sua altura em m: ");
      float altura = lerdados.nextFloat();
      float imc = kg/(altura*altura);
      System.out.println("ALTURA: "+altura);
      System.out.println("PESO: " +kg);
      System.out.println("IMC: " +imc);
      if(imc<18.5) {
          System.out.println("ABAIXO DO PESO!");
      }
      else if(imc>=18.5 && imc<25){
          System.out.println("PESO NORMAL!");
      }
      else if(imc>=25 && imc<30) {
          System.out.println("ACIMA DO PESO!");
      }
      else {
          System.out.println("OBESEO!");
      }
    
    }  
      
  }
   
      
  

