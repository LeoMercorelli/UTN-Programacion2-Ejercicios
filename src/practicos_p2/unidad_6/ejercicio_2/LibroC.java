/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_2;

/**
 *
 * @author Leonel
 */

public class LibroC {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private AutorC autor;

    public LibroC(String isbn, String titulo, int anioPublicacion, AutorC autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public AutorC getAutor() { return autor; }
    public void setAutor(AutorC autor) { this.autor = autor; }

    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String autorStr = (autor != null) ? (autor.getNombre() + " (" + autor.getNacionalidad() + ")") : "SIN_AUTOR";
        return "LibroC{isbn='" + isbn + "', titulo='" + titulo + "', anio=" + anioPublicacion + ", autor=" + autorStr + "}";
    }
}
