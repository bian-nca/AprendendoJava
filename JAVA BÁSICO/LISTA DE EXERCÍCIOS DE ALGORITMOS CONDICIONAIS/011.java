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
        
        /* 11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço 
normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir 
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 10% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em duas vezes, preço normal de etiqueta mais juros de 10%  */
        
    Scanner lerdados = new Scanner(System.in);
    float novo_valor;
    System.out.print("Informe o preço original, ou seja, sem desconto ou promocação: R$");
    float valor_original = lerdados.nextFloat();
    System.out.println("----------FORMAS DE PAGAMENTO-----------");
    System.out.println("[1] - A VISTA NO DINHEIRO OU CHEQUE");
    System.out.println("[2] - A VISTA NO CARTAO DE CREDITO");
    System.out.println("[3] - PARCELADO 2X SEM JUROS");
    System.out.println("[4] - PARCELADO 2X COM JUROS");
    System.out.print("Informe o numero do caso: ");
    int caso = lerdados.nextInt();
    switch(caso){
        case 1:
            novo_valor = (valor_original*90)/100;
            System.out.println("O cliente irá pagar R$"+novo_valor);
            break;
        case 2:
            novo_valor = (valor_original*85)/100;
            System.out.println("O cliente irá pagar R$"+novo_valor);
            break;
        case 3:
           System.out.println("O cliente irá pagar R$"+valor_original); 
           break;
        case 4:
            novo_valor = (valor_original*115)/100;
            System.out.println("O cliente irá pagar R$"+novo_valor);
            break;
        default:
            System.out.println("CASO INFORMADO INVÁLIDO!");
    }
    
    
    }  
      
  }
   
      
  

