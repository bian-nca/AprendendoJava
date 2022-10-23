/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 *15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float salario;
        System.out.print("Informe o nome do funcionario: ");
        String nome = leituradados.nextLine();
        System.out.print("Quantos dias você trabalhou durante esse mês? ");
        int diastrabalhados = leituradados.nextInt();
        /*Se ele ganha R$25,00 reais por HORA trabalhada e trabalha OITO HORAS por dia
        consequentemente ele ganha R$200,00 reais por dia*/
        salario = 200*diastrabalhados;
        System.out.println("NOME DO FUNCIONARIO: "+nome);
        System.out.println("DIAS TRABALHADOS: "+diastrabalhados);
        System.out.println("SALÁRIO TOTAL: R$"+salario+" reais");
        System.out.println("-----------UPDATES------------");
        System.out.println("NOME: " +nome);
        System.out.println("SALARIO: " + salario);
        
                
                }
}
