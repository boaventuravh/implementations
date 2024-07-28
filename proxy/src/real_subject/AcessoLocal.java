package real_subject;

import subject.Acesso;

public class AcessoLocal implements Acesso {

    private String dado1;
    private String dado2;

    public AcessoLocal(String dado1, String dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    private String getDado1() {
        return dado1;
    }

    private void setDado1(String dado1) {
        this.dado1 = dado1;
    }

    private String getDado2() {
        return dado2;
    }

    private void setDado2(String dado2) {
        this.dado2 = dado2;
    }

    @Override
    public void visualizarDados() {
        System.out.println("Dado 1: " + this.getDado1() + "\nDado 2: " + this.getDado2());
    }

    @Override
    public void editarDados(String dado1, String dado2) {
        System.out.println("Editando dados...");
        this.setDado1(dado1);
        this.setDado2(dado2);
        System.out.println("Dados atualizados: ");
        this.visualizarDados();
    }

}
