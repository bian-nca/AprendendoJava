/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoreslogicosrelacionais;

import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class OperadoresLogicosRelacionais {

    public static void main(String[] args) {
       System.out.println("-------OPERADORES LÓGICOS--------);");
      int x,z,y;
      x = 4;
      z = 12; 
      y =8;
      boolean result;
      result = (x>y ||y<z)? true:false;
      System.out.println("O resultado é igual a "+result); //verdadeiro
      
      
    }
}
