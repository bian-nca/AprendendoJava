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
        Scanner leituradados = new Scanner(System.in);
        String resultado;
        System.out.print("Informe um número: ");
        int numerodigitado = leituradados.nextInt();
        resultado = (numerodigitado%2==0)? "PAR":"ÍMPAR";
        System.out.println("O número " +numerodigitado + " é "+resultado);
                }
}
