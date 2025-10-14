/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_4;

/**
 *
 * @author Leonel
 */
class Cliente {
    String nombre;
    String dni;
    TarjetaDeCredito tarjeta;       // Bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }  
}
