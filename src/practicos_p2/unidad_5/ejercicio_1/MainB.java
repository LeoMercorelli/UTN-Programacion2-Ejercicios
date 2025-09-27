/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_1;

import java.util.List;

/**
 *
 * @author Leonel
 */

public class MainB {
    public static void main(String[] args) {
        InventarioB inventario = new InventarioB();

        // 1) Crear 5 productos y agregarlos
        ProductoB p1 = new ProductoB("A001", "Yerba Mate", 2500, 40, CategoriaProductoB.ALIMENTOS);
        ProductoB p2 = new ProductoB("E100", "Auriculares", 15500, 15, CategoriaProductoB.ELECTRONICA);
        ProductoB p3 = new ProductoB("R501", "Buzo", 18999, 25, CategoriaProductoB.ROPA);
        ProductoB p4 = new ProductoB("H777", "Almohada", 9500, 10, CategoriaProductoB.HOGAR);
        ProductoB p5 = new ProductoB("A050", "Cafe molido", 3200, 30, CategoriaProductoB.ALIMENTOS);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("2) Listado");
        inventario.listarProductos();

        System.out.println("\n3) Buscar por ID (E100)");
        ProductoB encontrado = inventario.buscarProductoPorId("E100");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println("\n4) Filtrar por categoría (ALIMENTOS)");
        List<ProductoB> alimentos = inventario.filtrarPorCategoria(CategoriaProductoB.ALIMENTOS);
        for (ProductoB p : alimentos) p.mostrarInfo();

        System.out.println("\n5) Eliminar ID H777 y listar");
        System.out.println(inventario.eliminarProducto("H777") ? "Eliminado" : "No existe");
        inventario.listarProductos();

        System.out.println("\n6) Actualizar stock A001 a 55");
        System.out.println(inventario.actualizarStock("A001", 55) ? "Actualizado" : "No existe");
        inventario.listarProductos();

        System.out.println("\n7) Total de unidades en stock");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println("\n8) Producto con mayor stock");
        ProductoB mayor = inventario.obtenerProductoConMayorStock();
        System.out.println(mayor != null ? mayor : "Sin productos");

        System.out.println("\n9) Filtrar por precio entre $1000 y $3000");
        List<ProductoB> rango = inventario.filtrarProductosPorPrecio(1000, 3000);
        if (rango.isEmpty()) System.out.println("No hay productos en ese rango.");
        for (ProductoB p : rango) p.mostrarInfo();

        System.out.println("\n10) Categorías disponibles");
        inventario.mostrarCategoriasDisponibles();

        System.out.println("\n Fin de la prueba.");
    }
}
