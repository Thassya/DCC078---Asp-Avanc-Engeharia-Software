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
public class AlunoEstadoMatriculado implements AlunoEstado {
    public String getEstado() {
        return "Matriculado";
    }

    
    public String matricular(Aluno aluno) {
        return "Já o estado atual";
    }

    
    public String formar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoFormado());
        return "Formado";
    }

    @Override
    public String jubilar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Pode jubilar";
    }

    @Override
    public String evadir(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoEvadido());
        return "Pode evadir";
    }

    @Override
    public String trancar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoTrancado());
        return "Pode trancar";
    }
    
}
