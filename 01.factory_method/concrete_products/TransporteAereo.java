package concrete_products;

import product.Transporte;

public class TransporteAereo implements Transporte {
    @Override
    public void realizaEntrega() {
        System.out.println("Realiza entrega de avião");
    }
}
