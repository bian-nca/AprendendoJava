/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.
* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float novosalario;
        System.out.print("Informe o nome do funcionario: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe o salario: ");
        float salario = leituradados.nextFloat();
        novosalario = (salario*115)/100;
        System.out.println("-----------UPDATES------------");
        System.out.println("NOME: " +nome);
        System.out.println("SALARIO: " + salario);
        System.out.println("NOVO SALARIO: " +novosalario);
                
                }
}
