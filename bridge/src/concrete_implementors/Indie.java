package concrete_implementors;

import implementor.Musica;

public class Indie extends Musica {
    public Indie(String titulo, String artista) {
        super(titulo, artista);
        this.genero = "Indie";
    }
}
