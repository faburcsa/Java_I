/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Ejercicio_II {
    public static void main(String[] args) {
        //psvm y tab para crear el public main
        
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        System.out.println("Ejercicio Nro. II");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su Nombre");
        String nombre=leer.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad=leer.nextInt();
        
        System.out.println("Su nombre es "+ nombre + " y su edad es "+edad);
        
                
    }
}
