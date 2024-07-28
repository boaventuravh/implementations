import concrete_components.Arqueiro;
import concrete_components.Samurai;
import concrete_decorators.PersonagemCombateNivel2;

public class Main {
    public static void main(String[] args) {

        Arqueiro arqueiro = new Arqueiro();
        Samurai samurai = new Samurai();

        System.out.println("\t\tAntes da evolução\n");
        arqueiro.atacar();
        samurai.atacar();

        System.out.println("\n\n\t\tDepois da evolução\n");
        PersonagemCombateNivel2 arquiro2 = new PersonagemCombateNivel2(arqueiro);
        PersonagemCombateNivel2 samurai2 = new PersonagemCombateNivel2(samurai);

        arquiro2.atacar();
        samurai2.atacar();

    }
}
