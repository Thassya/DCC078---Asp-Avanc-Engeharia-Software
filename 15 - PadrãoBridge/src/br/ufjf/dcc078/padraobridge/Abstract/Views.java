package br.ufjf.dcc078.padraobridge.Abstract;
import br.ufjf.dcc078.padraobridge.Interface.IResources;

/**
 *
 * @author thassya
 */
public abstract class Views {
    IResources resources;
    
    public Views(IResources resources){
        this.resources = resources;
    }
    
    public abstract String Show();
}
