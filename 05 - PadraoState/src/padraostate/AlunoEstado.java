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
public interface AlunoEstado {
    public String getEstado();
    
    public String matricular(Aluno aluno);
    public String formar(Aluno aluno);
    public String jubilar(Aluno aluno);
    public String evadir(Aluno aluno);
    public String trancar(Aluno aluno);
    
}
