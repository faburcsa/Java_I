/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package faburcsa.guia_11_relaciones;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author Fabian M. Urchueguia Realizar un programa para que una Persona pueda
 * adoptar un Perro. Vamos a contar de dos clases. Perro, que tendrá como
 * atributos: nombre, raza, edad y tamaño; y la clase Persona con atributos:
 * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main crear
 * dos Personas y dos Perros. Después, vamos a tener que pensar la lógica
 * necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Fabian", "Urchueguia", 41, 28950784);
        Persona p2 = new Persona("Candela", "Almada", 39, 30558838);

        Perro perro1 = new Perro("Batuke", "DelMon", 7, 0.42f);
        Perro perro2 = new Perro("Vicky", "Salchicha", 3, 0.55f);

        //p1.setPerro(perro1);
        //p2.setPerro(perro2);
        System.out.println(p1);
        System.out.println(p2);

    }
}
