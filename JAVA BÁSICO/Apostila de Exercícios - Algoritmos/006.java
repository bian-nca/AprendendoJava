/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10

* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        int antecessor, sucessor; 
        System.out.print("INFORME UM NUMERO: ");
        int numerodigitado = leituradados.nextInt();
        sucessor = numerodigitado+1;
        antecessor = numerodigitado-1;
        System.out.println("NUMERO ESCOLHIDO: " +numerodigitado);
        System.out.println("SUCESSOR: " +sucessor);
        System.out.println("ANTECESSOR: " + antecessor);
 
        
    
    }
}
