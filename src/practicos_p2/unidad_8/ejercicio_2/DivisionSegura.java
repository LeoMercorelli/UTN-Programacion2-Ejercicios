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

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese el divisor: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } finally {
            sc.close();
        }
    }
}

