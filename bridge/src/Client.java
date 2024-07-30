import abstraction.Reprodutor;
import concrete_implementors.Indie;
import concrete_implementors.Rock;
import implementor.Musica;
import refined_abstraction.Streaming;
import refined_abstraction.Vitrola;

public class Client {
    public static void main(String[] args) {

        Reprodutor vitrola = new Vitrola();
        Reprodutor streaming = new Streaming();

        Musica rock = new Rock("Up", "Sing Street");
        Musica indie = new Indie("R U Mine", "Arctic Monkeys");

        vitrola.reproduzirMusica(rock);
        streaming.reproduzirMusica(rock);
        vitrola.reproduzirMusica(indie);
        streaming.reproduzirMusica(indie);

    }
}
