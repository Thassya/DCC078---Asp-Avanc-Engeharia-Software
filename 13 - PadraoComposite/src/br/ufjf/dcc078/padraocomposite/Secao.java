package br.ufjf.dcc078.padraocomposite;

/**
 *
 * @author thassya
 */
public class Secao extends Conteudo {
    
    public Secao(String descricao){
        super(descricao);
    }
    
    public String getDescricao(){
        return descricao + "\n";
    }
    
}
