package br.ufjf.dcc078.padraobridge.Implementor;

/**
 *
 * @author thassya
 */
public class Virtual implements IImplementor {
    
    String url(){
        return "www.imprimaaqui.com.br";
    }

    @Override
    public String entrega() {
        return "Entregue por meio digital";
    }
    
    @Override
    public String tipo(){
        return "PDF";
    }

}
