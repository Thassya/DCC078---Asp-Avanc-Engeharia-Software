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
public class AlunoEstadoTrancado implements AlunoEstado {
    public String getEstado() {
        return "Trancado";
    }

    @Override
    public String matricular(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoMatriculado());
        return "Pode matricular";
    }

    public String formar(Aluno aluno) {
        return "Não pode formar";
    }

    @Override
    public String jubilar(Aluno aluno) {
        return "Pode jubilar";
    }

    @Override
    public String evadir(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoEvadido());
        return "Pode evadir";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "Já é o estado";
    }
    
}
