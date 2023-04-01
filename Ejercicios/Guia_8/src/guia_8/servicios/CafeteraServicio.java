/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.servicios;

import guia_8.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        return new Cafetera(1000, 0);
    }

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public void llenarCafetera(Cafetera cafe) {
        System.out.println("LLENANDO CAFETERA...");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }

    public void servirTaza(int tazaSize, Cafetera cafe) {
        //* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
        //* tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
        //* Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
        //* El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
        //* cuanto quedó la taza.

        int cantCafe = cafe.getCantidadActual();
        System.out.println("CAFE DISPONIBLE: " + cantCafe + " TAMAÑO TAZA: " + tazaSize + " cm3.");
        System.out.println("Sirviendo Cafe...");

        int simulaServir = 5;
        float totalAvance = tazaSize / simulaServir;
        float acumCafe = 0;

        while (cantCafe >= totalAvance && acumCafe <= tazaSize) {
            acumCafe += totalAvance;
            if (acumCafe <= tazaSize) {
                System.out.println("Sirviendo " + acumCafe + "cm3 de Cafe de un total de " + tazaSize);
                cantCafe -= totalAvance;
                //System.out.println("Cant Cafe" + cantCafe);
            }
        }

        if (cantCafe > 0 && acumCafe > tazaSize) {
            //System.out.println("Sirviendo " + cantCafe); 
            System.out.println("TAZA LLENA...");
        } else {
            System.out.println("Sirviendo " + (acumCafe + cantCafe) + "cm3 de Cafe de un total de " + tazaSize);
            System.out.println("SE TERMINO EL CAFE...");
            System.out.println("Solo se sirvio " + (acumCafe + cantCafe) + "cm3 de Cafe.");
            cantCafe=0; // Se Vacio la Cafetera
        }

        cafe.setCantidadActual(cantCafe);

    }

    public void vaciarCafetera(Cafetera cafe) {
        //Método vaciarCafetera(): pone la cantidad de café actual en cero.
        System.out.println("VACIANDO CAFETERA...");
        cafe.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad, Cafetera cafe) {
        // Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
        // lo recibe y se añade a la cafetera la cantidad de café indicada.
        System.out.println("CAFE ACTUAL: " +  cafe.getCantidadActual());
        System.out.println("AGREGANDO " + cantidad + " cm3 de Cafe.");
        cafe.setCantidadActual(cantidad + cafe.getCantidadActual());
    }

}
