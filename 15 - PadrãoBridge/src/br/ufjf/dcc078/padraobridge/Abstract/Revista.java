package br.ufjf.dcc078.padraobridge.Abstract;

import br.ufjf.dcc078.padraobridge.Implementor.IImplementor;

/**
 *
 * @author thassya
 */
public class Revista extends Publicacaoes {

    public Revista(IImplementor resources) {
        super(resources);
    }

    @Override
    public String imprime() {
        return meioPublicacao.entrega();
    }

    @Override
    public String getTitulo() {
        return "Veja";
    }
}
