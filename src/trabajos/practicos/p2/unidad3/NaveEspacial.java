/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos.practicos.p2.unidad3;

/**
 *
 * @author Leonel
 */
public class NaveEspacial {
    
    String nombre;
    int combustible;
    int limiteCombustible = 100; 




    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }



    public void avanzar(int distancia) {
        int consumo = distancia * 2; // cada unidad de distancia consume 2 unidades de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }



    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > limiteCombustible) {
            combustible = limiteCombustible;
            System.out.println("Tanque lleno. Combustible: " + combustible);
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }



    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + limiteCombustible);
    }
}


