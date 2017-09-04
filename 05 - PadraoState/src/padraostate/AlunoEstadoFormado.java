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
public class AlunoEstadoFormado implements AlunoEstado {

    public String getEstado() {
        return "Formado";
    }

    @Override
    public String matricular(Aluno aluno) {
        return "Matricula não pode ser realizada pois o aluno já formou";
    }

    public String formar(Aluno aluno) {
        return "";
    }

    @Override
    public String jubilar(Aluno aluno) {
        return "Jubilamento não pode ser realizado pois o aluno já formou";
    }

    @Override
    public String evadir(Aluno aluno) {
        return "Evasão não pode ser realizada pois o aluno já formou";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "Trancamento não pode ser realizado pois o aluno já formou";
    }

}
