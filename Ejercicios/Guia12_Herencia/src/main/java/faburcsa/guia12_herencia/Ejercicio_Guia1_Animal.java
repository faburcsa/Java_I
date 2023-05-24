/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package faburcsa.guia12_herencia;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
* 
 */
public class Ejercicio_Guia1_Animal {

    public static void main(String[] args) {
        System.out.println("Animales");

        //Animal a = new Animal();
        Animal perro1 = new Perro("Strich","Carnivoro",15,"Doberman");
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuaha");
        Animal gato = new Gato("Pelusa","Galleta",15,"Siames");
        Animal caballo=new Caballo("SPark", "pasto", 25, "Fino");
        
        List<Animal> animales = new ArrayList();
        
        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato);
        animales.add(caballo);
        
        for (Animal aux : animales) {
            aux.hacerRuido();
            aux.alimentarse();
            
        }
    }
}
