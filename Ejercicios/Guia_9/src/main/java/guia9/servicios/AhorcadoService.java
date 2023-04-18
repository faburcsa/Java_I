/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.servicios;

import guia9.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * //Definir los siguientes métodos en AhorcadoService:
 *
 */
public class AhorcadoService {

    public static Ahorcado crearJuego() {
        //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
        //* Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
        //* Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
        //* en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese Palabra clave:");
        String palabra = leer.next();

        System.out.println("Ingrese Cantidad de jugadas Posibles:");
        int cantJugadas = leer.nextInt();

        String[] vPalabra = new String[longitud(palabra)]; // Inicializo Vector Paralabra con la longitud

        for (int i = 0; i < vPalabra.length; i++) {        // Lleno el Vector con la palabra
            vPalabra[i] = palabra.substring(i, i + 1);
        }

        return new Ahorcado(vPalabra, cantJugadas, longitud(palabra));
    }

    public static int longitud(String palabra) {
        //Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
        //Nota: buscar como se usa el vector.length.
        //System.out.println("La longitud de la palabra es de : " + palabra.length() + " caracteres.");
        return palabra.length();
    }

    public static int checkVector(char letra, Ahorcado ah) {
        int cont = 0;
        String vPalabra[] = ah.getPalabra();
        String vPalabraShow[] = ah.getPalabraShow();

        for (int i = 0; i < vPalabra.length; i++) {    // Recorro el vector Palabra para ver si esta mas de una vez la misma letra, voy llenando el de resultado
            if (vPalabra[i].equalsIgnoreCase(String.valueOf(letra))) {
                vPalabraShow[i] = vPalabra[i];
                cont++; // Sumo si existe la letra, que puede estar mas de una vez
            }
            //System.out.print("[" + vPalabra[i] + "]");
            System.out.print("[" + vPalabraShow[i] + "]");
        }
        System.out.println("");
        ah.setPalabraShow(vPalabraShow); // Actualizo el vector resultado
        return cont;
    }

    public static boolean buscarLetra(char letra, Ahorcado ah) {
        //Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la 
        //letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
        String vPalabra[] = ah.getPalabra();
        boolean flag = false;

        for (String letraPalabra : vPalabra) {
            if (letraPalabra.equalsIgnoreCase(String.valueOf(letra))) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("La Letra " + letra + " pertenece a la palabra.");
        } else {
            System.out.println("La Letra " + letra + " no pertenece a la palabra.");
        }
        return flag;
    }

    public static boolean encontradas(char letra, Ahorcado ah) {
        /*Método encontradas(letra): que reciba una letra ingresada por el usuario y
        * muestre cuantas letras han sido encontradas y cuántas le faltan. Este método
        * además deberá devolver true si la letra estaba y false si la letra no estaba,
        * ya que, cada vez que se busque una letra que no esté, e le restará uno a sus
        * oportunidades. */
        boolean flag = false;
        if (buscarLetra(letra, ah)) {
            int count = checkVector(letra, ah);
            ah.setCantFound(ah.getCantFound() + count);
            flag = true;
        } else {
             checkVector(letra, ah);
        }

        System.out.println("Cant. de letras encontradas: " + ah.getCantFound());
        System.out.println("Cant. de letras faltantes: " + (ah.getPalabra().length - ah.getCantFound()));
        return flag;
    }

    public static void intentos(Ahorcado ah) {
        //Método intentos(): para mostrar cuántas oportunidades le
        // queda al jugador. 
        System.out.println("Número de oportunidades restantes: " + ah.getCantMaxJuegos());
    }

    public static void juego() {
        // * //Método juego(): el método juego se encargará de llamar todos los métodos
        // * previamente mencionados e informará cuando el usuario descubra toda la
        // * palabra o se quede sin intentos. Este método se llamará en el main.
        Ahorcado ahj = crearJuego();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //System.out.println(ahj.getCantMaxJuegos());

        while (ahj.getCantMaxJuegos() > 0) {
            if (ahj.getLongitud() == ahj.getCantFound()) {
                System.out.println("GANO!!!!");
                break;
            }
            System.out.println("Longitud Palabra: " + ahj.getLongitud());

            System.out.print("Ingrese una Letra: ");
            char letraUser = leer.next().charAt(0);

            if (!encontradas(letraUser, ahj)) {
                ahj.setCantMaxJuegos(ahj.getCantMaxJuegos() - 1);
            }

            intentos(ahj);
        }
        
        if (ahj.getLongitud() != ahj.getCantFound()) {
            System.out.println("PERDIO!!!!");
            System.out.println("La palabra era: \n"+ String.valueOf(Arrays.toString(ahj.getPalabra())));
        }

    }

}
