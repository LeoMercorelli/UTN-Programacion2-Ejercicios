package practicos_p2.unidad_7.ejercicio_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        EmpleadoPlanta e1 = new EmpleadoPlanta();
        EmpleadoPlanta e2 = new EmpleadoPlanta();
        EmpleadoTemporal e3 = new EmpleadoTemporal();
        EmpleadoTemporal e4 = new EmpleadoTemporal();
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        int i = 0;
        for(Empleado e : empleados) {
            System.out.println("El empleado " + i + " cobra: " + e.calcularSueldo(e));
            i++; 
        }
    }
    
}
