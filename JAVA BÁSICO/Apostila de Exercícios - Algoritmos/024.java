

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */


import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        
      Scanner lerdados = new Scanner(System.in);
      double valorpassagem, total;
      System.out.print("Informe o km rodado que você deseja percorrer: ");
      int kmrodadodesejado = lerdados.nextInt();
      if(kmrodadodesejado<=200){
          valorpassagem = 0.50;
          total = 0.50 * kmrodadodesejado;
          System.out.println("Como você deseja percorrer " + kmrodadodesejado + "km, o´preço a se pagar pela passagem é igual: ");
          System.out.println("POR km: R$0,50 reais");
          System.out.println("Total a pagar R$"+total+" reais");
      } else {
          valorpassagem = 0.45;
          total = 0.45 * kmrodadodesejado;
          System.out.println("Como você deseja percorrer " + kmrodadodesejado + "km, o´preço a se pagar pela passagem é igual: ");
          System.out.println("POR km: R$0,45 reais");
          System.out.println("Total a pagar R$"+total+" reais");
      }
    }
    
}


    
      
  
   
      
  

