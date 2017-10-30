/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc078.padraobuilder;

/**
 *
 * @author thassya
 */
public class Aluno {

    private int matricula;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Aluno() {
    }

    
    public Aluno(int matricula, String nome, String endereco, String email, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public Aluno setMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Aluno setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Aluno setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Aluno setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    
}
