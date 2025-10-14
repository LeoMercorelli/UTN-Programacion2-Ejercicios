/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_6;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Leonel
 */
public class Reserva {
    LocalDate fecha;
    LocalTime hora;
    Cliente cliente;           // Asociación unidireccional hacia Cliente
    Mesa mesa;                 // Agregación hacia Mesa

    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
}
