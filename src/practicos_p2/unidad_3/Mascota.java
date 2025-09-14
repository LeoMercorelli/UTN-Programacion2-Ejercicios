/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_3;

/**
 *
 * @author Leonel
 */
public class Mascota {
    String nombre;
    String especie;
    double edad;
    
    
   void mostrarInfo() {
        System.out.println(
        nombre + "\n" + 
        especie + "\n" + 
        edad);
   } 
        
    void cumplirAnios (int anios){
        edad = edad + anios;
   }
   
}
