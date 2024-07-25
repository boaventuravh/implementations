public class Main {
    public static void main(String[] args) {

        EntidadeMusical pinkFloyd = new Artista("Pink Floyd");
        Album theWallPart1 = new Album("The Wall part 1", pinkFloyd);
        Album theWallPart2 = new Album("The Wall part 2", pinkFloyd);
        Album theDarkSideOfTheMoon = new Album("The Dark Side of the Moon", pinkFloyd);

        theWallPart1.adicionarMusica("In the Flesh?");
        theWallPart1.adicionarMusica("The Thin Ice");
        theWallPart1.adicionarMusica("Another Brick in the Wall, Part 1");
        theWallPart1.adicionarMusica("The Happiest Days of Our Lives");
        theWallPart1.adicionarMusica("Another Brick in the Wall, Part 2");
        theWallPart1.adicionarMusica("Mother");
        theWallPart1.adicionarMusica("Goodbye Blue Sky");
        theWallPart1.adicionarMusica("Empty Spaces");
        theWallPart1.adicionarMusica("Young Lust");
        theWallPart1.adicionarMusica("One of My Turns");
        theWallPart1.adicionarMusica("Don't Leave Me Now");
        theWallPart1.adicionarMusica("Another Brick in the Wall, Part 3");
        theWallPart1.adicionarMusica("Goodbye Cruel World");

        ((Artista) pinkFloyd).adicionarAlbum(theWallPart1);

        theWallPart2.adicionarMusica("Hey You");
        theWallPart2.adicionarMusica("Is There Anybody Out There?");
        theWallPart2.adicionarMusica("Nobody Home");
        theWallPart2.adicionarMusica("Vera");
        theWallPart2.adicionarMusica("Bring The Boys Back Home");
        theWallPart2.adicionarMusica("Comfortably Numb");
        theWallPart2.adicionarMusica("The Show Must Go On");
        theWallPart2.adicionarMusica("In the Flesh");
        theWallPart2.adicionarMusica("Run Like Hell");
        theWallPart2.adicionarMusica("Waiting for the Worms");
        theWallPart2.adicionarMusica("Stop");
        theWallPart2.adicionarMusica("The Trial");
        theWallPart2.adicionarMusica("Outside the Wall");

        ((Artista) pinkFloyd).adicionarAlbum(theWallPart2);

        theDarkSideOfTheMoon.adicionarMusica("Speak to Me");
        theDarkSideOfTheMoon.adicionarMusica("Breathe");
        theDarkSideOfTheMoon.adicionarMusica("On the Run");
        theDarkSideOfTheMoon.adicionarMusica("Time");
        theDarkSideOfTheMoon.adicionarMusica("The Great Gig in the Sky");
        theDarkSideOfTheMoon.adicionarMusica("Money");
        theDarkSideOfTheMoon.adicionarMusica("Us and Them");
        theDarkSideOfTheMoon.adicionarMusica("Any Colour You Like");
        theDarkSideOfTheMoon.adicionarMusica("Brain Damage");
        theDarkSideOfTheMoon.adicionarMusica("Eclipse");

        ((Artista) pinkFloyd).adicionarAlbum(theDarkSideOfTheMoon);

        pinkFloyd.display();
    }
}
