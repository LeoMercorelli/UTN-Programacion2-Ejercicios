/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_2;

import java.util.List;

/**
 *
 * @author Leonel
 */

public class MainC {
    public static void main(String[] args) {
        
        // 1) Crear biblioteca
        BibliotecaC biblio = new BibliotecaC("Biblioteca Central");

        // 2) Crear tres autores
        AutorC a1 = new AutorC("AU001", "Jorge Luis Borges", "Argentina");
        AutorC a2 = new AutorC("AU002", "Isabel Allende", "Chile");
        AutorC a3 = new AutorC("AU003", "Gabriel García Márquez", "Colombia");

        // 3) Agregar 5 libros
        biblio.agregarLibro("ISBN-1001", "El Aleph", 1949, a1);
        biblio.agregarLibro("ISBN-1002", "Ficciones", 1944, a1);
        biblio.agregarLibro("ISBN-2001", "La casa de los espíritus", 1982, a2);
        biblio.agregarLibro("ISBN-3001", "Cien años de soledad", 1967, a3);
        biblio.agregarLibro("ISBN-3002", "El amor en los tiempos del cólera", 1985, a3);

        // 4) Listar todos
        System.out.println("4) Listado de libros");
        biblio.listarLibros();

        // 5) Buscar libro
        System.out.println("\n5) Buscar por ISBN (ISBN-3001)");
        LibroC buscado = biblio.buscarLibroPorIsbn("ISBN-3001");
        System.out.println(buscado != null ? buscado : "No encontrado");

        // 6) Filtrar por año
        System.out.println("\n6) Libros del año 1985");
        List<LibroC> anio1985 = biblio.filtrarLibrosPorAnio(1985);
        if (anio1985.isEmpty()) System.out.println("No hay libros de ese año.");
        for (LibroC l : anio1985) l.mostrarInfo();

        // 7) Eliminar libro
        System.out.println("\n7) Eliminar ISBN-2001 y listar");
        System.out.println(biblio.eliminarLibro("ISBN-2001") ? "Eliminado" : "No existe");
        biblio.listarLibros();

        // 8) Cantidad total
        System.out.println("\n8) Cantidad total de libros");
        System.out.println(biblio.obtenerCantidadLibros());

        // 9) Autores disponibles
        System.out.println("\n9) Autores disponibles");
        biblio.mostrarAutoresDisponibles();

        System.out.println("\nFin de la prueba.");
    }
}
