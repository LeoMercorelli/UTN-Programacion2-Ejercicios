/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio_5;

/**
 *
 * @author Leonel
 */
public class Computadora {
    String marca;
    String numeroSerie;
    PlacaMadre placaMadre;         // Composición: la Computadora "posee" la PlacaMadre
    Propietario propietario;       // Asociación bidireccional con Propietario

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }
}
