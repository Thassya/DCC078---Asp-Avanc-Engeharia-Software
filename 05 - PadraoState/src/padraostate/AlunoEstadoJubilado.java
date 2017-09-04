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
public class AlunoEstadoJubilado implements AlunoEstado {
    public String getEstado() {
        return "Jubilado";
    }

    @Override
    public String matricular(Aluno aluno) {
        return "Não pode matricular";
    }

    public String formar(Aluno aluno) {
        return "";
    }

    @Override
    public String jubilar(Aluno aluno) {
        return "É o estado atual";
    }

    @Override
    public String evadir(Aluno aluno) {
        return "Não pode evadir";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "não pode trancar";
    }
    
}
