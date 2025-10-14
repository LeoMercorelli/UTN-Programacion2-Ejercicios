/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio__11;

/**
 *
 * @author Leonel
 */
public class Cancion {
    String titulo;
    Artista artista;            // Asociación unidireccional hacia Artista

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
}
