/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 * @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        int somatoria;
        System.out.print("Informe o primeiro numero: ");
        int numberone = leituradados.nextInt();
        System.out.print("Informe o segundo numero: ");
        int numbertwo = leituradados.nextInt();
        somatoria = numberone + numbertwo;
        System.out.print("A soma entre o valor " + numberone + " e o valor " + numbertwo+ " é igual a: " +somatoria);
    }
}
