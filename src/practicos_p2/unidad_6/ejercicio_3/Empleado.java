package practicos_p2.unidad_6.ejercicio_3;

public abstract class Empleado {

    /**
     * Calcula el sueldo correspondiente a un empleado según su tipo.
     *
     * @param e el empleado del cual se desea calcular el sueldo. Puede ser una
     * instancia de EmpleadoPlanta o EmpleadoTemporal.
     * @return el sueldo del empleado: - 900000.0 si es EmpleadoPlanta -
     * 850000.0 si es EmpleadoTemporal - 0.0 si no pertenece a ninguno de los
     * tipos anteriores
     */
    
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 900000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 850000.0;
        } else {
            return 0;
        }
    }
}
