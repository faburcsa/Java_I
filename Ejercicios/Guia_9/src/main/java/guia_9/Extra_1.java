/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_9;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Extra_1 {

    /**
     * Crea una clase en Java donde declares una variable de tipo array de
     * Strings que contenga los doce meses del año, en minúsculas.A
 continuación, declara una variable mesSecreto de tipo String, y hazla
 igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
 programa debe pedir al usuario que adivine el mes secreto. Si el usuario
 acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
 adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser
 este: Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
 febrero No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 ¡Ha acertado!
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[8];

        System.out.println("Adivine el mes secreto!!!");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean flag = false;
        while (flag == false) {
            System.out.println("Introduzca el nombre del mes en minúsculas:");
            String mesUser = leer.next().toLowerCase();

            if (mesUser.equals(mesSecreto)) {
                System.out.println("Ha Acertado!!!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        }
    }
}
