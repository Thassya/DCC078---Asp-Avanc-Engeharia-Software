/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Controller.Action;
import Model.Contato;
import Persistencia.ContatoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GravarContatoAction implements Action {
    
    public GravarContatoAction(){
        
    }
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String nome = request.getParameter("textNome");
        String email = request.getParameter("textEmail");
        String empresa = request.getParameter("textCodigoEmpresa");
        
        if(nome.equals("") || email.equals("")){
            response.sendRedirect("Contato/Formulario.jsp");
        }
        else{
            try{
                Contato contato = new Contato(nome, email, Integer.parseInt(empresa));
                ContatoDAO.getInstance().save(contato);
                response.sendRedirect("Sucesso.jsp");
            } catch(SQLException e){
                response.sendRedirect("Erro.jsp");
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
