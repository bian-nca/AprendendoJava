/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoreslogicosrelacionais;

import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class OperadoresLogicosRelacionais {

    public static void main(String[] args) {
       /* int result;
        Scanner numerosdigitados = new Scanner(System.in);
      
        System.out.println("   OPERADORES LÓGICOS E RELACIONAIS!!   ");
        System.out.print("Informe o primeiro número: ");
        int numberone = numerosdigitados.nextInt();
        System.out.print("Informe o segundo número: ");
        int numbertwo = numerosdigitados.nextInt();
        result = (numberone>numbertwo)?numberone+numbertwo:numberone-numbertwo;
        System.out.println("O maior número digitado foi: " +result);
*/
       
       String nome1 = "Bianca";
       String nome2 = "Bianca";
       String nome3 = new String("Gustavo");
       
       String comparation;
       
       comparation = (nome1.equals(nome3))? "iguais":"diferente";
       System.out.println("Os nomes são " +comparation);
//Nesse caso irá dar DIFERENTES pois no nome3 eu estou INSTANCIANDO UM OBJETO DE UMA CLASSE e o nome1/nome2 são VARIÁVEIS

}
}
