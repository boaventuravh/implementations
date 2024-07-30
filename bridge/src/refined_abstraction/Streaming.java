package refined_abstraction;

import abstraction.Reprodutor;
import implementor.Musica;

public class Streaming implements Reprodutor {
    @Override
    public void reproduzirMusica(Musica musica) {
        System.out.println("Reproduzindo arquivo mp3 de " + musica.getTitulo() +
                " de " + musica.getArtista() +
                " no Spotify. Gênero: " + musica.getGenero());
    }
}
