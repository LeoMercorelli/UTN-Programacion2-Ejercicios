/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonel
 */

public class UniversidadD {
    private String nombre;
    private List<ProfesorD> profesores = new ArrayList<>();
    private List<CursoD> cursos = new ArrayList<>();

    public UniversidadD(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }
    public List<ProfesorD> getProfesores() { return new ArrayList<>(profesores); }
    public List<CursoD> getCursos() { return new ArrayList<>(cursos); }

    
    public void agregarProfesor(ProfesorD p) {
        if (p == null) return;
        if (!profesores.contains(p)) profesores.add(p);
    }

    public void agregarCurso(CursoD c) {
        if (c == null) return;
        if (!cursos.contains(c)) cursos.add(c);
    }

    // Asignacion
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        CursoD c = buscarCursoPorCodigo(codigoCurso);
        ProfesorD p = buscarProfesorPorId(idProfesor);
        if (c == null) return;
        c.setProfesor(p);
    }

    // Listados
    public void listarProfesores() {
        if (profesores.isEmpty()) { System.out.println("No hay profesores."); return; }
        for (ProfesorD p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        if (cursos.isEmpty()) { System.out.println("No hay cursos."); return; }
        for (CursoD c : cursos) c.mostrarInfo();
    }

    // Busqueda
    public ProfesorD buscarProfesorPorId(String id) {
        if (id == null) return null;
        for (ProfesorD p : profesores) if (id.equalsIgnoreCase(p.getId())) return p;
        return null;
    }

    public CursoD buscarCursoPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (CursoD c : cursos) if (codigo.equalsIgnoreCase(c.getCodigo())) return c;
        return null;
    }

    // Eliminar
    public boolean eliminarCurso(String codigo) {
        CursoD c = buscarCursoPorCodigo(codigo);
        if (c == null) return false;
        c.setProfesor(null); // rompe vínculo si hay
        return cursos.remove(c);
    }

    public boolean eliminarProfesor(String id) {
        ProfesorD p = buscarProfesorPorId(id);
        if (p == null) return false;

        // dejar profesor igual null en todos lo cursos
        for (CursoD c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        return profesores.remove(p);
    }
}
