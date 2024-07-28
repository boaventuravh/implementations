package concrete_decorators;

import component.PersonagemCombate;
import decorator.PersonagemCombateDecorator;

public class PersonagemCombateNivel2 extends PersonagemCombateDecorator{
    public PersonagemCombateNivel2(PersonagemCombate personagemCombate){
        super(personagemCombate);
    }

    @Override
    public void atacar(){
        personagemCombate.atacar();
        this.atacarNivel2();
    }

    private void atacarNivel2(){
        System.out.println("Ataque especial - nível 2. Dano adicional: " + this.calcularDanoAtaque());
    }

    @Override
    public int calcularDanoAtaque(){
        return 2 * personagemCombate.calcularDanoAtaque();
    }
}
