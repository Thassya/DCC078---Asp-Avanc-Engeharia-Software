package br.ufjf.dcc078.padraobuilder;

/**
 *
 * @author thassya
 */
public class Matricula {
    
    //você não precisa gostar, mas o padrão sugere que objeto pode ser construido de qualquer forma, 
    //passando os atributos em qualquer ordem. Geralmente a ordem
    public void matricular(){
        Aluno aluno = new Aluno();
        aluno.setEmail("email@email.com").setNome("Nome").setTelefone("32119134").setEndereco("End").setMatricula(123);
    }
}
