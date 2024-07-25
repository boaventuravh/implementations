public class Musica implements EntidadeMusical{

    private final String titulo;
    private final EntidadeMusical album;

    public Musica(String titulo, EntidadeMusical album) {
        this.titulo = titulo;
        this.album = album;
    }

    @Override
    public void display() {
        System.out.println("\t\t" + titulo);
    }
}
