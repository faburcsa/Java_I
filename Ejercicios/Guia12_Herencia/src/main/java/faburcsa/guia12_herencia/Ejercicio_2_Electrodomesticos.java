/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia12_herencia;

import entidades.Lavadora;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 *  * Finalmente, en el main
 * debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor y
 * llamar a los métodos necesarios para mostrar el precio final de los dos
 * electrodomésticos.
 */
public class Ejercicio_2_Electrodomesticos {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        Lavadora lavarropas=new Lavadora();
        lavarropas.crearLavadora();
        lavarropas.precioFinal();
        
        System.out.println(lavarropas);
    }
    
}
