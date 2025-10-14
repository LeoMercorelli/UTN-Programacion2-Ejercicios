/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Leonel
 */

public class BibliotecaC {
    private String nombre;
    private List<LibroC> libros = new ArrayList<>();

    public BibliotecaC(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<LibroC> getLibros() {
        return new ArrayList<>(libros);
    }

    // ---- Métodos pedidos ----
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, AutorC autor) {
        if (buscarLibroPorIsbn(isbn) != null) return;
        libros.add(new LibroC(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros cargados.");
            return;
        }
        for (LibroC l : libros) l.mostrarInfo();
    }

    public LibroC buscarLibroPorIsbn(String isbn) {
        if (isbn == null) return null;
        for (LibroC l : libros) {
            if (isbn.equalsIgnoreCase(l.getIsbn())) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        LibroC l = buscarLibroPorIsbn(isbn);
        if (l == null) return false;
        return libros.remove(l);
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<LibroC> filtrarLibrosPorAnio(int anio) {
        List<LibroC> res = new ArrayList<>();
        for (LibroC l : libros) if (l.getAnioPublicacion() == anio) res.add(l);
        return res;
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores porque no hay libros cargados.");
            return;
        }
        Set<AutorC> autoresUnicos = new LinkedHashSet<>();
        for (LibroC l : libros) if (l.getAutor() != null) autoresUnicos.add(l.getAutor());
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
            return;
        }
        for (AutorC a : autoresUnicos) a.mostrarInfo();
    }
}
