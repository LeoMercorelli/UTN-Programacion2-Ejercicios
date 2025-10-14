/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4;

/**
 *
 * @author Leonel
 */
public class MainTest {
    public static void main(String[] args) {

        Empleado e1 = new Empleado(1, "Ana Lopez", "Gerente", 450000);
        Empleado e2 = new Empleado("Carlos Perez", "Vendedor");
        Empleado e3 = new Empleado("Maria Gomez", "Diseñadora");

        System.out.println("Empleados creados");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Aplicar aumentos de sueldo
        e1.actualizarSalario(10);      // aumento del 10%
        e2.actualizarSalario(50000);   // aumento fijo
        e3.actualizarSalario(5);       // aumento del 5%

        System.out.println("\n=== Después de los aumentos ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
