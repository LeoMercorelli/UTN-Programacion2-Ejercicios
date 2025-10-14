/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_1;
/**
 *
 * @author Leonel
 */
public class TarjetaCredito implements PagoConDescuento {

    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con tarjeta a nombre de " + titular);
    }
}

