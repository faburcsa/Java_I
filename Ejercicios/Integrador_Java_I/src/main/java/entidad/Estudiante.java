/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Fabian M. Urchueguia
 * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos 
* van a ser nombre y nota (representando la nota obtenida en el final). 
 */
public class Estudiante {
    private String nombre;
    private float nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
