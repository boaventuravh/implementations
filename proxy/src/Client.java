import proxy.AcessoRemoto;
import real_subject.AcessoLocal;
import subject.Acesso;

public class Client {
    public static void main(String[] args) {

        Acesso local = new AcessoLocal("Altura de 1.75 m", "Largura de 2.15 m");
        Acesso remoto = new AcessoRemoto(local);

        System.out.println("ACESSO LOCAL\n\n");
        local.visualizarDados();
        local.editarDados("Altura de 1.80 m", "Largura de 2.10 m");

        System.out.println("\n\nACESSO REMOTO\n\n");
        remoto.visualizarDados();
        remoto.editarDados("Altura de 0.00 m", "Largura de 0.00 m");

    }
}
