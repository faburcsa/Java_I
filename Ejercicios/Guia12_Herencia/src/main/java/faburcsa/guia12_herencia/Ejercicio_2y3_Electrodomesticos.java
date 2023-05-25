/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia12_herencia;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import enumeraciones.Consumo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
 * Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
 * precio final de los dos electrodomésticos.
 */
public class Ejercicio_2y3_Electrodomesticos {

    /**
     * @param args the command line arguments
     *
     *
     */
    public static void main(String[] args) {
//        Lavadora lavarropas = new Lavadora();
//        lavarropas.crearLavadora();
//        lavarropas.precioFinal();
//
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();
//        tv.precioFinal();
//
//        System.out.println(lavarropas);
//        System.out.println(tv);

        // EJERCICIO 3 - Agregando logica
        /**
         * Siguiendo el ejercicio anterior, en el main vamos a crear un
         * ArrayList de Electrodomésticos para guardar 4 electrodomésticos, ya
         * sean lavadoras o televisores, con valores ya asignados. Luego,
         * recorrer este array y ejecutar el método precioFinal() en cada
         * electrodoméstico. Se deberá también mostrar el precio de cada tipo de
         * objeto, es decir, el precio de todos los televisores y el de las
         * lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
         * precio de todos los Electrodomésticos. Por ejemplo, si tenemos una
         * lavadora con un precio de 2000 y un televisor de 5000, el resultado
         * final será de 7000 (2000+5000) para electrodomésticos, 2000 para
         * lavadora y 5000 para televisor.
         *
         * @author Fabian M. Urchueguia
         */
        Televisor tv2 = new Televisor(32, true,1000d, "NEGRO", Consumo.F, 15f);
        Televisor tv3 = new Televisor(70, false,1000d, "ROJO", Consumo.A, 25f);
        Lavadora lavarropas2 = new Lavadora(22f, 1000d, "GRIS", Consumo.C, 40f);
        Lavadora lavarropas3 = new Lavadora(15f, 1000d, "AZUL", Consumo.E, 10f);

        List<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(tv2);
        electrodomesticos.add(tv3);
        electrodomesticos.add(lavarropas2);
        electrodomesticos.add(lavarropas3);

        Double precioTotal = 0d;
        Double precioLavarropas = 0d;
        Double precioTvs = 0d;

        for (Electrodomestico aux : electrodomesticos) {
            System.out.println("Calculando precio para:" + aux.toString());
            aux.precioFinal();
            if (aux instanceof Televisor) {
                //Object object = (Object) aux;
                precioTvs += aux.getPrecio();
            }
            if (aux instanceof Lavadora) {
                //Object object = (Object) aux;
                precioLavarropas += aux.getPrecio();
            }

            precioTotal += aux.getPrecio();
        }
        
        System.out.println("El Precio Total es $" + precioTotal);
        System.out.println("El Precio Total de Lavarropas es $" + precioLavarropas);
        System.out.println("El Precio Total de Televisores es $" + precioTvs);

    }

}
