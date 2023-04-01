/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import guia_8.entidades.CuentaBancaria;
import guia_8.servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia 
 * 
 * Realizar una clase llamada CuentaBancaria en el
 * paquete Entidades con los siguientes atributos: numeroCuenta(entero),
 * dniCliente(entero largo), saldoActual. Agregar constructor vacío, con
 * parámetros, getters y setters. 
 * 
 * Agregar la clase CuentaBancariaServicio en el
 * paquete Servicios que contenga: Método para crear cuenta pidiéndole los datos
 * al usuario. Método ingresar(double): recibe una cantidad de dinero a ingresar
 * y se le sumará al saldo actual. Método retirar(double): recibe una cantidad
 * de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la
 * cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
 * cuenta en 0. Método extraccionRapida: le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. Método consultarSaldo:
 * permitirá consultar el saldo disponible en la cuenta. Método consultarDatos:
 * permitirá mostrar todos los datos de la cuenta.
 *
 */
public class Ejercicio_1_CtaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se define el Objeto de Servicio Manipulacion de Datos Objeto
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicio cbs=new CuentaBancariaServicio();
        // Se define el Objeto Entidad, creandose con metdo del Servicio.
        //CuentaBancaria cb = cbs.crearCuenta(); // Metodo que Solicita Datos al usuario
        CuentaBancaria cb = cbs.crearCuenta(450429,28950784,1000); // Utilizo el metodo Override con Pasaje de Parametros para Testing Rapido
        // Muestro Informacion del Objeto Entidad Creado (Override del ToString
        System.out.println(cb.toString());
        
        
        
        //Llamamos al metodo ingresar el cual recibe el Objeto a modificar y el monto a sumar
        System.out.println("Ingrese Monto a acreditar:");
        cbs.ingresar(cb, leer.nextDouble());
        System.out.println(cb.toString());
        
        
        
        //Llamamos al metodo retirar el cual recibe el Objeto a modificar y el monto a restar
        System.out.println("Ingrese Monto a retirar:");
        cbs.retirar(cb, leer.nextDouble());
        System.out.println(cb.toString());
        
        
        
        //Llamo metodo Extraccion Rapida se le pasa el objeto
        cbs.extraccionRapida(cb);
        System.out.println(cb.toString());
        
        
        //Llamo metodo consultar Saldo
        cbs.consultarSaldo(cb);
        
        //Llamo metodo consultar Datos
        cbs.consultarDatos(cb);
    }

}
