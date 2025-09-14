/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio_7;

/**
 *
 * @author Leonel
 */
public class Vehiculo {
    String patente;
    String modelo;
    Motor motor;                     // Agregación hacia Motor
    Conductor conductor;             // Asociación bidireccional con Conductor

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
}
