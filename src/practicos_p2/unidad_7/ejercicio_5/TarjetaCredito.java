package practicos_p2.unidad_7.ejercicio_5;

public class TarjetaCredito implements Pagable{
    
    @Override
    public void pagar() {
        System.out.println("Pago realizado con tarjeta de credito");
    }
    
}
