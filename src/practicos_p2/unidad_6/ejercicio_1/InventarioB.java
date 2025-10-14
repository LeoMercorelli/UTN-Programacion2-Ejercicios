/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonel
 */

public class InventarioB {
    // Colecció
    private final ArrayList<ProductoB> productos = new ArrayList<>();

    
    // Agregar producto
    public boolean agregarProducto(ProductoB p) {
        if (p == null) return false;
        if (buscarProductoPorId(p.getId()) != null) return false;
        return productos.add(p);
    }

    // Listar productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos.");
            return;
        }
        for (ProductoB p : productos) p.mostrarInfo();
    }

    // Buscar por ID
    public ProductoB buscarProductoPorId(String id) {
        if (id == null) return null;
        for (ProductoB p : productos) {
            if (id.equalsIgnoreCase(p.getId())) return p;
        }
        return null;
    }

    // Eliminar por ID
    public boolean eliminarProducto(String id) {
        ProductoB p = buscarProductoPorId(id);
        if (p == null) return false;
        return productos.remove(p);
    }

    // Actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        ProductoB p = buscarProductoPorId(id);
        if (p == null) return false;
        p.setCantidad(nuevaCantidad);
        return true;
    }

    // Filtrar por categoría
    public List<ProductoB> filtrarPorCategoria(CategoriaProductoB categoria) {
        ArrayList<ProductoB> res = new ArrayList<>();
        for (ProductoB p : productos) if (p.getCategoria() == categoria) res.add(p);
        return res;
    }

    // Total de unidades en stock
    public int obtenerTotalStock() {
        int total = 0;
        for (ProductoB p : productos) total += p.getCantidad();
        return total;
    }

    // Producto con mayor stock
    public ProductoB obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        ProductoB max = productos.get(0);
        for (ProductoB p : productos) if (p.getCantidad() > max.getCantidad()) max = p;
        return max;
    }

    // Filtrar por rango de precio (min y max)
    public List<ProductoB> filtrarProductosPorPrecio(double min, double max) {
        if (min > max) { double t = min; min = max; max = t; }
        ArrayList<ProductoB> res = new ArrayList<>();
        for (ProductoB p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
        }
        return res;
    }

    // Mostrar categorías
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProductoB c : CategoriaProductoB.values()) {
            System.out.println(c.name() + " - " + c.getDescripcion());
        }
    }

    // Getter de copia de la lista
    public List<ProductoB> getProductos() {
        return new ArrayList<>(productos);
    }
}
