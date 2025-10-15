package practicos_p2.unidad_7.ejercicio_3;

public abstract class Empleado {
    
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto, cada tipo de empleado define su forma de calcular sueldo
    public abstract double calcularSueldo();
}
