/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import guia_8.entidades.Cafetera;
import guia_8.servicios.CafeteraServicio;

/**
 *
 * @author Fabian M. Urchueguia
 
 Programa Nespresso. 
 
 Desarrolle una clase Cafetera en el paquete Entidades con
 los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cf1) 
 y cantidadActual (la cantidad actual de café que hay en la cf1). 
 Agregar constructor vacío y con parámetros así como setters y getters. 
 
 Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
 tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
 Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
 El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
 cuanto quedó la taza.
 
  
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 
  
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
 lo recibe y se añade a la cf1 la cantidad de café indicada.

 */
public class Ejercicio_2_Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicio cfs = new CafeteraServicio();
        Cafetera cf1 = cfs.crearCafetera();
        
        cfs.llenarCafetera(cf1);
        
        cfs.servirTaza(125 , cf1);
        cfs.servirTaza(200 , cf1);
        cfs.servirTaza(800 , cf1);
        
        //cfs.llenarCafetera(cf1);
        cfs.agregarCafe(200, cf1);
        cfs.servirTaza(800 , cf1);
        
        cfs.vaciarCafetera(cf1);
        cfs.servirTaza(600 , cf1);
                
    }
    
}
