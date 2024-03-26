package concrete_products;

import product.Transporte;

public class TransporteMaritimo implements Transporte {
    @Override
    public void realizaEntrega() {
        System.out.println("Realizando entrega de barco");
    }
}
