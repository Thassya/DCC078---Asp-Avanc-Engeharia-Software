/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Contato;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 07228620674
 */
public class ContatoDAO {
   
    private static ContatoDAO instance;
    
    private ContatoDAO(){
        
    }
    
    public static ContatoDAO getInstance(){
        if(instance == null)
            instance = new ContatoDAO();
        return instance;
    }
    
    public void save(Contato contato) throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement st = null;
        
        
        try {
                conn = DatabaseLocator.getInstance().getConnection();
                st = conn.createStatement();
                st.execute("insert into contatos (nome, email)" +
                        " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }

    private void closeResources(Connection conn, Statement st) {
        try {
            if(st!=null) st.close();
            if(conn!=null) conn.close();

        } catch(SQLException e) {

        }
    }
}
