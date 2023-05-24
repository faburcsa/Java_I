/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }


    
    @Override
    public void hacerRuido(){
        System.out.println("Guau!!!"); 
        
        
    }

    @Override
    public void alimentarse() {
        System.out.println("El Perro se alimenta de : " + alimento);
    }
    
}
