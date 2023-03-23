/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Declarar una clase llamada Circunferencia que
 * tenga como atributo privado el radio de tipo real. A continuación, se deben
 * crear los siguientes métodos:
 */
public class Circunferencia {

    private float radio;

    public void setRadio(float radio) {
        //Métodos set para el atributo radio de la clase Circunferencia.
        this.radio = radio;
    }

    public Circunferencia(float radio) {
        //Método constructor que inicialice el radio pasado como parámetro.
        this.radio = radio;
    }

    public float getRadio() {
        //Métodos get  para el atributo radio de la clase Circunferencia.
        return radio;
    }

    public void crearCircunferencia() {
        //Método para crearCircunferencia(): que le pide el radio y lo guarda  
        //en el atributo del objeto.
        System.out.println("Ingrese radio:");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        radio = leer.nextFloat();

        this.radio = radio;
    }

    public float area(float radio) {
        //Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        float area;
        area = (float) (Math.PI * Math.pow(radio, 2)); // POW es expotencial
        return area;
    }

    public float perimetro(float radio) {
        //Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
        float perimetro;
        perimetro = (float) (2 * Math.PI * radio);
        return perimetro;
    }

}
