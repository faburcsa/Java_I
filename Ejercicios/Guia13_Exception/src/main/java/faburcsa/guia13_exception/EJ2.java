/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia13_exception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
 * código para generar y capturar una excepción ArrayIndexOutOfBoundsException
 * (índice de arreglo fuera de rango).
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List<String> nombres=new ArrayList<>();
        String nombres[] = new String[5]; // Le ponemos la dimension al vector

        try {
            for (int i = 0; i < 10; i++) {
                nombres[i] = String.valueOf(Math.random());
            }
        } catch (Exception e) {
            System.out.println("Excepcion " + e.getMessage() + " Capturada");
            System.out.println("Excepcion " + e.getLocalizedMessage() + " Capturada");
            System.out.println("Excepcion " + e.getCause() + " Capturada");
            System.out.println("Excepcion " + e.getClass() + " Capturada");
            System.out.println("Excepcion " + e.getStackTrace() + " Capturada");
            System.out.println(e.toString());
        }

    }

}
