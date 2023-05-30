/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia12_herencia;

import entidades.Alquiler;
import entidades.BarcoMotor;
import entidades.Barco;
import entidades.Velero;
import entidades.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicios.ServicioAlquiler;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Extra_1_Barcos {

    /**
     * @param args the command line arguments
     *
     * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
     * Alquiler se guarda: el nombre, documento del cliente, la fecha de
     * alquiler, fecha de devolución, la posición del amarre y el barco que lo
     * ocupará. Un Barco se caracteriza por: su matrícula, su eslora en metros y
     * año de fabricación. Sin embargo, se pretende diferenciar la información
     * de algunos tipos de barcos especiales: • Número de mástiles para veleros.
     * • Potencia en CV para barcos a motor. • Potencia en CV y número de
     * camarotes para yates de lujo. Un alquiler se calcula multiplicando el
     * número de días de ocupación (calculado con la fecha de alquiler y
     * devolución), por un valor módulo de cada barco (obtenido simplemente
     * multiplicando por 10 los metros de eslora). En los barcos de tipo
     * especial el módulo de cada barco se calcula sacando el módulo normal y
     * sumándole el atributo particular de cada barco. En los veleros se suma el
     * número de mástiles, en los barcos a motor se le suma la potencia en CV y
     * en los yates se suma la potencia en CV y el número de camarotes.
     *
     *
     * Utilizando la herencia de forma apropiada, deberemos programar en Java,
     * las clases y los métodos necesarios que permitan al usuario elegir el
     * barco que quiera alquilar y mostrarle el precio final de su alquiler.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Creo Barcos para seleccionar
        Barco barcoMotor1 = new BarcoMotor(100, "NVF888", 23.5f, (LocalDate.of(2020, 5, 29)));
        Barco velero1 = new Velero(6, "HIP780", 22.4f, (LocalDate.of(2010, 3, 15)));
        Barco yate1 = new Yate(5, 200, "JPH780", 600f, LocalDate.of(2013, 2, 22));

        // Creo Array de Barcos para elegir
        List<Barco> barcos = new ArrayList();

        barcos.add(yate1);
        barcos.add(velero1);
        barcos.add(barcoMotor1);

        
        //Creo un alquiler y muestro el modulo final
        ServicioAlquiler servAlquila = new ServicioAlquiler();
        Alquiler a1 = servAlquila.creaAlquiler(barcos);

        System.out.println(a1.toString());
        System.out.println("El modulo corresondiente es $ " + servAlquila.precioFinal(a1));

        
        //Creo otro alquiler y muestro el modulo final
        Alquiler a2 = servAlquila.creaAlquiler(barcos);

        System.out.println(a2.toString());
        System.out.println("El modulo correspondiente es $ " + servAlquila.precioFinal(a2));
    }
}
