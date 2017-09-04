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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thassya
 */
public class GravarEmpresaAction implements Action {

    public GravarEmpresaAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String descricao = request.getParameter("txtDescricao");
        if (descricao == null || descricao.equals("")) {
            //response.sendRedirect();
        } else {
            try {
                Empresa empresa = new Empresa(descricao);
                EmpresaDAO.getInstance().save(empresa);
                response.sendRedirect("Sucesso.jsp");
            } catch (SQLException e) {
                response.sendRedirect("Erro.jsp");
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
