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
 * @author 08240104690
 */
public class LerContatoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String codigo = request.getParameter("codigo");
        
        if(codigo.equals("")){
            response.sendRedirect("index.jsp");
        }
        else{
            try{
                int codInt = Integer.parseInt(codigo);
                Contato c = ContatoDAO.getInstance().getContato(codInt);
                
                request.setAttribute("id", c.getId());
                request.setAttribute("nome", c.getNome());
                request.setAttribute("email", c.getEmail());
                
                RequestDispatcher view = request.getRequestDispatcher("Contato/ContatoBusca.jsp");
                view.forward(request, response);
                
            } catch(SQLException e){
                response.sendRedirect("Erro.jsp");
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServletException ex) {
                Logger.getLogger(LerContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
