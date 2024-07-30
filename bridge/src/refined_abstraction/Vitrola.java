package refined_abstraction;

import abstraction.Reprodutor;
import implementor.Musica;

public class Vitrola implements Reprodutor {
    @Override
    public void reproduzirMusica(Musica musica) {
        System.out.println("Reproduzindo " + musica.getTitulo() +
                " de " + musica.getArtista() +
                " em um disco de vinil. Gênero: " + musica.getGenero());
    }
}
