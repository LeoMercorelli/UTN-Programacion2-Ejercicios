package practicos_p2.unidad_6.ejercicio_5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pagable> formasDePago = new ArrayList<>();

        formasDePago.add(new TarjetaCredito());
        formasDePago.add(new Transferencia());
        formasDePago.add(new Efectivo());

        for (Pagable p : formasDePago) {
            procesarPago(p);
        }
    }

    /**
     * Procesa un pago utilizando cualquier objeto que implemente la interfaz
     * Pagable.
     *
     * @param medio el medio de pago a procesar. Puede ser una instancia de
     * TarjetaCredito, Transferencia, Efectivo, u otra clase que implemente
     * Pagable.
     */
    
    public static void procesarPago(Pagable medio) {
        medio.pagar();
    }
}
