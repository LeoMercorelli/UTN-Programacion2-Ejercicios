package practicos_p2.unidad_7.ejercicio_3;

public class EmpleadoTemporal extends Empleado {

    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, double horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        // El empleado temporal cobra por hora
        return horasTrabajadas * valorHora;
    }
}
