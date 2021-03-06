package br.ufjf.dcc078.padraobridge.Abstract;
import br.ufjf.dcc078.padraobridge.Implementor.IImplementor;

/**
 *
 * @author thassya
 */
public abstract class Publicacaoes {
    protected IImplementor meioPublicacao;
    
    public Publicacaoes(IImplementor meioPublicacao){
        this.meioPublicacao = meioPublicacao;
    }
        
    public abstract String imprime();
    public abstract String getTitulo();
}
