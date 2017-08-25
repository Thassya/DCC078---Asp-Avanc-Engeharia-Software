/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import Controller.Action;
import Model.Empresa;
import Persistencia.EmpresaDAO;
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
public class LerEmpresaAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String codigo = request.getParameter("codigo");
        
        if(codigo.equals("")){
            response.sendRedirect("index.jsp");
        }
        else{
            try{
                int codInt = Integer.parseInt(codigo);
                Empresa e = EmpresaDAO.getInstance().getEmpresa(codInt);
                
                request.setAttribute("id", e.getId());
                request.setAttribute("descricao", e.getDescricao());
                
                RequestDispatcher view = request.getRequestDispatcher("Empresa/EmpresaBusca.jsp");
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
