

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */

import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        /*  Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e 
estado civil seja “CASADA”, solicitar o tempo de casada (anos). */
        
        Scanner lerdados = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = lerdados.nextLine();
        
        System.out.print("Informe o sexo biológico[F | M]: ");
        String identificacao = lerdados.nextLine();
        
        System.out.print("Informe o seu estado civil: ");
        String civil = lerdados.nextLine();
        
        if(identificacao=="F" && civil=="casada"){
            System.out.print(nome+ ", quanto tempo você está casada? ");
            int anoscas = lerdados.nextInt();
        }
        else{
            System.out.println("------INFORMAÇÕES DO USUÁRIO-----------");
            System.out.println("NOME: " +nome);
            System.out.println("SEXO: " +identificacao);
            System.out.println("ESTADO CIVIL: " +civil);
        
        }
  }
    
}


    }  
      
  
   
      
  

