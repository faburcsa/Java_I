/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia12_herencia;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import enumeraciones.TipoPoli;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: • Método
 * calcularSuperficie(): calcula la superficie del edificio. • Método
 * calcularVolumen(): calcula el volumen del edifico. Estos métodos serán
 * abstractos y los implementarán las siguientes clases: • Clase Polideportivo
 * con su nombre y tipo de instalación que puede ser Techado o Abierto, esta
 * clase implementará los dos métodos abstractos y los atributos del padre. •
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre. De esta clase nos interesa
 * saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá
 * cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método
 * cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas
 * en todo el edificio.
 *
 */
public class Extra_2_Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Por último, en el main vamos a crear un ArrayList de tipo Edificio.
         * El ArrayList debe contener dos polideportivos y dos edificios de
         * oficinas.
         */
        List<Edificio> edificios = new ArrayList();
        EdificioDeOficinas eo1 = new EdificioDeOficinas(10, 5, 3, 10f, 2f, 3.5f);
        EdificioDeOficinas eo2 = new EdificioDeOficinas(1, 10, 2, 10f, 2f, 2f);
        Polideportivo p1 = new Polideportivo("Coocon", TipoPoli.ABIERTO, 10f, 10f, 10f);
        Polideportivo p2 = new Polideportivo("Universitario", TipoPoli.TECHADO, 10f, 10f, 10f);

        edificios.add(eo1);
        edificios.add(eo2);
        edificios.add(p1);
        edificios.add(p2);

        /**
         * Luego, recorrer este array y ejecutar los métodos calcularSuperficie
         * y calcularVolumen en cada Edificio.
         */
        int cantTechados = 0;
        int cantAbiertos = 0;
        for (Edificio aux : edificios) {
            System.out.println(aux.toString());
            
            System.out.println("La Superficie es de " + aux.calcularSuperficie());
            System.out.println("El Volumen es de " + aux.calcularVolumen());

            if (aux instanceof Polideportivo) {
                Polideportivo pAux = (Polideportivo) aux;
                System.out.print("Polideportivo: " + pAux.getNombre() + " es del tipo ");
                if (pAux.getTipo() == TipoPoli.ABIERTO) {
                    System.out.println("ABIERTO");
                    cantAbiertos += 1;
                } else {
                    System.out.println("TECHADO");
                    cantTechados += 1;
                }
            }
            
            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas pEOfi=(EdificioDeOficinas) aux;
                pEOfi.cantPersonas();
                
            }
            System.out.println(" ");
        }
        /**
         * Además de esto, para la clase Polideportivo nos interesa saber
         * cuántos polideportivos son techados y cuantos abiertos.
         */

        System.out.println("Cantidad de Polideportivos Techados: " + cantTechados);
        System.out.println("Cantidad de Polideportivos Abiertos: " + cantAbiertos);
        /**
         *
         * Y para la clase EdificioDeOficinas deberemos llamar al método
         * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
         */
        
        
    }

}
