

package com.mycompany.apostilaexerciciosdois;
/**
 *
 * @author Bianca
 */


import java.util.Scanner;

public class ApostilaExerciciosDois {

    public static void main(String[] args) {
        Scanner lerdados = new Scanner(System.in);
        double novosalario;
        System.out.print("Informe o nome do funcionário: ");
        String nome = lerdados.nextLine();
        System.out.print("Informe o seu salario:R$" );
        double salario = lerdados.nextDouble();
        System.out.print("Informe quantos anos o funcionario está na empresa: ");
        int anos = lerdados.nextInt();
        if(anos<3) {
            novosalario = (salario*103)/100;
            System.out.println(nome + ", você está há " +anos+" anos na empresa!");
            System.out.println("Irá receber o aumento de 3%");
            System.out.println("Salário anterior: R$" + salario);
            System.out.println("Salaro novo: R$" + novosalario);
        }
        else if(anos>=3 && anos<10){
            novosalario = (salario*112.5)/100;
            System.out.println(nome + ", você está há " +anos+" anos na empresa!");
            System.out.println("Irá receber o aumento de 12,5%");
            System.out.println("Salário anterior: R$" + salario);
            System.out.println("Salaro novo: R$" + novosalario);
        }
        else {
            novosalario = (salario*120)/100;
            System.out.println(nome + ", você está há " +anos+" anos na empresa!");
            System.out.println("Irá receber o aumento de 20%");
            System.out.println("Salário anterior: R$" + salario);
            System.out.println("Salaro novo: R$" + novosalario);
        }
    }
    
    
}


    
      
  
   
      
  

