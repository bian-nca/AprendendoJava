/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturascondicionaisparimpar;
import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class EstruturasCondicionaisParImpar {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        
        
        System.out.print("Informe o número escolhido: ");
        float numero = leituradados.nextFloat();
        System.out.print("O número " + numero + " é ");
       
        if (numero%2==0) {
            System.out.println("PAR!");
        }
        else {
            System.out.println("ÍMPAR!");
        }
        }
    }

