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
        /*5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
imprimindo o resultado. */

        Scanner lernumero = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        float numero = lernumero.nextFloat();
        if(numero>0) {
            float dobro = numero*2;
            System.out.println("O numero " +numero+" é positivo. Portanto, iremos encontrar o dobro dele que equivale a " +dobro);
        }
        else {
            float triplo = numero*3;
            System.out.println("O numero " +numero+ " é negativo. Dessa forma iremos encontrar o triplo dele que equivale a " +triplo);
        }
    }
}
