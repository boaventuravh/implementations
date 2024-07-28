package decorator;

import component.PersonagemCombate;

public abstract class PersonagemCombateDecorator implements PersonagemCombate {
    protected PersonagemCombate personagemCombate;

    public PersonagemCombateDecorator(PersonagemCombate personagemCombate) {
        this.personagemCombate = personagemCombate;
    }
}
