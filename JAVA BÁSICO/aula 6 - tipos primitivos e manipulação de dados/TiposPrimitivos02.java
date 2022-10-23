/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
 
        Scanner leituradados = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a 1º nota obtida: ");
        float nota = leituradados.nextFloat();
        System.out.print("Informe a 2º nota obtida: ");
        float nota2 = leituradados.nextFloat();
        float media = (nota+nota2)/2;
        System.out.println("-------------------INFORMAÇÕES DO ALUNO-------------------");
        System.out.println("NOME DO ALUNO: " + nome);
        System.out.println("1º NOTA OBTIDA: " + nota);
        System.out.println("2º NOTA OBTIDA: " +nota2);
        System.out.println("MÉDIA FINAL: " + media);
        
    }
    
 
    
    }