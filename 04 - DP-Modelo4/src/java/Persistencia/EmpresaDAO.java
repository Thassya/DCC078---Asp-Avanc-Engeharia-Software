/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.Statement;
import Model.Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thassya
 */
public class EmpresaDAO {

    private static EmpresaDAO instance;

    private EmpresaDAO() {

    }

    public static EmpresaDAO getInstance() {
        if (instance == null) {
            instance = new EmpresaDAO();
        }
        return instance;
    }

    public void save(Empresa empresa) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("INSERT INTO empresas (descricao)"
                    + " VALUES ('" + empresa.getDescricao() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void update(Empresa empresa) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.executeUpdate("UPDATE empresas set descricao = '" + empresa.getDescricao()
                    + "' WHERE id = " + empresa.getId());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void excluir(int id) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.prepareStatement("DELETE FROM empresas WHERE id = ?");
            st.setInt(1, id);
            st.execute();

        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public Empresa getEmpresa(int id) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.prepareStatement("SELECT * FROM empresas WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return new Empresa(
                        rs.getInt("id"),
                        rs.getString("descricao")
                );
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
        return null;
    }

    public List<Empresa> getAll() throws ClassNotFoundException, SQLException {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Connection conn = null;
        Statement st = null;
        
        try {
            String query = "SELECT * FROM empresas ";
            
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);
           
            while(rs.next()){
                Empresa emp = new Empresa(rs.getInt("id"),rs.getString("descricao"));
                empresas.add(emp);            
            }

        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
        
        return empresas;
    }
    
    private void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }

        } catch (SQLException e) {

        }
    }
}
