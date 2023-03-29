/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * . Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a
 * dos jugadores jugar un juego de adivinanza de números. El primer jugador
 * elige un número y el segundo jugador intenta adivinarlo. El segundo jugador
 * tiene un número limitado de intentos y recibe una pista de "más alto" o "más
 * bajo" después de cada intento. El juego termina cuando el segundo jugador
 * adivina el número o se queda sin intentos. Registra el número de intentos
 * necesarios para adivinar el número y el número de veces que cada jugador ha
 * ganado
 */
public class Juego {

    private int reintentos,reintentosTotales;
    private int nroAdivinanza, nroIngresado;

    public void iniciar_juego() {
        boolean flag = false;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Jugador Nro.1 - Ingrese Nro. a Adivinar:");
        nroAdivinanza = leer.nextInt();

        for (int i = 0; i < reintentosTotales; i++) {
            System.out.println("Jugador Nro. 2 - Cual es el Nro.? - Intento " + (i + 1) + " de " + reintentosTotales);
            nroIngresado = leer.nextInt();

            if (nroAdivinanza == nroIngresado) {
                flag = true;
                reintentos=i+1;
                break;
            } else {
                reintentos=i+1;
                if (nroIngresado < nroAdivinanza) {
                    System.out.println("PISTA - El numero ingresado es MENOR");
                } else {
                    System.out.println("PISTA - El numero ingresado es MAYOR");
                }
            }
        }

        if (flag) {
            System.out.println("ADIVINO!!! - Jugador Nro. 2: Gano el Juego!!!");
            System.out.println("Utilizo " + reintentos + " de " + reintentosTotales + " Reintentos.");
        } else {
            System.out.println("NO ADIVINO - Jugador Nro. 1: Gano el Juego!!!");
        }

    }

    public Juego() {
    }

    public Juego(int reintentosTotales) {
        // Constructor con cant. de Reintentos definido
        this.reintentosTotales = reintentosTotales;
    }

    public int getReintentosTotales() {
        return reintentosTotales;
    }

    public int getNroAdivinanza() {
        return nroAdivinanza;
    }

    public int getNroIngresado() {
        return nroIngresado;
    }

    public void setReintentosTotales(int reintentosTotales) {
        this.reintentosTotales = reintentosTotales;
    }

    public void setNroAdivinanza(int nroAdivinanza) {
        this.nroAdivinanza = nroAdivinanza;
    }

    public void setNroIngresado(int nroIngresado) {
        this.nroIngresado = nroIngresado;
    }

}
