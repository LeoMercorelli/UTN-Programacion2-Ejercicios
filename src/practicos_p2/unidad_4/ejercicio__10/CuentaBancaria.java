/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio__10;

/**
 *
 * @author Leonel
 */
public class CuentaBancaria {
    String cbu;
    double saldo;
    ClaveSeguridad clave;          // Composición: CuentaBancaria posee ClaveSeguridad
    Titular titular;               // Asociación bidireccional con Titular


    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }
}
