/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadorlogicoexercicio;

import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class OperadorLogicoExercicio {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        int idade;
        String resultado;
        System.out.println(" DESCUBRA SE VOCÊ É OBRIGADO A VOTAR OU NÃO!!!!");
        System.out.print("Informe o seu nome: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe o seu ano de nascimento (XXXX): ");
        int anonasc = leituradados.nextInt();
        System.out.print("Informe o ano atual (XXXX): ");
        int anoatual = leituradados.nextInt();
        idade = anoatual - anonasc;
        resultado = (idade>=18 && idade<=70)? "Obrigatório":"Opcional";
        System.out.println( nome + ", você tem " + idade + " anos. Portanto, seu voto é " +resultado);
        
    }
}
