package concrete_components;

import component.PersonagemCombate;

public class Arqueiro implements PersonagemCombate {
    @Override
    public void atacar() {
        System.out.println("Lançando flecha. Dano: " + this.calcularDanoAtaque());
    }

    @Override
    public int calcularDanoAtaque() {
        return 100;
    }
}
