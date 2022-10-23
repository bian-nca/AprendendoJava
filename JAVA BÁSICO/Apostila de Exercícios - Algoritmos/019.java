/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 *19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).
* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float media;
        String resultado;
        System.out.print("Informe o nome do aluno: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a primeira nota: ");
        float n1 = leituradados.nextFloat();
        System.out.print("Informe a segunda nota: ");
        float n2 = leituradados.nextFloat();
        media = (n1+n2)/2;
        resultado = (media>=7.0)? "ÓTIMO":"PÉSSIMO";
        System.out.println("NOME DO ALUNO: " +nome);
        System.out.println("PRIMEIRA NOTA: " +n1);
        System.out.println("SEGUNDA NOTA: " +n2);
        System.out.println("MEDIA: " +media);
        System.out.println("APROVEITAMENTO: " +resultado);
                }
}
