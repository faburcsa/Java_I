/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;
/**
 *
 * @author Fabian M. Urchueguia Crear una clase Rectángulo que modele
 * rectángulos por medio de un atributo privado base y un atributo privado
 * altura. Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private int base;
    private int altura;

    public void crearRectangulo() {
//  La clase incluirá un método para crear el rectángulo con los datos
//  del Rectángulo dados por el usuario.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Base:");
        this.base = leer.nextInt();
        System.out.println("Ingrese Altura:");
        this.altura = leer.nextInt();
    }

    public int superficie() {
        //También incluirá un método para calcular
        // la superficie del rectángulo
        return base * altura;
    }

    public int perimetro() {
        // Un método para calcular el perímetro del
        // rectángulo.
        return (base + altura) * 2;
    }

    //Se deberán además definir los métodos getters, setters y constructores correspondientes.
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void dibujaRectangulo() {
        //Por último, tendremos un método que dibujará el rectángulo mediante
        //asteriscos usando la base y la altura.
        for (int alto = 0; alto < altura; alto++) {
            for (int bas = 0; bas < base; bas++) {
                if (alto == 0 || bas == 0 || alto == altura - 1 || bas == base - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

}

