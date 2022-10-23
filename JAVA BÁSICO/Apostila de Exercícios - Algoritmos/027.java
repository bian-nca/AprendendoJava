

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */


import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);
        System.out.print("Informe a primeira nota do aluno: ");
        double n1 = lerdados.nextDouble();
        System.out.print("Informe a segunda nota do aluno: ");
        double n2 = lerdados.nextDouble();
        double media = (n1+n2)/2;
        if(media>=7) {
            System.out.println("Aprovado!");
        }
        else if(media<7&& media>=5){
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
    
    
}


    
      
  
   
      
  

