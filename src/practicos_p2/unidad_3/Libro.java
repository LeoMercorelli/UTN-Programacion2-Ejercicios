/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicos_p2.unidad_3;

/**
 *
 * @author Leonel
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

  
    
// Constructor 
//AUN NO VIMOS CONSTRUCTORES EN LA CURSADA, PERO ME PARECIO LA MEJOR MANERA DE INSTANCIAR UN NUEVO LIBRO PARA EL EJERCICIO
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    
    
    // -------- GETTERS --------
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    
    
    // -------- SETTER (con validacion) --------
     public void setAnioPublicacion(int anio) {
        int minimo = 1500;
        int maximo = 2026;

        if (anio >= minimo && anio <= maximo) {
            anioPublicacion = anio; 
            System.out.println("El anio se modifico correctamente! (" + anio + ")");
        }
        else{
        System.out.println("El anio ingresado es invalido! (" + anio+ ")");
        }
       }  
        
        
        
    void mostrarInfo(){
        System.out.println(
        titulo + "\n" + 
        autor + "\n" + 
        anioPublicacion + "\n");
    }
        
        
        
   
}