/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package url.redes2crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aleja
 */
public class Conexion {
     public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redes2","root","");
            if(connection != null){
                System.out.println("Se realizo la conexion");
            }else{
               System.out.println("No se realizo la conexion"); 
            }
        } catch(SQLException e) {
            System.out.println(e);
            
        }
        return connection;
    }
}
