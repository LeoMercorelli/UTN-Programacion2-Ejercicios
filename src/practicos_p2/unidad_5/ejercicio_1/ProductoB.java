/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_1;

/**
 *
 * @author Leonel
 */


public class ProductoB {
    
    // Atributos
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProductoB categoria;

    
    // Constructor
    public ProductoB(String id, String nombre, double precio, int cantidad, CategoriaProductoB categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProductoB getCategoria() { return categoria; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setCategoria(CategoriaProductoB categoria) { this.categoria = categoria; }



    public void mostrarInfo() {
        System.out.println(toString());
    }

 
    @Override
    public String toString() {
        String nomCat  = (categoria != null) ? categoria.name() : "SIN_CATEGORIA";
        String descCat = (categoria != null) ? categoria.getDescripcion() : "Sin descripción";
        return "ProductoB {id='" + id + "', nombre='" + nombre + "', precio=$" + precio +
               ", cantidad=" + cantidad + ", categoria=" + nomCat + " (" + descCat + ")}";
    }
}
