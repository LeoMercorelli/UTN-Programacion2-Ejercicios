/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_2;

/**
 *
 * @author Leonel
 */
import java.util.Scanner;

public class PruebaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: debe estar entre 0 y 120 años.");
            }
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
