

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */

import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
       double totalultrapassado, multa;
        Scanner lerinfos = new Scanner(System.in);
        System.out.print("Informe a velocidade do carro: ");
        double km = lerinfos.nextDouble();
        totalultrapassado = km - 80;
        multa = totalultrapassado*5;
        if(km>80){
            System.out.println("MULTA POR VELOCIDADE ULTRAPASSADA!");
            System.out.println("USUÁRIO PASSOU " + totalultrapassado + " km a mais do permitido!");
            System.out.print("MULTA A PAGAR: R$" + multa+ "reais");
        }
  }
    
}


    
      
  
   
      
  

