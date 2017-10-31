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
public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(RollDocumentos.getInstance().getTipoDocumentoBoleto());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Diretor";
    }

}
