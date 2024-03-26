package creator;

import product.Transporte;

public abstract class TransporteApplication {

    public abstract Transporte criarTransporte();

    public void entregar(){
        Transporte transporte = criarTransporte();
        transporte.realizaEntrega();
    }
}
