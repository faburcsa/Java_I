/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_9;

import guia9.servicios.ArregloService;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_III_Arreglo_Array {

    /**
     * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
     * B de 20 números reales. 
     * 
     * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
* 
* Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

     */
    public static void main(String[] args) {
        float vectorA[] = new float[50];
        float vectorB[] = new float[20];
        
        ArregloService arrs = new ArregloService();
        arrs.iniciaizarA(vectorA);
        arrs.mostrar(vectorA);
        
        arrs.ordenar(vectorA);
        arrs.inicializarB(vectorA, vectorB);
        
        arrs.mostrar(vectorA);
        arrs.mostrar(vectorB);
        
    }
    
}
