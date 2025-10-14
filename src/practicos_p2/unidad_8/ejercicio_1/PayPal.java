/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_1;

/**
 *
 * @author Leonel
 */
public class PayPal implements PagoConDescuento {

    private String usuario;

    public PayPal(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con PayPal del usuario " + usuario);
    }
}

