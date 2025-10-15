package practicos_p2.unidad_7.ejercicio_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Creamos empleados de planta y temporales con distintos valores
        Empleado e1 = new EmpleadoPlanta("Juan", 900000);
        Empleado e2 = new EmpleadoPlanta("María", 950000);
        Empleado e3 = new EmpleadoTemporal("Pedro", 160, 5300);
        Empleado e4 = new EmpleadoTemporal("Lucía", 120, 5200);
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        int i = 1;
        for (Empleado e : empleados) {
            System.out.println("Empleado " + i + " (" + e.nombre + ") cobra: " + e.calcularSueldo());
            i++; 
        }
    }
}
