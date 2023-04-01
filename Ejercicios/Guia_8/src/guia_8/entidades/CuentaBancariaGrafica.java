/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class CuentaBancariaGrafica {
    //Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//MÃ©todo para crear cuenta pidiÃ©ndole los datos al usuario.
//MÃ©todo ingresar(double): recibe una cantidad de dinero a ingresar y se le sumarÃ¡ al saldo actual.
//MÃ©todo retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
//Si la cuenta no tiene la cantidad de dinero a retirar se retirarÃ¡ el mÃ¡ximo posible hasta dejar la
//cuenta en 0.
//MÃ©todo extraccionRapida: le permitirÃ¡ sacar solo un 20% de su saldo. Validar que el usuario no
//saque mÃ¡s del 20%.
//MÃ©todo consultarSaldo: permitirÃ¡ consultar el saldo disponible en la cuenta.
//MÃ©todo consultarDatos: permitirÃ¡ mostrar todos los datos de la cuenta.

   
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual ;

    public CuentaBancariaGrafica() {
    }

    public CuentaBancariaGrafica(int numeroCuenta, long dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
         this.saldoActual = saldoActual  ;
    }
    

}

