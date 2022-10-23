

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        try{
      Scanner lerinfos = new Scanner(System.in);
      System.out.print("Informe o seu nome: ");
      String nome = lerinfos.nextLine();
      System.out.print("Informe o seu sexo ['F'|'M']: ");
      String sexo = lerinfos.nextLine();
      System.out.print("Informe o valor da sua compra: ");
      double compras = lerinfos.nextDouble();
      if(sexo == "F"){
          double desconto = (compras*87)/100;
          System.out.println(nome +", como é um dia especial para as mulheres, iremos oferecer um desconto de 13%!");
          System.out.println("Sua compra foi de R$" + compras+ " reais para R$" +desconto+ " reais!");
      }
        else {
        double desconto = (compras*95)/100;
         System.out.println("Sua compra foi de R$" + compras+ " reais para R$" +desconto+ " reais!");
      }
        } catch (InputMismatchException erro) {
            System.out.println("Você informou um valor inválido para declarar as compras!");
        }
    }
    
}


    
      
  
   
      
  

public class 023 {
    
}
