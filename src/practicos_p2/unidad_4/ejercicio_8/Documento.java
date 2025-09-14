/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio_8;

/**
 *
 * @author Leonel
 */
public class Documento {
    String titulo;
    String contenido;
    FirmaDigital firma;              // Composición: Documento posee FirmaDigital

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }
}
