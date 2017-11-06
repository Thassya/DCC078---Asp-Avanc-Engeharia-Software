package br.ufjf.dcc078.padraobridge.Abstract;

import br.ufjf.dcc078.padraobridge.Implementor.IImplementor;

/**
 *
 * @author thassya
 */
public class Livro extends Publicacaoes {

    public Livro(IImplementor resources) {
        super(resources);
    }

    @Override
    public String imprime() {
        return meioPublicacao.entrega();
    }

    @Override
    public String getTitulo() {
        return "Harry Potter e a Câmara Secreta";
    }
}
