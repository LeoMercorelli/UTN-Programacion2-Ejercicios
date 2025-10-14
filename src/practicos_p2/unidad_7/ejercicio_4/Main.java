package practicos_p2.unidad_7.ejercicio_4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();

        animales.add(p1);
        animales.add(g1);
        animales.add(v1);

        for (Animal a : animales) {
            a.hacerSonido();
        }

    }

}
