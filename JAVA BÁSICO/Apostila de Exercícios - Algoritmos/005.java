/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 

* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float media;
        System.out.print("Informe o nome do aluno: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a primeira nota do aluno: ");
        float n1 = leituradados.nextFloat();
        System.out.print("Informe a segudna nota do aluno: ");
        float n2 = leituradados.nextFloat();
        media = (n1+n2)/2;
        System.out.println("-----INFORMAÇÕES DO ALUNO-------");
        System.out.println("NOME: " +nome);
        System.out.println("PRIMEIRA NOTA: " +n1);
        System.out.println("SEGUNDA NOTA: " + n2);
        System.out.println("MÉDIA: " + media);
        
    
    }
}
