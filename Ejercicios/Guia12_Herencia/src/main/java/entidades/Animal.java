/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public abstract class Animal {

    protected String nombre;
    protected String raza;
    protected int edad;
    protected String alimento;

    public void hacerRuido() {
        System.out.println("Hola.");
    }

    public abstract void alimentarse();

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.alimento = alimento;
    }

}
