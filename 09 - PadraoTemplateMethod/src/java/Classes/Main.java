/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author thassya
 */
public class Main {
    public static void main(String[] args) {
        AlunoGraduacao aluno1 = new AlunoGraduacao();
        aluno1.setNome("Marco");
        aluno1.setInstituicaoOrigem("IF Sudeste MG");
        
        AlunoPosGraduacao aluno2 = new AlunoPosGraduacao();
        aluno2.setNome("Antonio");
        aluno2.setInstituicaoOrigem("UFJF");
        
        System.out.println(aluno1.getDadosAluno());
        System.out.println(aluno2.getDadosAluno());
    }
    
}
