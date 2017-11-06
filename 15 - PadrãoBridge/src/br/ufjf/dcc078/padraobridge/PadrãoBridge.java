package br.ufjf.dcc078.padraobridge;

import br.ufjf.dcc078.padraobridge.Abstract.LongForm;
import br.ufjf.dcc078.padraobridge.Abstract.ShortForm;
import br.ufjf.dcc078.padraobridge.Interface.Artist;
import br.ufjf.dcc078.padraobridge.Interface.ArtistResources;
import br.ufjf.dcc078.padraobridge.Interface.Book;
import br.ufjf.dcc078.padraobridge.Interface.BookResources;

public class PadrãoBridge {

    public static void main(String[] args) {
        Artist a = new Artist();
        ArtistResources aResources = new ArtistResources(a);

        Book b = new Book();
        BookResources bResources = new BookResources(b);
        
        ShortForm sf = new ShortForm(bResources);
        LongForm lf = new LongForm(aResources);
        
        System.out.println("Short Form as Book: ");
        System.out.println(sf.Show());
        
        System.out.println("\n");
        
        System.out.println("Long Form as Artist: ");
        System.out.println(lf.Show());
        
    }
    
}
