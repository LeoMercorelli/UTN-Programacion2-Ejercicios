package practicos_p2.unidad_7.ejercicio_3;

public class EmpleadoPlanta extends Empleado {

    private double sueldoBase;

    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        // El empleado de planta tiene un sueldo fijo
        return sueldoBase;
    }
}
