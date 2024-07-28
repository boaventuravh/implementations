package proxy;

import subject.Acesso;

public class AcessoRemoto implements Acesso {

    private Acesso acessoLocal;

    public AcessoRemoto(Acesso acessoLocal) {
        this.acessoLocal = acessoLocal;
    }

    @Override
    public void visualizarDados() {
        acessoLocal.visualizarDados();
    }

    @Override
    public void editarDados(String dado1, String dado2) {
        System.out.println("Não é possível realizar edições remotamente!");
    }
}
