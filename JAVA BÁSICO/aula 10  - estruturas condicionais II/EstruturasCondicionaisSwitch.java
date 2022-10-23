/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturacondicionalswitch;
import java.util.Scanner;
/**
 *
 * @author Bianca
 */
public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        String tipo;
        System.out.print("Informe a quantidade de pernas: ");
        int pernas = leituradados.nextInt();
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4: 
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Tipo: " +tipo);
    }
}
