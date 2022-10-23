/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 * @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        System.out.print("Informe o nome do funcionário: ");
        String funcionario = leituradados.nextLine();
        System.out.print("Informe o salário " + funcionario + ": ");
        float salario = leituradados.nextFloat();
        System.out.println("---------INFORMAÇÕES DO FUNCIONARIO-----------");
        System.out.println("NOME DO FUNCIONÁRIO: " + funcionario);
        System.out.println("SALÁRIO: " + salario);
        System.out.println("O (a) funcionário(a) " +funcionario+ " tem um salário de R$"+salario + " reais!");
    }
}
