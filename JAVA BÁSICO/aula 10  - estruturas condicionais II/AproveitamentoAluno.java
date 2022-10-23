/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aproveitamentoaluno;
import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class AproveitamentoAluno {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        float media;
        System.out.print("Informe o nome do aluno: ");
        String nome = leituradados.nextLine();
        System.out.print("Informe a primeira nota do aluno: ");
        float nota1 = leituradados.nextFloat();
        System.out.print("Informe a segunda nota do aluno: ");
        float nota2 = leituradados.nextFloat();
        media = (nota1+nota2)/2;
        System.out.println("----------APROVEITAMENTO DO ALUNO-----------");
        System.out.println("NOME: " +nome);
        System.out.println("PRIMEIRA NOTA: " +nota1);
        System.out.println("SEGUNDA NOTA: "+ nota2);
        System.out.println("MEDIA: " +media);
        if(media>=9 && media<=10){
            System.out.print("APROVEITAMENTO: A!");
        }
        else if(media>=7 && media<=8) {
            System.out.println("APROVEITAMENTO: B!");
        }
            else if(media>=5 && media<=6) {
                System.out.println("APROVEITAMENTO: C!");
            }
                else if(media>=3 && media<=4) {
                    System.out.println("APROVEITAMENTO: D!");
                }
                    else if(media>=1 && media<=2) {
                        System.out.println("APROVEITAMENTO: E!");
                    }
                        else{
                        System.out.println("APROVEITAMENTO: F");
                        System.out.println("REPROVADO!");
                    } 
    }
}

/*
A	10 - 9
B	8 - 7
C	6 - 5
D	4 - 3
E	2 - 1
F	reprovado

*/