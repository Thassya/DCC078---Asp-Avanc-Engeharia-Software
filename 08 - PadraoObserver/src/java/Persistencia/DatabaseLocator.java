/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thassya
 */
public class DatabaseLocator {
    public static DatabaseLocator instance = null;
    
    private DatabaseLocator(){
        
    }
    
    public static DatabaseLocator getInstance() throws ClassNotFoundException, SQLException{
        if(instance == null)
            instance = new DatabaseLocator();
        return instance;
    }
    
     public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =
        (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/asp_avan_eng_soft", "root", "");
         
        return conn;
    }
}
