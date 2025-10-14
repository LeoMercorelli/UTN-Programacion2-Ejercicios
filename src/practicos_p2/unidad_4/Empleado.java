/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_4;

/**
 *
 * @author Leonel
 */

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; 
    }

    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados; // genera id automatico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 200000.0; // sueldo por defecto
    }


    // Aumentar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Aumentar salario por monto fijo
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    
    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Empleado [ID: " + id + 
               ", Nombre: " + nombre + 
               ", Puesto: " + puesto + 
               ", Salario: $" + salario + "]";
    }
}