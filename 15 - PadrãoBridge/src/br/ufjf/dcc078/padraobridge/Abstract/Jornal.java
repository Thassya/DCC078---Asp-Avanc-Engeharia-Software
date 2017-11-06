package br.ufjf.dcc078.padraobridge.Abstract;
import br.ufjf.dcc078.padraobridge.Implementor.IImplementor;

/**
 *
 * @author thassya
 */
public class Jornal extends Publicacaoes {

    public Jornal(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public String imprime() {
        return meioPublicacao.entrega();
    }
    
    @Override
    public String getTitulo() {
        return "Tribuna de Minas";
    }
}
