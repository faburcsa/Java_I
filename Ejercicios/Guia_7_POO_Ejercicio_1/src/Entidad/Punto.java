/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia

 Definir una clase llamada Punto que contendrá las coordenadas de dos puntos,
 sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.

 Generar un objeto puntos usando un método crearPuntos() que le pide al
 usuario los dos números y los ingresa en los atributos del objeto. Después, a
 través de otro método calcular y devolver la distancia que existe entre los
 dos puntos que existen en la clase Punto. Para conocer como calcular la
 distancia entre dos puntos consulte el siguiente link:
 http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 *
 */
public class Punto {

    private double x1, x2, y1, y2;

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese coordenada punto 1 - X1: ");
        x1 = leer.nextDouble();
        System.out.print("Ingrese coordenada punto 1 - Y1: ");
        y1 = leer.nextDouble();
        System.out.print("Ingrese coordenada punto 2 -  X2: ");
        x2 = leer.nextDouble();
        System.out.print("Ingrese coordenada punto 2 - Y2: ");
        y2 = leer.nextDouble();

    }

    public double distancia() {
        //d(P1,P2)=sqrt((x2-x1)exp2 + (y2-y1)exp2)
        double distancia;
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2));
        return distancia;
    }

    @Override
    public String toString() {
        return "Punto{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }

    public Punto() {
    }

    public Punto(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
}
