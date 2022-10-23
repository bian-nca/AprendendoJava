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
        /*Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
atribuir o resultado para uma variável C e mostrar seu conteúdo na tela. */
        
        Scanner lernumero = new Scanner(System.in);
        int c;
        System.out.print("Informe um valor do tipo inteiro para a minha variavel A: ");
        int a = lernumero.nextInt();
        System.out.print("Informe outro valor do tipo inteiro para a minha variavel B: ");
        int b = lernumero.nextInt();
        if(a==b){
            c = a+b;
            System.out.println("A e B são valores iguais! Por isso, C equivale a soma que será igual a: " +c);
        }
        else if(a!=b) {
            c = a*b;
            System.out.println("A e B são valores diferentes! Portanto, C equivale a multiplicação deles que será igual a: " +c);
    }
        
    }
}
