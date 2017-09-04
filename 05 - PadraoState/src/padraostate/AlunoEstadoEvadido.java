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
public class AlunoEstadoEvadido implements AlunoEstado {

    public String getEstado() {
        return "Evadido";
    }

    @Override
    public String matricular(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoMatriculado());
        return "Matricular pode";
    }

    public String formar(Aluno aluno) {
        return "Não pode formar";
    }

    @Override
    public String jubilar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Pode ser feito o jubilamento";
    }

    @Override
    public String evadir(Aluno aluno) {
        return "Já é o estado";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "não pode";
    }
}
