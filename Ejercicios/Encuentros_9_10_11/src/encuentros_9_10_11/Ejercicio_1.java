/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9_10_11;

/**
 *
 * @author Fabian M. Urchueguia
 * Realizar un algoritmo que llene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[100];
        
        for (int i = 0; i < 100; i++) {
            //vector[i]=(int) Math.random()*100;
            vector[i]=i+1;
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.println(vector[(99-i)]);
        }
        
        //for (int nro: vector) {
        //    System.out.println(nro);
        //}
    }
    
}
