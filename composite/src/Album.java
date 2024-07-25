import java.util.ArrayList;
import java.util.List;

public class Album implements EntidadeMusical{

    private final String titulo;
    private final EntidadeMusical artista;
    private List<EntidadeMusical> musicas;

    public Album(String titulo, EntidadeMusical artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public EntidadeMusical getArtista() {
        return artista;
    }

    public List<EntidadeMusical> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(String titulo){
        musicas.add(new Musica(titulo, this));
    }

    @Override
    public void display() {
        System.out.println("\t" + titulo);
        musicas.forEach(musica -> musica.display());
    }
}
