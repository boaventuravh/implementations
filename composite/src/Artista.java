import java.util.ArrayList;
import java.util.List;

public class Artista implements EntidadeMusical{

    private final String nome;
    private List<EntidadeMusical> albuns;

    public Artista(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<EntidadeMusical> getAlbuns() {
        return albuns;
    }

    public void adicionarAlbum(EntidadeMusical album){
        this.albuns.add(album);
    }

    @Override
    public void display() {
        System.out.println(nome);
        albuns.forEach(album -> album.display());
    }
}
