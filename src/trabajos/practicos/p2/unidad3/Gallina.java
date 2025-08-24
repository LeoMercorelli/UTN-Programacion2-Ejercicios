/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos.practicos.p2.unidad3;

/**
 *
 * @author Leonel
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;


    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println(
            "Gallina ID: " + idGallina + " / " +
            "Edad: " + edad + " / " +
            "Huevos puestos: " + huevosPuestos);
    }
}

