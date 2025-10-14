/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_6.ejercicio_3;

/**
 *
 * @author Leonel
 */

public class MainD {
    
    public static void main(String[] args) {
        // 1) Crear 3 profesores y 5 cursos
        ProfesorD pr1 = new ProfesorD("P01", "Ana Suárez", "Bases de Datos");
        ProfesorD pr2 = new ProfesorD("P02", "Luis Gómez", "Programación");
        ProfesorD pr3 = new ProfesorD("P03", "María Torres", "Redes");

        CursoD c1 = new CursoD("CUR-101", "Algoritmos");
        CursoD c2 = new CursoD("CUR-102", "Programación I");
        CursoD c3 = new CursoD("CUR-201", "Programación II");
        CursoD c4 = new CursoD("CUR-202", "Base de Datos I");
        CursoD c5 = new CursoD("CUR-301", "Redes I");

        // 2) Agregar a la universidad
        UniversidadD univ = new UniversidadD("UTN – UniversidadD");
        univ.agregarProfesor(pr1);
        univ.agregarProfesor(pr2);
        univ.agregarProfesor(pr3);

        univ.agregarCurso(c1);
        univ.agregarCurso(c2);
        univ.agregarCurso(c3);
        univ.agregarCurso(c4);
        univ.agregarCurso(c5);

        // 3) Asignar profesores
        univ.asignarProfesorACurso("CUR-101", "P02");
        univ.asignarProfesorACurso("CUR-102", "P02");
        univ.asignarProfesorACurso("CUR-201", "P02");
        univ.asignarProfesorACurso("CUR-202", "P01");
        univ.asignarProfesorACurso("CUR-301", "P03");

        // 4) Listados
        System.out.println("Cursos");
        univ.listarCursos();
        System.out.println("\nProfesores");
        univ.listarProfesores();
        System.out.println("\nCursos por profesor");
        System.out.println(pr1.getNombre() + ":"); pr1.listarCursos();
        System.out.println(pr2.getNombre() + ":"); pr2.listarCursos();
        System.out.println(pr3.getNombre() + ":"); pr3.listarCursos();

        // 5) Cambiar profesor de un curso
        System.out.println("\nCambiar profesor de CUR-201 a Ana");
        univ.asignarProfesorACurso("CUR-201", "P01");
        System.out.println("Curso actualizado: " + univ.buscarCursoPorCodigo("CUR-201"));
        System.out.println("Cursos de Ana:"); pr1.listarCursos();
        System.out.println("Cursos de Luis:"); pr2.listarCursos();

        // 6) Eliminar un curso
        System.out.println("\nEliminar curso CUR-102");
        univ.eliminarCurso("CUR-102");
        System.out.println("Cursos de Luis después de eliminar:"); pr2.listarCursos();

        // 7) Eliminar un profesor (deja null en sus cursos)
        System.out.println("\nEliminar profesor P03 (María)");
        univ.eliminarProfesor("P03");
        System.out.println("Estado de CUR-301: " + univ.buscarCursoPorCodigo("CUR-301"));

        // 8) Reporte simple
        System.out.println("\nCantidad de cursos por profesor");
        System.out.println(pr1.getNombre() + ": " + pr1.getCursos().size());
        System.out.println(pr2.getNombre() + ": " + pr2.getCursos().size());
        System.out.println(pr3.getNombre() + ": " + pr3.getCursos().size());

        System.out.println("\nFin de la prueba.");
    }
}
