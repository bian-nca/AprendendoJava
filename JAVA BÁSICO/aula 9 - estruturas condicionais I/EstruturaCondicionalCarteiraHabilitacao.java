/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturacondicionalcarteirahabilitacao;
import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class EstruturaCondicionalCarteiraHabilitacao {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        System.out.println("--------APTO A TIRAR CNH---------");
        System.out.print("Informe o seu nome: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a sua idade: ");
        int idade = leituradados.nextInt();
        System.out.println("--------INFORMAÇÕES----------");
        System.out.println("NOME: " +nome);
        System.out.println("IDADE: " + idade);
        System.out.print("SITUAÇÃO: ");
        if (idade>=18) {
            System.out.println("APTO A TIRAR CNH");
        }
        else {
            System.out.println("NÃO ESTÁ APTO A TIRAR CNH AINDA");
        }
    }
}
