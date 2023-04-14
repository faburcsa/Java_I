/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.servicios;

import guia9.entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Crear una clase PersonaService, en el paquete
 * servicio, con los siguientes métodos:
 */
public class PersonaService {

    public Persona crearPersona() {
        //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Nombre Persona:");
        String Nombre = leer.next();
        System.out.println("Ingrese Dia Nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese Mes Nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese Año Nacimiento:");
        int anio = leer.nextInt();

        Date fechaNac = new Date(anio - 1900, mes - 1, dia);
        return new Persona(Nombre, fechaNac);
    }

    public int calcularEdad(Date fechaNac) {
        // * Método calcularEdad que calcule la edad del usuario utilizando el atributo de
        // * fecha de nacimiento y la fecha actual.
        Date fechaNow = new Date();
        int dif = Math.abs(fechaNac.getYear() - fechaNow.getYear());
        //System.out.println(dif);

        return dif;
    }

    public boolean menorQue(Persona p, int edad) {
        // * Método menorQue recibe como parámetro una Persona y una edad. Retorna true si
        // * la persona es menor que la edad consultada o false en caso contrario. 

        return p.getFechNac().getYear() < edad;
    }

    public void mostrarPersona(Persona p) {
        //Método mostrarPersona que muestra la información de la persona deseada.
        System.out.println("Nombre : " + p.getNombre());
        System.out.println("Fecha Nacimiento: " + p.getFechNac());
        System.out.println("Edad Actual: " + calcularEdad(p.getFechNac()));

        //Equipo 189 - Nacho
        // Crear un formato de fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        // Formatear la fecha
        String fechaFormateada = formato.format(p.getFechNac());
        // Mostrar la fecha formateada
        System.out.println("Fecha formateada: " + fechaFormateada);
        //Equipo 189 - Nacho

        System.out.println(p.getFechNac().getDate()+ "/" + (p.getFechNac().getMonth() + 1) + "/" + p.getFechNac().getYear());

        if (menorQue(p, 18)) {
            System.out.println("Es Menor de Edad.");
        } else {
            System.out.println("Es Mayor de Edad.");
        }
    }
}
