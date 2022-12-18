package com.mycompany.siscons.calculadorapoo;

/**
 *
 * @author Bianca
 */
import java.util.Scanner;
public class CalculadoraPoo {

    public static void main(String[] args) {
        Scanner lernumeros = new Scanner(System.in);
        int escolha, resultado;
        Matematica n1 = new Matematica();
        Matematica n2 = new Matematica();
        System.out.print("Informe o primeiro numero: ");
        n1.setNumero(lernumeros.nextInt());
        System.out.print("Informe o segundo numero: ");
        n2.setNumero(lernumeros.nextInt());
        System.out.println("Informe a operação que voce deseja: ");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.print("OPERACAO: ");
        escolha = lernumeros.nextInt();
        switch (escolha){
            case 1:
             resultado = (n1.getNumero()+n2.getNumero());
             System.out.println("A soma entre o número " +n1.getNumero()+ " e o número " +n2.getNumero()+ " é igual a = " +resultado);
             break;
            case 2:
             resultado = (n1.getNumero()-n2.getNumero());
             System.out.println("A subtração entre o número " +n1.getNumero()+ " e o número " +n2.getNumero()+ " é igual a = " +resultado);
             break;
            case 3: 
                resultado = (n1.getNumero()*n2.getNumero());
                System.out.println("A multiplicação entre o número " +n1.getNumero()+ " e o número " +n2.getNumero()+ " é igual a = " +resultado);
                break;
            case 4:
                resultado = (n1.getNumero()/n2.getNumero());
                System.out.println("A divisão entre o número " +n1.getNumero()+ " e o número " +n2.getNumero()+ " é igual a = " +resultado);
                break;
            default:
                System.out.println("Algo está errado ao passar os valores!");
        }
            
    }
 }
