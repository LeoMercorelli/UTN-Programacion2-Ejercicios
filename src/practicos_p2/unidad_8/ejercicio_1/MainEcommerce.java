/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_1;


/**
 *
 * @author Leonel
 */
public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", "ana@mail.com");
        Pedido pedido1 = new Pedido(cliente1);

        pedido1.agregarProducto(new Producto("Zapatillas", 25000));
        pedido1.agregarProducto(new Producto("Campera", 40000));

        System.out.println(pedido1);

        // Calcular total con descuento usando PayPal
        PagoConDescuento metodoPago = new PayPal("ana_usuario");
        double totalConDescuento = metodoPago.aplicarDescuento(pedido1.calcularTotal());
        metodoPago.procesarPago(totalConDescuento);

        pedido1.cambiarEstado("Enviado");
    }
}
