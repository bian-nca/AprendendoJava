/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ordenandovetores;

/**
 *
 * @author Bianca
 */
public class OrdenandoVetores {

    public static void main(String[] args) {
        int vetores[] = new int [10];
        System.out.println("----------MEU VETOR DESORDENADO---------");
        for(int contador=0; contador<vetores.length; contador++){
            vetores[contador] = (int) (Math.random()*vetores.length);
            System.out.print(" "+ vetores[contador] + " ");
        }
    }
}
