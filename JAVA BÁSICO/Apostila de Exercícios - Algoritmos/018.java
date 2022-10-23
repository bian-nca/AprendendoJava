/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 *18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        String resultado;
        int idade;
        System.out.print("Informe o seu nome: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe o seu ano de nascimento: ");
        int anonasc = leituradados.nextInt();
        System.out.print("Informe o ano atual: ");
        int anoatual = leituradados.nextInt();
        idade = anoatual - anonasc;
        resultado = (idade>=18)? "VOTO OBRIGATÓRIO": "NÃO PODE VOTAR";
        System.out.println("NOME: " +nome);
        System.out.println("IDADE: "+idade);
        System.out.println("SITUAÇÃO DO TÍTULO: "+resultado);
                
                }
}
