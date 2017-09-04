/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author thassya
 */
public class Aluno {

    private String nome;
    private AlunoEstado estado;

    public Aluno() {
        this.estado = new AlunoEstadoMatriculado();
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    public String geteNomeEstado() {
        return estado.getEstado();
    }

    //injeção de dependência!!! com inversão de controle
    
    public String matricular() {
        return estado.matricular(this);
    }

    public String formar() {
        return estado.formar(this);
    }

    public String Jubuliar() {
        return estado.jubilar(this);
    }

    public String trancar() {
        return estado.trancar(this);
    }

    public String evadir() {
        return estado.evadir(this);
    }

//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
