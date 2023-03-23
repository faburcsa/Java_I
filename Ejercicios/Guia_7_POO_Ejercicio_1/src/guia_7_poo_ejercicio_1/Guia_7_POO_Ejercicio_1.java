/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo_ejercicio_1;

import Entidad.Circunferencia;
import Entidad.Libro;
import Entidad.Operacion;
import Entidad.Punto;
import Entidad.Rectangulo;
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
        // EJERCICIO N. 1
        System.out.println("EJERCICIO N. 1");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro1 = new Libro();
        //String nombretitulo;

        System.out.println("Ingrese datos");
        System.out.println("ISBN, Titulo, Autor, Nro. Paginas");
        //libro1.cargarLibro(21212, "El Señor de los Anillos", "J.R. Tolkien", 523);

        libro1.cargarLibro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());

        libro1.mostrarLibro();

        //nombretitulo=libro1.getTitulo();
        //System.out.println("probar "+nombretitulo);
        //System.out.println(libro1);
        // =======================================================================
        // EJERCICIO N. 2
        System.out.println("EJERCICIO N. 2");
        Circunferencia c1 = new Circunferencia(0);
        c1.crearCircunferencia();
        System.out.println(c1.perimetro(c1.getRadio()));
        System.out.println(c1.area(c1.getRadio()));

        // =======================================================================
        // EJERCICIO N. 3
        System.out.println("EJERCICIO N. 3");
        Operacion o1 = new Operacion();
        o1.crearOperacion();

        System.out.println("Suma " + o1.sumar());
        System.out.println("Resta " + o1.restar());
        System.out.println("Multiplicacion " + o1.multiplicar());
        System.out.println("Division " + o1.dividir());

        // =======================================================================
        // EJERCICIO N. 4
        System.out.println("EJERCICIO N. 4");
        
        Rectangulo r1=new Rectangulo();
        r1.crearRectangulo();
        
        System.out.println("Perimetro: "+r1.perimetro());
        System.out.println("Area: "+r1.superficie());
        
        r1.dibujaRectangulo();
        
        // =======================================================================
        // EJERCICIO EXTRA N. 1
        System.out.println("EJERCICIO EXTRA N. 1");
        System.out.println("Clase Cancion creada");
        
        // =======================================================================
        // EJERCICIO EXTRA N. 2
        System.out.println("EJERCICIO EXTRA N. 2");
        Punto p1=new Punto();
        
        p1.crearPuntos();
        System.out.println("Distancia entre puntos: "+p1.distancia());
    }

}
