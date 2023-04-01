/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.servicios;

import guia_8.entidades.CuentaBancariaGrafica;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class CuentaBancariaGraficaServicio {

    CuentaBancariaGrafica cbg = new CuentaBancariaGrafica();

    Scanner sc = new Scanner(System.in);

    
    public void ingresar(double dinero) {

        cbg.setSaldoActual(cbg.getSaldoActual() + dinero);
 

        JOptionPane.showMessageDialog(null, " su saldo actual es de " + cbg.getSaldoActual());

    }

    public String consultarSaldo() {
        //MÃ©todo consultarSaldo: permitirÃ¡ consultar el saldo disponible en la cuenta.

        return "" + cbg.getSaldoActual();

    }

    public void retirar(double retirar) {
//MÃ©todo retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
//Si la cuenta no tiene la cantidad de dinero a retirar se retirarÃ¡ el mÃ¡ximo posible hasta dejar la
//cuenta en 0.

        while (retirar > cbg.getSaldoActual()) {

            JOptionPane.showMessageDialog(null,
                    "superaste el limite",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);

            String m = JOptionPane.showInputDialog(null, "ingresa una cantidad menor");

            retirar = Double.valueOf(m);

        }

        cbg.setSaldoActual(cbg.getSaldoActual() - retirar);

    }

    public void consultarDatos() {
//MÃ©todo consultarDatos: permitirÃ¡ mostrar todos los datos de la cuenta.
        System.out.println("su numero de identidad es " + cbg.getDniCliente());

        System.out.println("su numero de cuneta es " + cbg.getNumeroCuenta());

        System.out.println();
    }

    public void extraccionRapida(double rapida) {
//MÃ©todo extraccionRapida: le permitirÃ¡ sacar solo un 20% de su saldo. Validar que el usuario no
//saque mÃ¡s del 20%.

        while (rapida >= (cbg.getSaldoActual() * 0.2)) {

            String restricto = JOptionPane.showInputDialog(null, "estas superando el limite permitido");

            rapida = Double.valueOf(restricto);

        }

        cbg.setSaldoActual(cbg.getSaldoActual() - rapida);

    }

}
