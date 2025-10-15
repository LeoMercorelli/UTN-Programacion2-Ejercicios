package practicos_p2.unidad_7.ejercicio_1;

public class Auto extends Vehiculo { 
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarInfo(){
        // Llamamos al método del padre para mostrar marca y modelo
        super.mostrarInfo();
        // Luego agregamos la información específica del Auto
        System.out.println("Cantidad de puertas: " + cantidadDePuertas);
    }
}

