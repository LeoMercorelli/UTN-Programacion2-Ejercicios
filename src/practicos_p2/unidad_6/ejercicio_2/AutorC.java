/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_2;

/**
 *
 * @author Leonel
 */

public class AutorC {
    private String id;
    private String nombre;
    private String nacionalidad;

    public AutorC(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "AutorC{id='" + id + "', nombre='" + nombre + "', nacionalidad='" + nacionalidad + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutorC)) return false;
        AutorC a = (AutorC) o;
        return id != null && id.equals(a.id);
    }

    @Override
    public int hashCode() { return id == null ? 0 : id.hashCode(); }
}
