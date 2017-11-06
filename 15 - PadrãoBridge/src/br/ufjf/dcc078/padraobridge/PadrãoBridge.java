package br.ufjf.dcc078.padraobridge;

import br.ufjf.dcc078.padraobridge.Abstract.Jornal;
import br.ufjf.dcc078.padraobridge.Abstract.Livro;
import br.ufjf.dcc078.padraobridge.Abstract.Revista;
import br.ufjf.dcc078.padraobridge.Implementor.Impresso;
import br.ufjf.dcc078.padraobridge.Implementor.Virtual;

public class PadrãoBridge {

    public static void main(String[] args) {
        Impresso impresso = new Impresso();
        Virtual virtual = new Virtual();
        
        Jornal jornal = new Jornal(virtual);
        System.out.println(jornal.getTitulo() + " - " + jornal.imprime());
        
        Livro livro = new Livro(impresso);
        System.out.println("Livro: " + livro.getTitulo() + " - " + livro.imprime());
        
        Revista revista = new Revista(virtual);
        System.out.println(revista.getTitulo() + " - " + revista.imprime() );
    }
    
}
