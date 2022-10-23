

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */


import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        Scanner lernumeros = new Scanner(System.in);
        System.out.print("Informe um numero: " );
        int numberone = lernumeros.nextInt();
        System.out.print("Informe outro numero: ");
        int numbertwo = lernumeros.nextInt();
        if(numberone > numbertwo){
            System.out.println("O primeiro valor é o maior");
        }
        else if(numberone < numbertwo) {
               System.out.println("O segundo valor é o maior!"); 
                }
        else{
             System.out.println("Não existe valor maior, os dois são iguais!");
        }
    
    }
    
    
}


    
      
  
   
      
  

