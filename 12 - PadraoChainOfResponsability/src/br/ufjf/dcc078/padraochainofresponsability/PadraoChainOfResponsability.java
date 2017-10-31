package br.ufjf.dcc078.padraochainofresponsability;

/**
 *
 * @author thassya
 */
public class PadraoChainOfResponsability {
    public static void main(String[] args) {
       FuncionarioReitor reitor = new FuncionarioReitor(null);
       FuncionarioDiretor diretor = new FuncionarioDiretor(reitor);
       FuncionarioCoordenador coordenador = new FuncionarioCoordenador(diretor);
       FuncionarioSecretaria secretaria = new FuncionarioSecretaria(coordenador);
       
        System.out.println(
                secretaria.assinarDocumento(new Documento(RollDocumentos.getInstance().getTipoDocumentoHistorico())));
        System.out.println(
                secretaria.assinarDocumento(new Documento(RollDocumentos.getInstance().getTipoDocumentoMatricula())));
        System.out.println(
                secretaria.assinarDocumento(new Documento(RollDocumentos.getInstance().getTipoDocumentoDiploma())));
        System.out.println(
                secretaria.assinarDocumento(new Documento(RollDocumentos.getInstance().getTipoDocumentoBoleto())));
       
    }
    
}
