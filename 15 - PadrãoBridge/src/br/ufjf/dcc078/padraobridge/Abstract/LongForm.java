package br.ufjf.dcc078.padraobridge.Abstract;
import br.ufjf.dcc078.padraobridge.Interface.IResources;

/**
 *
 * @author thassya
 */
public class LongForm extends Views {

    public LongForm(IResources resources) {
        super(resources);
    }

    @Override
    public String Show() {
        return resources.Titulo() + " - " + this.resources.Resumo() + " - " + this.resources.Url();
    }

}
