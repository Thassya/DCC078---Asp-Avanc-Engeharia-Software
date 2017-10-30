/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc078.padraocomposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author thassya
 */
public class Unidade extends Conteudo {

    private ArrayList conteudos = new ArrayList();

    public Unidade(String descricao) {
        super(descricao);
    }

    public void addConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    //PADRAO ITERATOR
    public String getDescricao() {
        String descricaoSaida = this.descricao + "\n";
        for(Iterator i = conteudos.iterator(); i.hasNext();){
            Conteudo conteudo = (Conteudo)i.next();
            descricaoSaida = descricaoSaida + conteudo.getDescricao();
        }
        return descricaoSaida;
    }

}
