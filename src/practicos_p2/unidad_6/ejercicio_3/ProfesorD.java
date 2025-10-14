/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonel
 */

public class ProfesorD {
    private String id;
    private String nombre;
    private String especialidad;
    private List<CursoD> cursos = new ArrayList<>();

    public ProfesorD(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters / Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public List<CursoD> getCursos() { return new ArrayList<>(cursos); }

    
    
    public void agregarCurso(CursoD c) {
        if (c == null) return;
        if (!cursos.contains(c)) cursos.add(c);
        if (c.getProfesor() != this) c.setProfesor(this);
    }

    public void eliminarCurso(CursoD c) {
        if (c == null) return;
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) c.setProfesor(null);
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Sin cursos asignados.");
            return;
        }
        for (CursoD c : cursos) {
            System.out.println("- " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ProfesorD{id='" + id + "', nombre='" + nombre + "', especialidad='" +
                especialidad + "', cursos=" + cursos.size() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfesorD)) return false;
        ProfesorD p = (ProfesorD) o;
        return id != null && id.equals(p.id);
    }
    @Override
    public int hashCode() { return id == null ? 0 : id.hashCode(); }

    //  Helper internos (evitan recursividad
    void _agregarCursoInterno(CursoD c) { if (!cursos.contains(c)) cursos.add(c); }
    void _eliminarCursoInterno(CursoD c) { cursos.remove(c); }
}

