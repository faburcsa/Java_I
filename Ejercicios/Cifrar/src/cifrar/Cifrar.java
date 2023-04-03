/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrar;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Cifrar {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        //      Bersa123=> UWHXVJQK43976317
//        //      Unisys.0 => DHAXNVCN44976027
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese pass a Cifrar");
//        String pass = leer.nextLine();
//
//        char[] mensaje = pass.toCharArray();
//        int tam = mensaje.length;
//        System.out.println("Mensaje original: " + new String(mensaje));
//        Cifrado.cifrar(mensaje);
//        System.out.println("Mensaje cifrado: " + new String(mensaje));
//    }
    public static void main(String[] args) {
        System.out.println("Bersa123=> UWHXVJQK43976317");
        char[] mensaje = "Bersa123".toCharArray();

        System.out.println("Mensaje original: " + new String(mensaje));

        String mensajeCifrado = Cifrado.cifrar(mensaje);

        System.out.println("Mensaje cifrado: " + new String(mensajeCifrado));
        System.out.println("Mensaje cifrado: " + new String(mensaje));
    }

}
