/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;
import java.util.Observable;

/**
 *
 * @author thassya
 */
public class Contato {

    private int codigo;
    private String nome;
    private String email;
    //private List<Observable> produtosDesejados;
    private String msgDoObservado;

    public Contato() {

    }

    public Contato(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    public Contato(int codigo, String nome, String email) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }
}
