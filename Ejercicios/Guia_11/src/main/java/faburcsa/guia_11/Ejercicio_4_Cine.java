/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia_11;

import entidades.Pelicula;
import java.util.ArrayList;
import servicios.ServicioPelicula;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_4_Cine {

    /**
     * @param args the command line arguments
     *
     * 4. Un cine necesita implementar un sistema en el que se puedan cargar
     * peliculas. Para esto, tendremos una clase Pelicula con el título,
     * director y duración de la película (en horas). Implemente las clases y
     * métodos necesarios para esta situación, teniendo en cuenta lo que se pide
     * a continuación: En el servicio deberemos tener un bucle que crea un
     * objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en
     * el objeto Pelicula. Después, esa Pelicula se guarda una lista de
     * Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
     * Después de ese bucle realizaremos las siguientes acciones:
     *
     * 22
     *
     * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas
     * las películas con una duración mayor a 1 hora. • Ordenar las películas de
     * acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. •
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y
     * mostrarlo en pantalla. • Ordenar las películas por título,
     * alfabéticamente y mostrarlo en pantalla. • Ordenar las películas por
     * director, alfabéticamente y mostrarlo en pantalla.
     *
     */
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculasList = new ArrayList();

        peliculasList = ServicioPelicula.buclePeliculas();
        ServicioPelicula.mostrarPeliculas(peliculasList);

        ServicioPelicula.mostrarPeliculasPlusHour(peliculasList);

        //Ordenando por Duracion
        ServicioPelicula.ordenarPeliculasDuracionMayorMenor(peliculasList);
        ServicioPelicula.mostrarPeliculas(peliculasList);

        ServicioPelicula.ordenarPeliculasDuracionMenorMayor(peliculasList);
        ServicioPelicula.mostrarPeliculas(peliculasList);

        //Ordenando por Titulo
        ServicioPelicula.ordenarPeliculasTitulo(peliculasList);
        ServicioPelicula.mostrarPeliculas(peliculasList);

        //Ordenando por Director
        ServicioPelicula.ordenarPeliculasDirector(peliculasList);
        ServicioPelicula.mostrarPeliculas(peliculasList);
    }

}
