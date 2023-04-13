/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.servicios;

import guia9.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Crear una clase CadenaServicio en el paquete servicios que implemente los
 * siguientes métodos:
 *
 */
public class CadenaServicio {

    public Cadena crearCadena() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Frase:");
        return new Cadena(leer.next());
    }

    public int mostrarVocales(Cadena c1) {
        /*
        * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene
        * la frase ingresada.
         */
        int cont = 0;
        char letra;

        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            letra = Character.toUpperCase(c1.getFrase().charAt(i));
            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    cont++;
                    break;
            }
        }
        return cont;
    }

    public void invertirFrase(Cadena c1) {
        /*Método invertirFrase(), deberá invertir la frase
        * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
        * Salida: "acnalb asac". 
        */
        
        // for Inverso
        for (int i = c1.getLongitudFrase() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(String letra, Cadena c1) {
        /*
        * Método vecesRepetido(String letra), recibirá un carácter ingresado por el
        * usuario y contabilizar cuántas veces se repite el carácter en la frase, por
        * ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
        * veces. 
        */
        int contador = 0;
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            if ((c1.getFrase().substring(i, i + 1).equals(letra))) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
    }

    public boolean compararLongitud(String frase, Cadena c1) {
        /*
        Método compararLongitud(String frase), deberá comparar la longitud de
        * la frase que compone la clase con otra nueva frase ingresada por el usuario.
        */
        boolean resultado = false;
        if (frase.length() == c1.getLongitudFrase()) {
            resultado = true;
        }

        return resultado;
    }

    public void unirFrases(String frase, Cadena c1) {
        /*
        Método unirFrases(String frase), deberá unir la frase contenida en la clase
        * Cadena con una nueva frase ingresada por el usuario y mostrar la frase
        * resultante.
         */
        System.out.println(c1.getFrase() + " " + frase);
        System.out.println(c1.getFrase().concat(" "+frase));
    }

    public void reemplazar(String letra, Cadena c1) {
        /*
        *  Método reemplazar(String letra), deberá reemplazar todas las
        * letras “a” que se encuentren en la frase, por algún otro carácter
        * seleccionado por el usuario y mostrar la frase resultante. 
         */

        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            if (c1.getFrase().charAt(i) == 'a') {
                System.out.print(letra);
            } else {
                System.out.print(c1.getFrase().charAt(i));
            }

        }
        System.out.println("");

    }

    public boolean contiene(String letra, Cadena c1) {
        /*
        Método
        * contiene(String letra), deberá comprobar si la frase contiene una letra que
        * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
         */
        boolean contiene = false;

        for (int i = 0; i < c1.getLongitudFrase(); i++) {

            if (String.valueOf(c1.getFrase().charAt(i)).equals(letra)) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
}
