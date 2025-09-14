/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio_9;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Leonel
 */
public class CitaMedica {
    LocalDate fecha;
    LocalTime hora;
    Paciente paciente;               // Asociaciones unidireccionales
    Profesional profesional;

    public CitaMedica(LocalDate fecha, LocalTime hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
}
