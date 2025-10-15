package practicos_p2.unidad_7.ejercicio_4;

public abstract class Animal {
    
    // Método abstracto cada animal debe implementar su sonido
    public abstract void hacerSonido();
    
    // Método común para todos los animales
    public void describirAnimal() {
        System.out.println("Soy un " + this.getClass().getSimpleName().toLowerCase() + " y así sueno:");
    }
}
