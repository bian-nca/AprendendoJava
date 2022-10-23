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
        /* Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
imprimir o resultado desta operação.*/
        Scanner lernumero = new Scanner(System.in);
        float soma;
        System.out.print("Informe um numero: ");
        float numero = lernumero.nextFloat();
        if(numero%2==0) {
            soma = numero+5;
            System.out.println("O numero é Par.");
            System.out.println("RESULTADO DA SOMA: " +soma);
        }
        else{
            soma = numero+8;
            System.out.println("O numero é Impar!");
            System.out.println("RESULTADO DA SOMA: "+soma);
        }
    }
}
