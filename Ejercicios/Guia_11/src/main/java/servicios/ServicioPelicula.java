/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 *
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
 * usuario si quiere crear otra Pelicula o no. Después de ese bucle realizaremos
 * las siguientes acciones:
 *
 *
 * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora.
 *
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y
 * mostrarlo en pantalla.
 *
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y
 * mostrarlo en pantalla.
 *
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 *
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en
 * pantalla.
 *
 */
public class ServicioPelicula {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Pelicula> peliculasList = new ArrayList();

    private static Pelicula crearPelicula() {
        System.out.println("Ingrese Titulo Pelicula:");
        String titulo = leer.next();
        System.out.println("Ingrese Director Pelicula:");
        String director = leer.next();

        System.out.println("Ingrese tiempo Horas:");
        int hh = leer.nextInt();
        System.out.println("Ingrese tiempo Minutos:");
        int mm = leer.nextInt();

        LocalTime horas = LocalTime.of(hh, mm);
        return new Pelicula(titulo, director, horas);
    }

    private static void agregarPelicula(Pelicula p) {
        peliculasList.add(p);
    }

    public static ArrayList<Pelicula> buclePeliculas() {
        String opcion;
        do {
            agregarPelicula(crearPelicula());

            System.out.println("");
            System.out.println("Desea Agregar Otra Pelicula - S/N?");
            opcion = leer.next().substring(0, 1).toUpperCase();

        } while (opcion.equals("S"));

        return peliculasList;
    }

    public static void mostrarPeliculas(ArrayList<Pelicula> peliArray) {
        //• Mostrar en pantalla todas las películas.
        System.out.println(peliArray.toString());
    }

    public static void mostrarPeliculasPlusHour(ArrayList<Pelicula> peliArray) {
        // * • Mostrar en pantalla todas las
        //* películas con una duración mayor a 1 hora. 
        System.out.println("");
        System.out.println("Peliculas con duracion mayor a 1 (una) hora:");
        for (Pelicula pelicula : peliArray) {
            if (pelicula.getHoras().getHour() >= 1 ) {
                System.out.println(pelicula.toString());
            }
            
        }

    }
    
    public static void ordenarPeliculasDuracionMayorMenor(ArrayList<Pelicula> peliArray){
        // * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y
        //* mostrarlo en pantalla.
        System.out.println("");
        System.out.println("Peliculas Ordenadas por Duracion de MAYOR a Menor:");
        Comparator<Pelicula> xDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t1.getHoras().compareTo(t.getHoras()); // Se invierte el objeto dependiendo que se busca primero
            }
        };
        
        Collections.sort(peliArray,xDuracion);
    }
    
    public static void ordenarPeliculasDuracionMenorMayor(ArrayList<Pelicula> peliArray){
        // * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y
        //* mostrarlo en pantalla.
        System.out.println("");
        System.out.println("Peliculas Ordenadas por Duracion de Menor a MAYOR:");
        Comparator<Pelicula> xDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getHoras().compareTo(t1.getHoras()); // Se invierte el objeto dependiendo que se busca primero
            }
        };
        
        Collections.sort(peliArray,xDuracion);
    }
    
        public static void ordenarPeliculasTitulo(ArrayList<Pelicula> peliArray){
//     * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        System.out.println("");
        System.out.println("Peliculas Ordenadas por TITULO:");
        Comparator<Pelicula> xDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().toUpperCase().compareTo(t1.getTitulo().toUpperCase()); // Se invierte el objeto dependiendo que se busca primero
            }
        };
        
        Collections.sort(peliArray,xDuracion);
    }
    

        public static void ordenarPeliculasDirector(ArrayList<Pelicula> peliArray){
// * • Ordenar las películas por director, alfabéticamente y mostrarlo en
// * pantalla.
        System.out.println("");
        System.out.println("Peliculas Ordenadas por DIRECTOR:");
        Comparator<Pelicula> xDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getDirector().toUpperCase().compareTo(t1.getDirector().toUpperCase()); // Se invierte el objeto dependiendo que se busca primero
            }
        };
        
        Collections.sort(peliArray,xDuracion);
    }

}
