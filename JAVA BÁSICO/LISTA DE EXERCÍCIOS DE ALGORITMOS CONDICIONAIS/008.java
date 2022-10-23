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
      /*/*
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
        /* Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem 
decrescente. */
        Scanner lernumeros = new Scanner(System.in);
        System.out.println("------NUMEROS INTEIROS EM ORDEM DESCRESCENTE-------");
        System.out.print("Informe um numero: ");
        int v1 = lernumeros.nextInt();
        System.out.print("Informe um numero: ");
        int v2 = lernumeros.nextInt();
        System.out.print("Informe um numero: ");
        int v3 = lernumeros.nextInt();
        int maior,  meio, menor;
        if((v1>v2) && (v1>v3)){
            maior = v1;
            if(v2>v3){
            meio = v2;
            menor = v3;
            }
            else{
                meio = v3;
                menor = v2;
            }
        }
        else if(v2>v1 && v2>v3){
            maior = v2;
            if(v1>v3) {
                meio = v1;
                menor = v3;
            }
            else{
                meio =v3;
                menor = v1;
            }
        }
        
        else if(v3>v1 && v3>v2) {
            maior = v3;
            if(v1>v2){
                meio = v1;
                menor = v2;
            }
            else{
                meio = v2;
                menor = v1;
            }
        }
        System.out.println("Maior: " +maior);
        System.out.println("Meio: " +meio);
        System.out.println("Menor: "+menor);
    }

      
  }


    }  
      
  
   
      
  

