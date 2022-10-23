/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.selectionsort;

/**
 *
 * @author Bianca
 */
public class SelectionSort {

    public static void main(String[] args) {
       int vetores[] = new int[10];
       System.out.println("-----------MEU VETOR DESORDENADO----------");
       for(int i =0; i<vetores.length; i++){
           vetores[i] = (int) (Math.random()*100);
           System.out.print(" {"+vetores[i]+ " }");
       }
       
       long inicio = System.currentTimeMillis();
        long fim;
        
        System.out.println();
        System.out.println("----------MEU VETOR ORDENADO----------");
        
        int auxiliar;
        for(int i=0; i<vetores.length-1; i++){
            for(int j=i+1; j<vetores.length; j++){
                if(vetores[j] < vetores[i]){
                    auxiliar = vetores[j];
                    vetores[j] = vetores[i];
                    vetores[i] = auxiliar;
                }
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));
        for(int a=0; a<vetores.length; a++){
            System.out.print("{ " + vetores[a]+ "}");
        }
            }
        
        }
       
       
    }
}
