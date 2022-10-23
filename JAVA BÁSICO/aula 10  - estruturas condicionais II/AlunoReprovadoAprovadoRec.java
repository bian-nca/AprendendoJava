/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alunoreprovadoaprovadorec;
import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class AlunoReprovadoAprovadoRec {
    
    public static void main(String[] args) {
        float media;
        Scanner leituradados = new Scanner(System.in);
        System.out.print("Informe o nome do(a) aluno(a): ");
        String nome =  leituradados.nextLine();
        System.out.print("Informe a primeira nota do(a) " +nome+ ":" );
        float nota1 = leituradados.nextFloat();
        System.out.print("Informe a segunda nota do(a) " +nome + ": ");
        float nota2 = leituradados.nextFloat();
        media = (nota1+nota2)/2;
        System.out.println("-------------CALCULANDO-----------------");
        System.out.println("NOME: " +nome);
        System.out.println("NOTA 1: " +nota1);
        System.out.println("NOTA 2: " +nota2);
        System.out.println("MÉDIA: " +media);
        System.out.print("SITUAÇÃO: ");
        if(media>=7.5) {
            System.out.println("APROVADO");
        }
        else if ((media>=5) && (media<7)){
            System.out.println("RECUPERAÇÃO!");
        }
        else{
            System.out.println("REPROVADO!");
        } 
        
    }
}
