/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia12_herencia;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * 4. Se plantea desarrollar un programa que nos permita calcular el área y el
 * perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya
 * que este cálculo se va a repetir en las dos formas geométricas, vamos a crear
 * una Interfaz, llamada calculosFormas que tendrá, los dos métodos para
 * calcular el área, el perímetro y el valor de PI como constante. Desarrollar
 * el ejercicio para que las formas implementen los métodos de la interfaz y se
 * calcule el área y el perímetro de los dos. En el main se crearán las formas y
 * se mostrará el resultado final. Área circulo: PI * radio ^ 2 / Perímetro
 * circulo: PI * diámetro. Área rectángulo: base * altura / Perímetro
 * rectángulo: (base + altura) * 2.
 */
public class Ejercicio_4_Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo(100d, 200d);
        Rectangulo r = new Rectangulo(20d, 20d);

        System.out.println("El area del circulo es " + c.calculaArea());
        System.out.println("El Perimetro del circulo es " + c.calculaPerimetro());

        System.out.println("El area del Rectangulo es " + r.calculaArea());
        System.out.println("El Perimetro del Rectangulo es " + r.calculaPerimetro());
    }

}
