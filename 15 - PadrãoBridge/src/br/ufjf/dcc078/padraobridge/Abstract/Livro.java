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
        return meioPublicacao.entrega() + " em " + meioPublicacao.tipo();
    }

    @Override
    public String getTitulo() {
        return "Harry Potter e a Câmara Secreta";
    }

    public String getISBN() {
        return "9788532511669";
    }

    public String getEditora(){
        return "Rocco";
    }
    
    public String getResumo() {
        return "Os Dursley estavam tão anti-sociais naquele verão, que tudo o que Harry queria era voltar às aulas de Hogwarts. "
                + "No entanto, quando já terminava de fazer suas malas, Harry recebe um aviso de um estranho chamado Dobby, "
                + "que diz que um desastre acontecerá caso Potter decida voltar à Hogwarts. "
                + "Harry não liga para aquela mensagem e o desastre realmente acontece. "
                + "Naquele segundo ano estudando em Hogwarts, novos horrores surgem para atormentar Harry, "
                + "incluindo o novo professor Gilderoy Lockhart e um espírito chamado Moaning Myrtle, "
                + "que assombra o banheiro feminino, além de olhares indesejados da irmã mais nova de Rony Weasley, Gina. "
                + "Todos esses problemas, no entanto, parecem menores quando o verdadeiro problema começa "
                + "e algo transforma os alunos de Hogwarts em pedra. Dentre os suspeitos: o próprio Harry. "
                + "Descubra o fim desta aventura emocionante.";
    }
}
