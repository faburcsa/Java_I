/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import guia_8.entidades.CuentaBancariaGrafica;
import guia_8.servicios.CuentaBancariaGraficaServicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_1_CtaBancaria_Grafica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CuentaBancariaGrafica cb = new CuentaBancariaGrafica();
        CuentaBancariaGraficaServicio cbs = new CuentaBancariaGraficaServicio();

        boolean salir = true;

        do {
            Integer[] options = {0, 1, 2, 3, 4, 5};
            int n = (Integer) JOptionPane.showInputDialog(null, " MENU "
                    + "\n"
                    + "\n" + "1.Ingresar "
                    + "\n" + "2.Retirar "
                    + "\n" + "3.Extraccion rapida"
                    + "\n" + "4.Consultar saldo "
                    + "\n" + "5.Salir ",
                     "Cajero Automatico", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            int selecion = n;

            switch (selecion) {
                case 1:
                    String m = JOptionPane.showInputDialog("Ingrese dinero");
                    double money = Double.valueOf(m);
                    cbs.ingresar(money);
                    break;
                case 2:

                    String m2 = JOptionPane.showInputDialog("retiro de dinero" + "\n" + "salado actual :" + cbs.consultarSaldo() + "\n" + "CUANTO DESEA RETIRAR?");

                    double resulte2 = Double.valueOf(m2);

                    cbs.retirar(resulte2);

                    break;

                case 3:

                    String m3 = JOptionPane.showInputDialog("puede retirar solo el 20% de su sueldo");

                    double resulte3 = Double.valueOf(m3);

                    cbs.extraccionRapida(resulte3);

                    break;

                case 4:

                    System.out.println("---------- consultar saldo -------------");
                    JOptionPane.showMessageDialog(null, " su saldo es de :  " + cbs.consultarSaldo());
                    break;

                case 5:

                    System.out.println("---------- salir -------------");
                    salir = false;

                    break;

            }

        } while (salir == true);

    }

}
