/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_3;

/**
 *
 * @author Leonel
 */
public class Estudiante {
            String nombre;
            String apellido;
            String curso;
    private double calificacion;
    
    
   void mostrarInfo() {
        System.out.println(
        nombre + "\n" + 
        apellido + "\n" + 
        curso + "\n" + 
        calificacion);
   }
    
    void subirCalificacion (double puntos) {
       calificacion = calificacion + puntos; // Como futura mejora, validar que no pueda exeder la calificacion maxima
    }
    
    void bajarCalificacion (double puntos) {
       calificacion = calificacion - puntos; // Como futura mejora, validar que no pueda exeder la calificacion minima 
    }
    
    
        
        
        
        
   }
