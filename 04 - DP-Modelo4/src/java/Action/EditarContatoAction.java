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


public class EditarContatoAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
         String codigo = request.getParameter("id");
         String nome = request.getParameter("textNome");
         String email = request.getParameter("textEmail");
         String empresa = request.getParameter("textCodigoEmpresa");
         
         if(codigo==null || codigo.equals("")){
           try {
                request.setAttribute("codigo", codigo);
                request.setAttribute("email", email);
                request.setAttribute("nome", nome);
                request.setAttribute("empresa", empresa);
            
                RequestDispatcher view = request.getRequestDispatcher("Empresa/EmpresaBusca.jsp");
            
                view.forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(EditarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            } 
         }
         else{
            try{
                Contato contato = new Contato(Integer.parseInt(codigo), nome, email, Integer.parseInt(empresa));
                ContatoDAO.getInstance().update(contato);                
                              
                RequestDispatcher view = request.getRequestDispatcher("Contato/Formulario.jsp");
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
