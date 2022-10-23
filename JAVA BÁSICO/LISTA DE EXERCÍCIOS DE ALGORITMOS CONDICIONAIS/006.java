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
        /* Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
imprimir o resultado desta operação.*/
        Scanner valorlogico = new Scanner(System.in);
        System.out.print("Informe um valor booleano (lógico): [TRUE/FALSE]");
        boolean v1 = valorlogico.nextBoolean();
        System.out.print("Informe outro valor booleano: [TRUE/FALSE] ");
        boolean v2 = valorlogico.nextBoolean();
        if(v1==true && v2==true){
            System.out.println("OS DOIS VALORES BOOLEANOS SÃO VERDADEIROS!");
        }
        else if(v1==false && v2==false){
            System.out.println("OS DOIS VALORES BOOLEANOS SÃO FALSOS!");
        }
        else{
            System.out.println("UM DOS VALORES É FALSO E O OUTRO É VERDADEIRO!");
            System.out.println("O primeiro valor booleano é " +v1);
            System.out.println("O segundo valor booleano é " +v2);
        }
    }
}
