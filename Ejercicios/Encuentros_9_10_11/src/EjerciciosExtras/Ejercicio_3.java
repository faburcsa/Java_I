/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

/**
 *
 * @author Fabian M. Urchueguia Crear una función rellene un vector con números
 * aleatorios, pasándole un arreglo por parámetro. Después haremos otra función
 * o procedimiento que imprima el vector.
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = new int[3];
        rellenaVector(v);
        muestraVector(v);
    }

    public static void rellenaVector(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        //return array;
    }

    public static void muestraVector(int array[]) {
        for (int elemento : array) {
            System.out.println("[" + elemento + "]");
        }
    }
}
