/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturacondicionalmaiormenor;

import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class EstruturaCondicionalMaiorMenor {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        int idade;
        System.out.println("---------MAIOR DE IDADE OU NÃO??! -----------");
        System.out.print("Informe o seu nome: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe o seu ano de nascimento: ");
        int anonasc = leituradados.nextInt();
        System.out.print("Informe o ano atual: ");
        int anoatual = leituradados.nextInt();
        idade = anoatual- anonasc;
        if(idade>=18) {
            System.out.println(nome +", você tem " + idade + " anos, portanto, você é maior de idade!");
        }
        else {
            System.out.println(nome + ", você tem " + idade + " anos, portanto, você ainda é menor de idade");
        }


    }
}