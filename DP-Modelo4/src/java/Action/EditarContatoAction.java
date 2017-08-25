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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thassya
 */
public class EditarContatoAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
         String codigo = request.getParameter("id");
         String nome = request.getParameter("textNome");
         String email = request.getParameter("textEmail");
         
         if(codigo==null || codigo.equals("")){
              response.sendRedirect("index.jsp");
         }
         else{
            try{
                int codInt = Integer.parseInt(codigo);
                Contato c = new Contato();
                c.setId(codInt);
                c.setNome(nome);
                c.setEmail(email);
                
                ContatoDAO.getInstance().update(c);
                
                              
                RequestDispatcher view = request.getRequestDispatcher("Contato/ContatoBusca.jsp");
                view.forward(request, response);
                
            } catch(SQLException e){
                response.sendRedirect("Contato/ContatoErro.jsp");
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServletException ex) {
                Logger.getLogger(LerContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
