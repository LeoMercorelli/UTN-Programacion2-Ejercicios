package practicos_p2.unidad_7.ejercicio_1;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + " ,marca: " + marca);
    }
}