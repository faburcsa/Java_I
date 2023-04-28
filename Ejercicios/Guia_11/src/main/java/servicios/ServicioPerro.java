/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ServicioPerro {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Perro crearPerro(){
        System.out.println("Ingrese Nombre Perro:");
        String nombre=leer.next();
        
        System.out.println("Ingrese Raza Perro:");
        String raza=leer.next();
        
        return new Perro(raza, nombre);
        
    }
}
