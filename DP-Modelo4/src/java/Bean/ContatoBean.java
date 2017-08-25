/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Empresa;
import Persistencia.EmpresaDAO;

/**
 *
 * @author thassya
 */
public class ContatoBean {
    public List<Empresa> getEmpresas() throws ClassNotFoundException, SQLException {
        List<Empresa> empresas = new ArrayList<Empresa>();
       
        empresas = EmpresaDAO.getInstance().getAll();

        return empresas;
    }
}
