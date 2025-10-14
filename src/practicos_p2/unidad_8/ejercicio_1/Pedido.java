/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonel
 */
public class Pedido implements Pagable {

    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado de su pedido cambio a: " + nuevoEstado);
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() +
               "Estado: " + estado +
               "Total: $" + calcularTotal();
    }
}
