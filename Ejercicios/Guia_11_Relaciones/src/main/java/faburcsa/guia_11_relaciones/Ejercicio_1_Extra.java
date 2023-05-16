/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia_11_relaciones;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioPersona;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_1_Extra {

    /**
     * @param args the command line arguments Ahora se debe realizar unas
     * mejoras al ejercicio de Perro y Persona. Nuestro programa va a tener que
     * contar con muchas personas y muchos perros. El programa deberá
     * preguntarle a cada persona, que perro según su nombre, quiere adoptar.
     * Dos personas no pueden adoptar al mismo perro, si la persona eligió un
     * perro que ya estaba adoptado, se le debe informar a la persona. Una vez
     * que la Persona elige el Perro se le asigna, al final deberemos mostrar
     * todas las personas con sus respectivos perros.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personas = new ArrayList();
        personas.add(new Persona("Fabian", "Urchueguia", 41, 28950784));
        personas.add(new Persona("Candela", "Almada", 39, 30558838));
//        personas.add(new Persona("Lara", "Urchueguia", 20, 28950784));
//        personas.add(new Persona("Joaquin", "Urchueguia", 13, 30558838));
//        personas.add(new Persona("Celeste", "Urchueguia", 10, 30558838));

        ArrayList<Perro> perros = new ArrayList();
        perros.add(new Perro("Batuke", "DelMon", 7, 0.42f));
        perros.add(new Perro("Vicky", "Salchicha", 3, 0.55f));
        perros.add(new Perro("Chiquito", "DelMon", 7, 0.42f));
        perros.add(new Perro("Lady", "Salchicha", 3, 0.55f));
        perros.add(new Perro("Nieve", "DelMon", 7, 0.42f));
        perros.add(new Perro("Fer", "Salchicha", 3, 0.55f));

        for (Persona persona : personas) {
            boolean adoptar = true;

            do {
                System.out.println(persona.getNombre() + " - Seleccione un Perro a Adoptar:");
                for (Perro perro : perros) {
                    System.out.println(perro.getNombre());

                }
                String nombrePerro = leer.nextLine();

                ServicioPersona.asignaPerro(persona, perros, nombrePerro);
                
                System.out.println("Desea Adoptar otro? S/N");
                String otro=leer.nextLine().substring(0, 1).toUpperCase();
                System.out.println(otro);
                if (otro.equalsIgnoreCase("N")) {
                    //System.out.println("ENTRE");
                    adoptar=false;
                    //break;
                }
            } while (adoptar == true);

        }
        
        for (Persona per:personas) {
            System.out.println(per.toString());
        }

    }

}
