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
        /*Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.   
        */
        
        Scanner lernumero = new Scanner(System.in);
        
        System.out.print("Informe o numero que você deseja saber se é par ou impar: ");
        float numero = lernumero.nextFloat();
        if(numero%2==0) {
            System.out.println("O número " +numero+ " é PAR!");
        }
        else {
            System.out.println("O numero " + numero + " é IMPAR!");
        }
    
        
    }
}
