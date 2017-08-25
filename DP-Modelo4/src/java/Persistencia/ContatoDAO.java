/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Model.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 08240104690
 */
public class ContatoDAO {

    private static ContatoDAO instance;

    private ContatoDAO() {

    }

    public static ContatoDAO getInstance() {
        if (instance == null) {
            instance = new ContatoDAO();
        }
        return instance;
    }

    public void save(Contato contato) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("INSERT INTO contatos (nome, email, id_empresa)"
                    + " VALUES ('" + contato.getNome() + "', '" + contato.getEmail() + "' , " + contato.getIdEmpresa() + ")");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void update(Contato contato) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.executeUpdate("UPDATE contatos set nome = '" + contato.getNome()
                    + "', email = '" + contato.getEmail() + "', id_empresa = " + contato.getIdEmpresa() + " WHERE id = " + contato.getId());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public List<Contato> lista() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet res = null;
        List<Contato> resultado = new ArrayList<Contato>();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            res = st.executeQuery("SELECT * FROM contatos");

            while (res.next()) {
                Contato c = new Contato();
                c.setId(res.getInt("id"));
                c.setNome(res.getString("nome"));
                c.setEmail(res.getString("email"));
                c.setIdEmpresa(res.getInt("id_empresa"));
                resultado.add(c);
            }

            return resultado;

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
            st = conn.prepareStatement("DELETE FROM contatos WHERE id = ?");
            st.setInt(1, id);
            st.execute();

        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public Contato getContato(int id) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.prepareStatement("SELECT * FROM contatos WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return new Contato(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getInt("id_empresa")
                );
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
        return null;
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
