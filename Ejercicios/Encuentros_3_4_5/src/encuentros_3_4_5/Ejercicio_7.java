/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_3_4_5;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FORMATO X???O
        String secuencia;
        int FDE = 0, notFDE = 0;

        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese Seuencia:");
            secuencia = leer.nextLine();
            if ((secuencia.length() == 5) && (secuencia.substring(0, 1).equals("X")) && (secuencia.substring(4).equals("O"))) {
                FDE++;
            } else {
                notFDE++;
            }

        } while (!secuencia.equals("&&&&&"));
        System.out.println("Lecturas Correctas FDE: " + FDE);
        System.out.println("Lecturas Incorrectas FDE: " + (notFDE - 1));

    }

}
