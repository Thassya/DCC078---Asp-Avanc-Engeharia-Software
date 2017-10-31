package br.ufjf.dcc078.padraochainofresponsability;

/**
 *
 * @author thassya
 */
public class FuncionarioReitor extends Funcionario {

    public FuncionarioReitor(Funcionario superior) {
        listaDocumentos.add(RollDocumentos.getInstance().getTipoDocumentoDiploma());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Reitor";
    }

}
