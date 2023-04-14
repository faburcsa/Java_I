/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.servicios;

import java.util.Arrays;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes
 * métodos:
 *
 */
public class ArregloService {

    public void iniciaizarA(float[] arreglo) {
        //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (float) Math.random() * 100;
        }
    }

    public void mostrar(float[] arreglo) {
        //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
        System.out.println(Arrays.toString(arreglo));
    }

    public void ordenar(float[] arreglo) {
        //Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }

    public void inicializarB(float[] arregloA, float[] arregloB) {
        // Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
        // Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5f);
    }

}
