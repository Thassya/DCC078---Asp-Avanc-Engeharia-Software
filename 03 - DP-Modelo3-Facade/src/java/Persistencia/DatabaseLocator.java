/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
                (Connection) DriverManager.getConnection("jdbc:mysql://172.18.10.31/asp_avanc_eng_softw", "", "");
        return conn;
    }
}


