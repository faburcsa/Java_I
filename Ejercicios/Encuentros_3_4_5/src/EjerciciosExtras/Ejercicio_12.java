/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

/**
* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
* con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
* Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            String numString = String.format("%03d", i); // convierte el número a un string de 3 caracteres
            numString = numString.replace("3", "E"); // reemplaza cualquier 3 por una E
            System.out.println(numString.substring(0, 1)+"-"+numString.substring(1, 2)+"-"+numString.substring(2)); // muestra el resultado en la consola
        }
    }

}
