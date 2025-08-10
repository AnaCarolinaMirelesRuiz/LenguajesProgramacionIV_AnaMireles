/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomexicano_actividad2_anamireles;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anaca
 */
public class ConexionC {
    
    public Connection getConnection(){
    Connection con = null;
    String base = "Bancobd";
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root";
    String password = "1234";
    
    try{
            Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection(url, user, password);
    } catch (Exception e){
        System.err.print(e);
    }
    
    return con;
}
}

