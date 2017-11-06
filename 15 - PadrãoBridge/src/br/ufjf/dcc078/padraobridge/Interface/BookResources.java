package br.ufjf.dcc078.padraobridge.Interface;

/**
 *
 * @author thassya
 */
public class BookResources implements IResources {

    private Book book;

    public BookResources(Book b) {
        this.book = b;
    }

    @Override
    public String Resumo() {
       return this.book.resumo();
    }

    @Override
    public String Titulo() {
       return this.book.titulo();
    }

    @Override
    public String Url() {
        return this.book.urlCompra();
    }

}
