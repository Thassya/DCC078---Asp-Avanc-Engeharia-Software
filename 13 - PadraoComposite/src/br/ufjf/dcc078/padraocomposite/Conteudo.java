package br.ufjf.dcc078.padraocomposite;

/**
 *
 * @author thassya
 */
public abstract class Conteudo {
    
    protected String descricao;
    public Conteudo(String descricao){
        this.descricao = descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public abstract String getDescricao();
    
}
