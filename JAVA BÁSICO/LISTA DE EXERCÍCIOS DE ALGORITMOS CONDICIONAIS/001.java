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
        /*Faça um algoritmo que leia os valores A,B,C e imprima na tela se a soma de A+B é menor que C.       
        */
        Scanner lernumeros = new Scanner(System.in);
        int soma;
        System.out.print("Informe o valor de A: ");
        int a = lernumeros.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = lernumeros.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = lernumeros.nextInt();
        soma = a+b;
        if(soma < c){
            System.out.println("A soma entre os números " + a + " e " + b+ " é igual a " +soma+ ". Portanto, a soma é menor que " +c);
        }
        System.out.println("VALOR DE A: " +a);
        System.out.println("VALOR DE B: "+b);
        System.out.println("VALOR DE C: "+c);
        System.out.println("SOMA: " +soma);
    }
}
