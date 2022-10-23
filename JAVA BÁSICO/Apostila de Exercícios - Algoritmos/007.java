/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 * 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666

* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float dobro, meio;
        System.out.print("Informe um numero real: ");
        float numerodigitado = leituradados.nextFloat();
        dobro = numerodigitado*2;
        meio = numerodigitado/3;
           System.out.println("NUMERO DIGITADO: ");
           System.out.println("DOBRO: " +dobro);
           System.out.println("TERÇA PARTE: " +meio);
            
 
        
    
    }
}
