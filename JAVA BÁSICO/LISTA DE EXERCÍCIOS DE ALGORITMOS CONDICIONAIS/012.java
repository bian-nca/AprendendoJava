/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexerciciosdois;

/**
 *
 * @author Bianca
 */

import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        /* 12) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 
3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de 
aproveitamento, usando a fórmula: 
MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7 

>= 90 A 
>= 75 e < 90 B 
>= 60 e < 75 C 
>= 40 e < 60 D 
< 40 E */
      float media;
      String aproveitamento;
      Scanner lerdados = new Scanner(System.in);
      System.out.print("Informe o número de identificação do aluno: ");
      long identificacao = lerdados.nextLong();
      System.out.print("Informe a media dos exercicios: ");
      float mediaexercicio = lerdados.nextFloat();
      System.out.print("Informe a primeira nota: ");
      float nota1 = lerdados.nextFloat();
      System.out.print("Informe a segunda nota: ");
      float nota2 = lerdados.nextFloat();
      System.out.print("Informe a terceira nota: ");
      float nota3 = lerdados.nextFloat();
      media = ((nota1+ (nota2*2) + (nota3 *3) + mediaexercicio)/7 );
      if(media>=90){
        aproveitamento = "A";
      }
      else if(media>=75 && media<90){
       aproveitamento = "B"; 
      }
      else if(media >=60 && media <75){
          aproveitamento = "C";
      }
      else if(media>=40 && media<60) {
        aproveitamento = "D";
      }
      else {
        aproveitamento = "E";   
      }
      
      
      
      System.out.println("--------INFORMAÇÕES DO ALUNO-------------");
      System.out.println("IDENTIFICACAO: "+identificacao);
      System.out.println("PRIMEIRA NOTA: " +nota1);
      System.out.println("SEGUNDA NOTA: " +nota2);
      System.out.println("TERCEIRAA NOTA: " +nota3);
      System.out.println("MEDIA DOS EXERCICIOS: "+mediaexercicio);
      System.out.println("MEDIA TOTAL: " +media);
      System.out.println("CONCEITO: " +aproveitamento);
      
      switch(aproveitamento) {
        case "A":
        case "B":
        case "C":
             System.out.println("ALUNO APROVADO!");
             break;
        case "D":
        case "E": 
                System.out.println("ALUNO REPROVADO!");
                break;
        default:
            System.out.println("ALGUMA INFORMAÇÃO ESTÁ ERRADA NO SISTEMA!");
      }
      
    }      
      
      
  }
   
      
  }

