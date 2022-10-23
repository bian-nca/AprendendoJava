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
        int vetores[] = new int [200];
        System.out.println("----------MEU VETOR DESORDENADO---------");
        for(int contador=0; contador<vetores.length; contador++){
            vetores[contador] = (int) (Math.random()*100);
            System.out.print(" "+ vetores[contador] + " ");
        }
        long inicio = System.currentTimeMillis();
        long fim;
        System.out.println();
        System.out.println("--------MEU VETOR ORDENADO--------");
   
        int auxiliar;
        for(int cc=0; cc <vetores.length; cc++){
            for(int j = cc+1; j<vetores.length; j++){
                if(vetores[cc]>vetores[j]){
                    auxiliar = vetores[cc];
                    vetores[cc] = vetores[j];
                    vetores[j] = auxiliar;
                }
            }
          }
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));
        for(int i=0; i<vetores.length; i++){
            System.out.print("{ " + vetores[i]+ "}");
        }
        
 }
        }

    