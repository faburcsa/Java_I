/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import guia_8.entidades.Raices;
import guia_8.servicios.RaicesServicio;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor.
 *
 *
 * Luego, en RaicesServicio las operaciones que se podrán realizar son las
 * siguientes: Método getDiscriminante(): devuelve el valor del discriminante
 * (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c Método
 * tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
 * que esto ocurra, el discriminante debe ser mayor o igual que 0. Método
 * tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
 * que esto ocurra, el discriminante debe ser igual que 0. Método
 * obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
 * posibles soluciones. Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́
 * true imprime una única raíz. Es en el caso en que se tenga una única solución
 * posible. Método calcular(): esté método llamará tieneRaices() y a
 * tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene
 * nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
 * que devuelvan nuestros métodos y en caso de no existir solución, se mostrará
 * un mensaje. Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo
 * varía el signo delante de -b
 *
 *
 */
public class Ejercicio_Extra_1_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();

        //Dos resultados
        System.out.println("Test 1");
        Raices r = new Raices(1, 6, 2);
        rs.calcular(r);

        //Unico Resultado
        System.out.println("");
        System.out.println("Test 2");
        Raices r2 = new Raices(2, 4, 2);
        rs.calcular(r2);

        //Sin Resultado      
        System.out.println("");
        System.out.println("Test 3");
        Raices r3 = new Raices(1, 2, 3);
        rs.calcular(r3);

    }

}
