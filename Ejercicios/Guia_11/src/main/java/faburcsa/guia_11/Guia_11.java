/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package faburcsa.guia_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Guia_11 {

    public static void main(String[] args) {
        //Deteccion Errores.
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> ConjuntoArbol = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();

//        EJERCICIO COLECCIONES
//        Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a
//cada uno.
        for (int i = 0; i < 5; i++) {
            listado.add(i);
            ConjuntoArbol.add(String.valueOf(i));
            personas.put(i, String.valueOf(i));
        }

        System.out.println("ArrayList: " + listado.toString());
        System.out.println("Set: " + ConjuntoArbol.toString());
        System.out.println("Tree: " + personas.toString());

//        Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina
//        en cada uno un objeto de
//        cada forma que aprendiste arriba.
        int i = 3;
        listado.remove(i);
        ConjuntoArbol.remove(String.valueOf(i));
        personas.remove(i);
        System.out.println("");
        System.out.println("ArrayList: " + listado.toString());
        System.out.println("Set: " + ConjuntoArbol.toString());
        System.out.println("Tree: " + personas.toString());

//MANOS A LA OBRA – DETECCIÓN DE ERRORES - PAGINA 9 TEORIA
        HashMap<Integer, String> personasMap = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personasMap.put(1, n1);
        personasMap.put(2, n2);

        for (Map.Entry<Integer, String> entry : personasMap.entrySet()) {
            Object key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Nombre: " + value);
        }

        //MANOS A LA OBRA - DETECCIÓN DE ERRORES - ITERATOR
        ArrayList<String> bebidas = new ArrayList();

        bebidas.add("café");
        bebidas.add("té");

        Iterator<String> it = bebidas.iterator();

        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
    }
}
