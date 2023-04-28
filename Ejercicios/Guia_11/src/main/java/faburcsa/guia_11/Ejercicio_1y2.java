/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia_11;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicios.ServicioPerro;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_1y2 {

    /**
     * @param args the command line arguments Diseñar un programa que lea y
     * guarde razas de perros en un ArrayList de tipo String.
     *
     * El programa pedirá una raza de perro en un bucle, el mismo se guardará en
     * la lista y después se le preguntará al usuario si quiere guardar otro
     * perro o si quiere salir.
     *
     * Si decide salir, se mostrará todos los perros guardados en el ArrayList.
     */
    public static void main(String[] args) {
        ArrayList<Perro> ListaPerros = new ArrayList();
        String opcion;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        do {
            ListaPerros.add(ServicioPerro.crearPerro());
            System.out.println("");
            System.out.println("Desea Agregar Otro Perro S/N?");
            opcion = leer.next().substring(0, 1).toUpperCase();

            //System.out.println(opcion);
        } while (opcion.equals("S"));

        System.out.println(ListaPerros.toString());

        //EJERCICIO 2        
            //Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
            //un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
            //está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
            //ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
            //la lista ordenada.
            
        System.out.println("Ingrese un Perro a Buscar/Eliminar - Iterator");
        String perroSearch=leer.next();
        
        Iterator<Perro> itP = ListaPerros.iterator(); // El iterator se crea con las listas
        while (itP.hasNext()) {
            Perro itPerro = itP.next();
            if (itPerro.getNombre().equals(perroSearch)) {
                itP.remove();
            }
        }
        
        System.out.println(ListaPerros.toString());
        
    }

}
