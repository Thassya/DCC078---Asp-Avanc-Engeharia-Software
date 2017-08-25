/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 08240104690
 */
public class Contato {

    private int id;
    private String nome;
    private String email;
    private int idEmpresa;

    public Contato() {

    }

    public Contato(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    public Contato(String nome, String email, int idEmpresa) {
        super();
        this.nome = nome;
        this.email = email;
        this.idEmpresa = idEmpresa;
    }

    public Contato(int id, String nome, String email) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Contato(int id, String nome, String email, int idEmpresa) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idEmpresa = idEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

}
