/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.servicios;

import guia_8.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * Agregar la clase CuentaBancariaServicio en el
 * paquete Servicios que contenga: 
 * 
 * Método para crear cuenta pidiéndole los datos
 * al usuario. 
 * 
 * Método ingresar(double): recibe una cantidad de dinero a ingresar
 * y se le sumará al saldo actual. 
 * 
 * Método retirar(double): recibe una cantidad
 * de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la
 * cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
 * cuenta en 0. 
 * 
 * Método extraccionRapida: le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. 
 * 
 * Método consultarSaldo:
 * permitirá consultar el saldo disponible en la cuenta. 
 * 
 * Método consultarDatos:
 * permitirá mostrar todos los datos de la cuenta.
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        // * Método para crear cuenta pidiéndole los datos
        // * al usuario. 
        System.out.println("Ingrese Nro. de Cuenta:");
        int nroCta = leer.nextInt();
        
        System.out.println("Ingrese DNI:");
        long dni = leer.nextLong();
        
        System.out.println("Ingrese Saldo Actual:");
        double saldo = leer.nextDouble();
        
        // Devuelvo el Objeto crado con el Constructor por parametros de la entidad
        return new CuentaBancaria(nroCta, dni, saldo);
                
    }
    
    public CuentaBancaria crearCuenta(int nroCta,long dni,double saldo){
        //Metodo Override, crea Objeto con datos
        // Devuelvo el Objeto crado con el Constructor por parametros de la entidad
        return new CuentaBancaria(nroCta, dni, saldo);      
    }
    
    public void ingresar(CuentaBancaria cb,double money){
        //Método ingresar(double): recibe una cantidad de dinero a ingresar
        //y se le sumará al saldo actual. 
        //FMU - Se le pasa el objeto creado y el monto a ingresar
        
        double saldo=cb.getSaldoActual() + money;
        cb.setSaldoActual(saldo);
    }
    
    public void retirar(CuentaBancaria cb, double money){
         //Método retirar(double): recibe una cantidad
        // de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la
        // cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
        // cuenta en 0. 
        double saldo=cb.getSaldoActual();
        if ( (saldo - money) > 0 ) {
            cb.setSaldoActual(saldo - money);
        } else {
            if ((saldo - money) == 0) {
                System.out.println("No Posee saldo. Imposible hacer un retiro.");
            } else {
            System.out.println("No posee Saldo suficiente para esta Operacion");
            System.out.println("Saldo Actual $"+ saldo + " - Saldo que intenta retirar $" + money);
            System.out.println("Se le entregaran el maximo posble $" + saldo);
            cb.setSaldoActual(0);
            }
        }
    }
    
    public void extraccionRapida(CuentaBancaria cb){
        // * Método extraccionRapida: le permitirá sacar solo un 20% de su
        // * saldo. Validar que el usuario no saque más del 20%. 
        double saldo = cb.getSaldoActual();
        double limiteExtraccion= saldo * 20 / 100;
        System.out.println("Desea retirar el 20% de su saldo?");
        System.out.println("Saldo Actual $"+saldo);
        System.out.println("Retira $"+limiteExtraccion+"?");
        System.out.println("S/N?");
        if ( leer.nextLine().substring(0, 1).equalsIgnoreCase("S")) {
            System.out.println("Se retiran $"+limiteExtraccion);
            cb.setSaldoActual(saldo - limiteExtraccion);
        } else {
            System.out.println("Operacion Cancelada!!!");
        }
    }
    
    public double consultarSaldo(CuentaBancaria cb){
        // * Método consultarSaldo:
        // * permitirá consultar el saldo disponible en la cuenta. 
        double saldo = cb.getSaldoActual();
        System.out.println("CONSULTA DE SALDO");
        System.out.println("Saldo Actual $" + saldo);
        
        return saldo;
    }
    
    public void consultarDatos(CuentaBancaria cb){
//         * Método consultarDatos:
//         * permitirá mostrar todos los datos de la cuenta.
        System.out.println("DATOS de la cuenta Numero: " + cb.getNumeroCuenta());
        System.out.println("Nro. DNI: " + cb.getDniCliente());
        System.out.println("Saldo Actual $" + cb.getSaldoActual());
    }
}
