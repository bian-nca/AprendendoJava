/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.

* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float desconto;
        System.out.println("--------------PROMOÇÃO NO AR! APROVEITE ENQUANTO PODE----------");
        System.out.print("Informe o preço do produto: ");
        float promocao = leituradados.nextFloat();
        desconto = (promocao*95)/100;
        System.out.println("PREÇO DO PRODUTO: "+promocao);
        System.out.println("PREÇO DO PRODUTO COM DESCONTO: "+desconto);
    }
}
