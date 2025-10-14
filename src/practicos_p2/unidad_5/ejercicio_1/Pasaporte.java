/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_1;

import java.time.LocalDate;

/**
 *
 * @author Leonel
 */
public class Pasaporte {
    String numero;
    LocalDate fechaEmision;
    Foto foto;                // Composición: el Pasaporte "posee" la Foto
    Titular titular;          // Asociación bidireccional con Titular


    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
}
}