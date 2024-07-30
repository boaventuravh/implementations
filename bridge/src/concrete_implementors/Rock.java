package concrete_implementors;

import implementor.Musica;

public class Rock extends Musica {
    public Rock(String titulo, String artista) {
        super(titulo, artista);
        this.genero = "Rock";
    }
}
