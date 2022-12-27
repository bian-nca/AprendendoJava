
package com.mycompany.conectandobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


  public class ConexaoDAO {
      private String conectar;
      
      
    public Connection conectaBD(){  
    Connection conectando = null;
        try{
             String url="jdbc:mysql://localohost:3306/cadastro?user=root&password='1234'";
            conectando = DriverManager.getConnection(url);
      }   catch(SQLException erro) {
       JOptionPane.showMessageDialog(null, "CONEXÃO NÃO ESTABELECIDA!");
}
        return conectando;
    }
}
