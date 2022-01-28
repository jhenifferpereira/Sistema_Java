package br.com.cervejaria.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionFactory {
    
     public static Connection conectar() throws Exception{
    
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("conectou");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/cervejaria","postgres","12345");
        }catch(Exception e){
            throw new Exception("Erro ao conectar no banco: " + e.getMessage());
        }
    
    }

    
     public static void fecharConexao(Connection conn, Statement stmt, ResultSet rs ) throws Exception{
         
          try{
           if(conn != null){
               conn.close();
           }
           if(stmt != null){
               stmt.close();
           }
           if(rs != null){
               rs.close();
           }
        }
        
        catch(Exception e){
            throw new Exception("Erro ao fechar conecção: " + e.getMessage());
        }
     }
            
     
    
    
}
