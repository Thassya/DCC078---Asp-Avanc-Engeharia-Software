package br.ufjf.dcc078.padraobridge.Implementor;

/**
 *
 * @author thassya
 */
public class Impresso implements IImplementor {

    @Override
    public String entrega() {
       return "Entregue por meio impresso";
    }

    @Override
    public String tipo(){
        return "Papel comum";
    }
}
