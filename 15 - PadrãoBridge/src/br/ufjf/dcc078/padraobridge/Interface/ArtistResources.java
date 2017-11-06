package br.ufjf.dcc078.padraobridge.Interface;

public class ArtistResources implements IResources {

    Artist artist;
    public ArtistResources(Artist a) {
        this.artist=a;
    }    
    
    @Override
    public String Resumo() {
        return this.artist.bio();
    }

    @Override
    public String Titulo() {
        return this.artist.firstName() + " " + this.artist.lastName();
    }

    @Override
    public String Url() {
        return this.artist.url();
    }
    
}
