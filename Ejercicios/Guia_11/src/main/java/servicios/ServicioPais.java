/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.comparadores;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ServicioPais {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static HashSet<Pais> paisList = new HashSet();

    private static Pais crearPais() {
        System.out.println("Ingrese Nombre Pais:");
        String nombre = leer.next();

        return new Pais(nombre);
    }

    private static void agregarPais(Pais p) {
        paisList.add(p);
    }

    public static HashSet<Pais> buclePais() {
        String opcion;
        do {
            agregarPais(crearPais());

            System.out.println("");
            System.out.println("Desea Agregar Otro Pais - S/N?");
            opcion = leer.next().substring(0, 1).toUpperCase();

        } while (opcion.equals("S"));

        return paisList;
    }

    public static void mostrarPais(HashSet<Pais> paisSet) {
        //Mostrar en pantalla todos las paises.
        System.out.println(paisSet.toString());
    }

    public static void mostrarPaisSort(HashSet<Pais> paisSort) {
        //Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
        //cómo se ordena un conjunto.   

        // para ordenar un conjunto se debe convertir a lista
        System.out.println("Conjunto Ordenado:");
        ArrayList<Pais> listaPais = new ArrayList(paisSort);

        //debe existir un comparador si es un objeto
        Collections.sort(listaPais, comparadores.xNombreComparator);

        System.out.println(listaPais.toString());
    }

    public static void eliminarPais(HashSet<Pais> paisRemove) {
        //Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
        //buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
        //usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
        //al usuario.
        boolean bandera = false;

        System.out.println("");
        System.out.println("Ingrese un pais a eliminar:");
        String paisSeach = leer.next();

        Iterator<Pais> itPais = paisRemove.iterator(); // Creo iterator leyendo Conjunto

        while (itPais.hasNext()) {   // si hay otro elemento
            //  System.out.println(itPais.next());
            Pais pais = itPais.next();   // un objeto de ese tipo toma el valor
            if (pais.getNombre().equals(paisSeach)) { //Comparo
                itPais.remove(); // remuevo
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("El pais a eliminar NO existe.");
        }

    }

}
