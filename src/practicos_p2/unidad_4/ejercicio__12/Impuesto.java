/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio__12;

/**
 *
 * @author Leonel
 */
public class Impuesto {
    double monto;
    Contribuyente contribuyente;          // Asociación unidireccional hacia Contribuyente

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
}
