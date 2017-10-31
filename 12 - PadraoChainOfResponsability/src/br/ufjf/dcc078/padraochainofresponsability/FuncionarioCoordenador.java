/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc078.padraochainofresponsability;

/**
 *
 * @author thassya
 */
public class FuncionarioCoordenador extends Funcionario {
    
    public FuncionarioCoordenador(Funcionario superior){
        listaDocumentos.add(RollDocumentos.getInstance().getTipoDocumentoMatricula());
        setFuncionarioSuperior(superior);        
    }

    @Override
    public String getDescricaoCargo() {
       return "Coordenador";
    }
    
}
