/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float dolares;
        System.out.print("Informe o seu nome, por favor: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a quantidade de dinheiro que você possui em reais : R$");
        float dinheiro = leituradados.nextFloat();
        dolares = (float) (dinheiro/3.45);
        System.out.println("DOLARES: " + dolares);
    }
}
