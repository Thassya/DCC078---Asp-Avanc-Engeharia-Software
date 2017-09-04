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
public class PadraoState {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Rodrigo");
        aluno.setEstado(new AlunoEstadoMatriculado());
        System.out.println("Aluno " + aluno.getNome() + " está no estado: " + aluno.geteNomeEstado() + "\n"
                + " - matricular: " + aluno.matricular() + "\n - formar: " + aluno.formar() + "\n - trancar: " + aluno.trancar() + "\n "
                + "- evadir: " + aluno.evadir() + "\n - jubilar: " + aluno.Jubuliar() + "\n");
        aluno.setEstado(new AlunoEstadoFormado());
        System.out.println("Aluno " + aluno.getNome() + " está no estado: " + aluno.geteNomeEstado() + "\n"
                + " - matricular: " + aluno.matricular() + "\n - formar: " + aluno.formar() + "\n - trancar: " + aluno.trancar() + "\n "
                + "- evadir: " + aluno.evadir() + "\n - jubilar: " + aluno.Jubuliar() + "\n");
        aluno.setEstado(new AlunoEstadoJubilado());
        System.out.println("Aluno " + aluno.getNome() + " está no estado: " + aluno.geteNomeEstado() + "\n"
                + " - matricular: " + aluno.matricular() + "\n - formar: " + aluno.formar() + "\n - trancar: " + aluno.trancar() + "\n "
                + "- evadir: " + aluno.evadir() + "\n - jubilar: " + aluno.Jubuliar() + "\n");
        aluno.setEstado(new AlunoEstadoTrancado());
        System.out.println("Aluno " + aluno.getNome() + " está no estado: " + aluno.geteNomeEstado() + "\n"
                + " - matricular: " + aluno.matricular() + "\n - formar: " + aluno.formar() + "\n - trancar: " + aluno.trancar() + "\n "
                + "- evadir: " + aluno.evadir() + "\n - jubilar: " + aluno.Jubuliar() + "\n");
        aluno.setEstado(new AlunoEstadoEvadido());
        System.out.println("Aluno " + aluno.getNome() + " está no estado: " + aluno.geteNomeEstado() + "\n"
                + " - matricular: " + aluno.matricular() + "\n - formar: " + aluno.formar() + "\n - trancar: " + aluno.trancar() + "\n "
                + "- evadir: " + aluno.evadir() + "\n - jubilar: " + aluno.Jubuliar() + "\n");
    }
}
