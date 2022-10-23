/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 *20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
      float delta;
      Scanner lerdados = new Scanner(System.in);
      System.out.println("---------DESCOBRINDO O VALOR DE DELTA--------");
      System.out.print("Informe o valor de A: ");
      int A = lerdados.nextInt();
      System.out.print("Informe o valor de B: ");
      int B = lerdados.nextInt();
      System.out.print("Informe o valor de C: ");
      int C = lerdados.nextInt();
      delta = ((B*B) - (4*A*C));
      System.out.println("DELTA: " +delta);
      if(delta>0) {
          System.out.println("A equação terá dois valores reais e distintos!");
      }
      else if (delta==0) {
          System.out.println("A equação terá somente um valor real ou dois resultados!");
      }
      else {
          System.out.println("A equqação não possui valores reais por ser menor que zero!");
    }
}
}