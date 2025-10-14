/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_3;

/**
 *
 * @author Leonel
 */
public class Libro {
    String titulo;
    String isbn;
    Autor autor;             // Asociación unidireccional hacia Autor
    Editorial editorial;     // Asociación unidireccional hacia Autor


    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
}
