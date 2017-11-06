package br.ufjf.dcc078.padraobridge.Abstract;
import br.ufjf.dcc078.padraobridge.Interface.IResources;

/**
 *
 * @author thassya
 */
public class ShortForm extends Views{

    public ShortForm(IResources resources) {
        super(resources);
    }

    @Override
    public String Show() {
        return resources.Titulo();
    }
    
}
