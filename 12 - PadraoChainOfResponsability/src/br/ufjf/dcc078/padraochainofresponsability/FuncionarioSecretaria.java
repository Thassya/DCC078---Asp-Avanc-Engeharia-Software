package br.ufjf.dcc078.padraochainofresponsability;

/**
 *
 * @author thassya
 */
public class FuncionarioSecretaria extends Funcionario {

    public FuncionarioSecretaria(Funcionario superior){
        listaDocumentos.add(RollDocumentos.getInstance().getTipoDocumentoHistorico());
        setFuncionarioSuperior(superior);
    }
    
    @Override
    public String getDescricaoCargo() {
        return "Secretária";
    }

}
