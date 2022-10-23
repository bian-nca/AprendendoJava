/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apostilaexercicios;

/**
 *20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
* @author Bianca
 */
import java.util.Scanner;
public class ApostilaExercicios {

    public static void main(String[] args) {
     Scanner lerdados = new Scanner(System.in);
     System.out.println("--------------ALUGUEL DE CARROS------------");
     float totalpagar, totalkm, totaldias;
     System.out.print("Informe quantos dias o carro ficou alugado: ");
     int dias = lerdados.nextInt();
     totaldias = dias *90;
     System.out.print("Informe a quantidade de km rodado: ");
     float kmrodado = lerdados.nextFloat();
     totalkm = (float) (0.20*kmrodado);
     totalpagar = totalkm+totaldias;
     System.out.println("CARRO FICOU ALGUDADO POR " + dias + " DIAS");
     System.out.println("KM RODADOS: " + kmrodado);
     System.out.println("TOTAL A PAGAR: R$"+totalpagar + " reais!");
}
}