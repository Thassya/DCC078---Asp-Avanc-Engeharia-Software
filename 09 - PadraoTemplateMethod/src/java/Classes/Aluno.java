package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thassya
 */
public abstract class Aluno {

    private String nome;
    private String instituicaoOrigem;

    public abstract String getOrigem();

    //Superclasse delega metodo para a subclasse resolver.
    //neste caso delegamos o nome da instituição: se Faculdade ou Colégio. 
    public String getDadosAluno() {
        return "Aluno: " + getNome() + " - Origem: " + getOrigem() + getInstituicaoOrigem();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }
}
