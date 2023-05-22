/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ServicioSeguros {

    public static Cliente crearCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese nombre cliente:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese apellido cliente:");
        String apellido = leer.nextLine();
        System.out.println("Ingrese dni cliente:");
        Integer dni = leer.nextInt();
        System.out.println("Ingrese mail cliente:");
        String mail = leer.nextLine();
        System.out.println("Ingrese domicilio cliente:");
        String domicilio = leer.nextLine();
        System.out.println("Ingrese telefono cliente:");
        String telefono = leer.nextLine();
        return new Cliente(nombre, apellido, dni, mail, domicilio, telefono);
    }
}
