/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Crearemos la clase FechaService, en paquete Servicios, que tenga los
 * siguientes métodos: Si necesiten acá tienen más información en clase Date:
 * Documentacion Oracle
 */
public class FechaService {

    public Date fechaNacimiento() {
        //Método fechaNacimiento que pregunte al usuario día, mes y
        // año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
        // El método debe retornar el objeto Date. Ejemplo fecha:
        // Date fecha = new Date(anio, mes, dia);

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Dia Nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese Mes Nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese Año Nacimiento:");
        int anio = leer.nextInt();

        //Constructor Date es anio -1900 + mes -1 + dia
        return new Date((anio - 1900), (mes - 1), dia);

    }

    public Date fechaActual() {
        //   Método fechaActual que cree un objeto
        // * fecha con el día actual. Para esto usaremos el constructor vacío de la clase
        // * Date. Ejemplo: Date fechaActual = new Date(); El método debe retornar el
        // * objeto Date. 

        return new Date();
    }

    public int diferencia(Date fecha1, Date fecha2) {
        //  Método diferencia que reciba las dos fechas por parámetro
        // * y retorna la diferencia de años entre una y otra (edad del usuario). 
        int dif = fecha1.getYear()-fecha2.getYear();
        System.out.println(dif);
        
        return dif;
    }

}
