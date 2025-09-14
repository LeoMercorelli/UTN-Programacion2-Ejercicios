/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4.ejercicio_8;
import java.time.LocalDate;

/**
 *
 * @author Leonel
 */
class FirmaDigital {
    String codigoHash;
    LocalDate fecha;
    Usuario usuario;             // Agregación hacia Usuario

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}
