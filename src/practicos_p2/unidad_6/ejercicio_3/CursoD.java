/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_3;

/**
 *
 * @author Leonel
 */

public class CursoD {
    private String codigo;
    private String nombre;
    private ProfesorD profesor; 

    public CursoD(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters / Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ProfesorD getProfesor() { return profesor; }

    // Sincroniza ambos lados
    public void setProfesor(ProfesorD p) {
        if (this.profesor == p) return;

        // quitarse del profesor anterior
        if (this.profesor != null) {
            ProfesorD viejo = this.profesor;
            this.profesor = null;
            viejo._eliminarCursoInterno(this);
        }

        // asignar nuevo
        this.profesor = p;

        // agregarse al nuevo profesor
        if (p != null) {
            p._agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor != null) ? profesor.getNombre() : "SIN_PROFESOR";
        System.out.println("CursoD{codigo='" + codigo + "', nombre='" + nombre + "', profesor=" + prof + "}");
    }

    @Override
    public String toString() {
        String prof = (profesor != null) ? profesor.getNombre() : "SIN_PROFESOR";
        return "CursoD{codigo='" + codigo + "', nombre='" + nombre + "', profesor=" + prof + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CursoD)) return false;
        CursoD c = (CursoD) o;
        return codigo != null && codigo.equals(c.codigo);
    }
    @Override
    public int hashCode() { return codigo == null ? 0 : codigo.hashCode(); }
}
