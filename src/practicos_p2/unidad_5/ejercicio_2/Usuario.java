/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_2;

/**
 *
 * @author Leonel
 */
class Usuario {
    String nombre;
    String dni;
    Celular celular;       // Asociación bidireccional


    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}
