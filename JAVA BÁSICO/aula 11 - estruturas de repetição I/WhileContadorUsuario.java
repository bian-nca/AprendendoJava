/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilecontadorusuario;

import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class WhileContadorUsuario {

    public static void main(String[] args) {
        Scanner leituradados = new Scanner(System.in);
        System.out.print("Informe o inicio do contador: ");
        int continicio = leituradados.nextInt();
        System.out.print("Informe o fim do contador: ");
        int contfim = leituradados.nextInt();
        while (continicio<contfim) {
            System.out.println("Inicio: " +continicio);
            continicio++;
        }
       
        System.out.print("FIM  !!!!");
    }
}
        
    

