/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_8.ejercicio_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Leonel
 */

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("texto.txt");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
    }
}
