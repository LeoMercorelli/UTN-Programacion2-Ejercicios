package practicos_p2.unidad_7.ejercicio_2;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto que las subclases deberán implementar
    public abstract double calcularArea();
}