/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio__14;

/**
 *
 * @author Leonel
 */
public class EditorVideo {
    // Dependencia de creación: crea un Render dentro del método y no lo guarda
    
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);
        // Aca iría la lógica del metodo
    }
}
