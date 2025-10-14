/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_5.ejercicio_4;
import java.time.LocalDate;

/**
 *
 * @author Leonel
 */
public class TarjetaDeCredito {
    String numero;
    LocalDate fechaVencimiento;
    Cliente cliente;                   // Asociación bidireccional con Cliente
    Banco banco;                       // Agregación hacia Banco


    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
}
