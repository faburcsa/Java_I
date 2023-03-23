/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Crear una clase llamada Operacion que tenga como
 * atributos privados numero1 y numero2. A continuación, se deben crear los
 * siguientes métodos:
 *
 */
public class Operacion {

    private int numero1, numero2;

    public Operacion(int numero1, int numero2) {
        //Método constructor con todos los atributos pasados por parámetro.
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        //Método constructor sin los atributos pasados por parámetro.
    }

    //Métodos get y set. 
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        //Método para crearOperacion(): que le pide al usuario los
        //dos números y los guarda en los atributos del objeto

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Numero 1: ");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese Numero 2: ");
        this.numero2 = leer.nextInt();
    }

    public int sumar() {
        //Método sumar(): calcular la suma de los números y devolver el
        //resultado al main 
        return numero1 + numero2;
    }

    public int restar() {
        //Método restar(): calcular la resta de los números y devolver el
        //resultado al main 
        return numero1 - numero2;
    }

    public int multiplicar() {
// Método multiplicar(): primero valida que no se haga una multiplicación
// * por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le
// * informa al usuario el error. Si no, se hace la multiplicación y se devuelve
// * el resultado al main 
        if (numero2 == 0) {
            System.out.println("Error, multiplicacion por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    
    public float dividir(){
// * Método dividir(): primero valida que no se haga una división por cero, si
// * fuera a pasar una división por cero, el método devuelve 0 y se le informa al
// * usuario el error se le informa al usuario. Si no, se hace la división y se
// * devuelve el resultado al main.
        if (numero2 == 0) {
            System.out.println("Error, division por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

}
