/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidades.Pais;
import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class comparadores {

    public static Comparator<Pelicula> xDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().toUpperCase().compareTo(t1.getDirector().toUpperCase()); // Se invierte el objeto dependiendo que se busca primero
        }
    };

    public static Comparator<Pelicula> xTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().toUpperCase().compareTo(t1.getTitulo().toUpperCase()); // Se invierte el objeto dependiendo que se busca primero
        }
    };

    //Esta forma la arma NetBeasn Lambda... esta buena....
    public static Comparator<Pelicula> xDuracionMenorMayor = (Pelicula t, Pelicula t1) -> t.getHoras().compareTo(t1.getHoras()) // Se invierte el objeto dependiendo que se busca primero
            ;

    public static Comparator<Pelicula> xDuracionMayorMenor = (Pelicula t, Pelicula t1) -> t1.getHoras().compareTo(t.getHoras()) // Se invierte el objeto dependiendo que se busca primero
            ;

    public static Comparator<Pais> xNombreComparator = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}
