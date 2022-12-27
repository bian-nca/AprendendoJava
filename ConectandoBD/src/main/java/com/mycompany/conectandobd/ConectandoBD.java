/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conectandobd;

/**
 *
 * @author Bianca
 */
public class ConectandoBD {

    public static void main(String[] args) {
        ConexaoDAO conectar = new ConexaoDAO();
        conectar.conectaBD();
    }
}
