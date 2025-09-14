/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio_2;

/**
 *
 * @author Leonel
 */
public class Celular {
    String imei;
    String marca;
    String modelo;
    Bateria bateria;        // Agregación: referencia a Batería (puede existir por fuera)
    Usuario usuario;        // Asociación bidireccional con Usuario


    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
}
