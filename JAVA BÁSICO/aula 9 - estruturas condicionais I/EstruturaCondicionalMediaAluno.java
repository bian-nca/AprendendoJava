/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturacondicionalmediaaluno;

import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class EstruturaCondicionalMediaAluno {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float media;
        
        System.out.println(" SISTEMA DE INFORMAÇÕES - ESCOLA POLIVALENTE");
        
        System.out.print("Informe o nome do(a) aluno(a): ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a primeira nota do(a) " + nome + ": ");
        float primeiranota = leituradados.nextFloat();
        System.out.print("Informe a segunda nota do(a)" + nome + ": ");
        float segundanota = leituradados.nextFloat();
        media = (primeiranota+segundanota)/2;
        System.out.println("----------SITUAÇÃO DO ALUNO---------");
        System.out.println("Nome: " + nome);
        System.out.println("PRIMEIRA NOTA: " +primeiranota);
        System.out.println("SEGUNDA NOTA: "+segundanota);
        System.out.println("MEDIA: " +media);
        
        
        if (media>=6.0 && media<=10) {
            System.out.println("SITUAÇÃO: APROVADO!");
        }
        else {
            System.out.println("SITUAÇÃO: REPROVADO");
        }
    }
}
