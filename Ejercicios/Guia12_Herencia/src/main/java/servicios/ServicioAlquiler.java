/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.Yate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ServicioAlquiler {

    public Alquiler creaAlquiler(List<Barco> barcos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese DNI cliente:");
        int dni = leer.nextInt();

        System.out.println("Ingrese Nombre Cliente:");
        String nombreCliente = leer.next();

        System.out.println("Seleccione Matricula de un barco:");
        for (Barco aux : barcos) {
            System.out.println(aux.toString());
        }

        String opcion = leer.next();
        Barco barcoSeleccion = new Barco();
        for (Barco aux : barcos) {
            if (opcion.equalsIgnoreCase(aux.getMatricula())) {
                barcoSeleccion = aux;
            }
        }

        System.out.println("Barco Seleccionado: " + barcoSeleccion.toString());

        System.out.println("Ingrese Posicion Amarre:");
        int posAmarre = leer.nextInt();

        System.out.println("Ingrese Fecha Ingreso: (yyyyMMdd)");
        String input = leer.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate fechaAlquiler = LocalDate.parse(input, formatter);

        System.out.println("Ingrese Fecha Devolucion: (yyyyMMdd)");
        input = leer.next();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate fechaDevo = LocalDate.parse(input, formatter2);

        return new Alquiler(dni, nombreCliente, fechaAlquiler, fechaDevo, posAmarre, barcoSeleccion);
    }

    public Double precioFinal(Alquiler a) {
        /**
         * Un alquiler se calcula multiplicando el número de días de ocupación
         * (calculado con la fecha de alquiler y devolución), por un valor
         * módulo de cada barco (obtenido simplemente multiplicando por 10 los
         * metros de eslora).
         *
         * En los barcos de tipo especial el módulo de cada barco se calcula
         * sacando el módulo normal y sumándole el atributo particular de cada
         * barco.
         *
         * En los veleros se suma el número de mástiles, en los barcos a motor
         * se le suma la potencia en CV y en los yates se suma la potencia en CV
         * y el número de camarotes.
         */
        Double modulo = 0d;

        long diasDiferencia = a.getFechaAlquiler().until(a.getFechaDevolucion()).getDays();
        System.out.println("Cant. de Dias: " + diasDiferencia);

        modulo += 10 * a.getBarcoSeleccion().getEsloraMts();

        //En los veleros se suma el número de mástiles,
        if (a.getBarcoSeleccion() instanceof Velero) {
            Velero aux = (Velero) a.getBarcoSeleccion();
            modulo += aux.getNroMastiles();
        }

        //en los barcos a motor se le suma la potencia en CV
        if (a.getBarcoSeleccion() instanceof BarcoMotor) {
            BarcoMotor aux = (BarcoMotor) a.getBarcoSeleccion();
            modulo += aux.getCV();
        }

         //en los yates se suma la potencia en CV y el número de camarotes.
        if (a.getBarcoSeleccion() instanceof Yate) {
            Yate aux = (Yate) a.getBarcoSeleccion();
            modulo += aux.getCV();
            modulo += aux.getNroCamarotes();
        }
        return modulo;
    }

}
