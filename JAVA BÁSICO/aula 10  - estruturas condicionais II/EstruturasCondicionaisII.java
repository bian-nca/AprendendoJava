/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturascondicionaisii;
import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class EstruturasCondicionaisII {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        int idade;
        System.out.print("Informe o seu nome: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe o ano de nascimento: ");
        int anonasc = leituradados.nextInt();
        System.out.print("Informe o ano atual: ");
        int anoatual = leituradados.nextInt();
        idade = anoatual - anonasc;
        System.out.println("--------INFORMAÇÕES SOBRE O USUÁRIO--------");
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.print("SITUAÇÃO: ");
        if(idade<16) {
            System.out.println("NÃO VOTA");
        }
        else if((idade>70) || (idade>=16 && idade<18)) {
            System.out.print("VOTO OPC1ONAL");
        } 
            else{
                    System.out.println("OBRIGATÓRIO");
                    }
        }
    }
