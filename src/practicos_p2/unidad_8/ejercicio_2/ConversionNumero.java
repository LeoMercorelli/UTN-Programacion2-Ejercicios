/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Leonel
 */

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Numero ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número valido.");
        } finally {
            sc.close();
        }
    }
}
