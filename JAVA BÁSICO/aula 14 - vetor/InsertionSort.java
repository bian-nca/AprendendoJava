/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.insertionsort;

/**
 *
 * @author Bianca
 */
public class InsertionSort {

    public static void main(String[] args) {
        int vetores[] = new int[1000];
          System.out.println("------MEU VETOR DESORDENADO-------");
        for(int contador=0; contador<vetores.length; contador++){
            vetores[contador] = (int) (Math.random()*vetores.length);
            System.out.print("{ " + vetores[contador] + " }");
        }
        long inicio = System.currentTimeMillis();
        long fim;
        System.out.println();
        System.out.println("----------MEU VETOR ORDENADO----------");
        
        int aux;
        int j;
        for(int i =1; i<vetores.length; i++){
         aux = vetores[i];
         j = i-1;
         while(j>=0 && aux<vetores[j]){
             vetores[j+1] = vetores[j]; 
             j--;
         }
         vetores[j+1] = aux;
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));
        for(int i=0; i<vetores.length; i++){
            System.out.print("{ " + vetores[i]+ "}");
        }
    
    }
   
}
