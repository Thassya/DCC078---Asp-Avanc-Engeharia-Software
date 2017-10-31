package br.ufjf.dcc078.padraochainofresponsability;

/**
 *
 * @author thassya
 */
public class RollDocumentos {

    private TipoDocumentoBoleto tipoDocumentoBoleto;
    private TipoDocumentoCertificado tipoDocumentoCertificado;
    private TipoDocumentoDiploma tipoDocumentoDiploma;
    private TipoDocumentoHistorico tipoDocumentoHistorico;
    private TipoDocumentoMatricula tipoDocumentoMatricula;

    public static RollDocumentos rolldocumentos = new RollDocumentos(); 
    public static RollDocumentos getInstance() {
        return rolldocumentos;
    }

    private RollDocumentos(){
        tipoDocumentoBoleto = new TipoDocumentoBoleto();
        tipoDocumentoCertificado = new TipoDocumentoCertificado();
        tipoDocumentoDiploma = new TipoDocumentoDiploma();
        tipoDocumentoHistorico = new TipoDocumentoHistorico();
        tipoDocumentoMatricula = new TipoDocumentoMatricula();
    }
    
    public static RollDocumentos getRollDocumentos() {
        return rolldocumentos;
    }

    public static void setRollDocumentos(RollDocumentos rolldocumentos) {
        RollDocumentos.rolldocumentos = rolldocumentos;
    }

    public TipoDocumentoBoleto getTipoDocumentoBoleto() {
        return tipoDocumentoBoleto;
    }

    public void setTipoDocumentoBoleto(TipoDocumentoBoleto tipoDocumentoBoleto) {
        this.tipoDocumentoBoleto = tipoDocumentoBoleto;
    }

    public TipoDocumentoCertificado getTipoDocumentoCertificado() {
        return tipoDocumentoCertificado;
    }

    public void setTipoDocumentoCertificado(TipoDocumentoCertificado tipoDocumentoCertificado) {
        this.tipoDocumentoCertificado = tipoDocumentoCertificado;
    }

    public TipoDocumentoDiploma getTipoDocumentoDiploma() {
        return tipoDocumentoDiploma;
    }

    public void setTipoDocumentoDiploma(TipoDocumentoDiploma tipoDocumentoDiploma) {
        this.tipoDocumentoDiploma = tipoDocumentoDiploma;
    }

    public TipoDocumentoHistorico getTipoDocumentoHistorico() {
        return tipoDocumentoHistorico;
    }

    public void setTipoDocumentoHistorico(TipoDocumentoHistorico tipoDocumentoHistorico) {
        this.tipoDocumentoHistorico = tipoDocumentoHistorico;
    }

    public TipoDocumentoMatricula getTipoDocumentoMatricula() {
        return tipoDocumentoMatricula;
    }

    public void setTipoDocumentoMatricula(TipoDocumentoMatricula tipoDocumentoMatricula) {
        this.tipoDocumentoMatricula = tipoDocumentoMatricula;
    }

    
}
