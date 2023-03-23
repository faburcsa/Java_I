/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo_ejercicio_1;


import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 */
public class Guia_7_POO_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro1= new Libro();
        //String nombretitulo;

        System.out.println("Ingrese datos");
        System.out.println("ISBN, Titulo, Autor, Nro. Paginas");
        //libro1.cargarLibro(21212, "El Señor de los Anillos", "J.R. Tolkien", 523);
        
        libro1.cargarLibro(leer.nextInt(),leer.next(),leer.next(),leer.nextInt());
        
        libro1.mostrarLibro();
        
        //nombretitulo=libro1.getTitulo();
        //System.out.println("probar "+nombretitulo);
        
        //System.out.println(libro1);
    }

}
