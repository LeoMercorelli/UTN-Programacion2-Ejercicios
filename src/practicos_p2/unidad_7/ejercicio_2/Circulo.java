package practicos_p2.unidad_7.ejercicio_2;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del cirulo " + nombre + " es igual a: " +  (radio *  3.14));
    }
}
