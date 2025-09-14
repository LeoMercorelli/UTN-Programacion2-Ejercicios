/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio__13;

/**
 *
 * @author Leonel
 */
public class GeneradorQR {
    // Dependencia de creación: crea un CodigoQR dentro del método y no lo guarda
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        // Aca iría la lógica del metodo
    }
}
