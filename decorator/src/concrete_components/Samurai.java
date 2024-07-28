package concrete_components;

import component.PersonagemCombate;

public class Samurai implements PersonagemCombate {
    @Override
    public void atacar() {
        System.out.println("Ataque de katana. Dano: " + this.calcularDanoAtaque());
    }

    @Override
    public int calcularDanoAtaque() {
        return 150;
    }
}
