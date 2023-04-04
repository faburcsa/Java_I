/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.servicios;

import guia_8.entidades.Raices;

/**
 *
 * @author Fabian M. Urchueguia
 *
 */
public class RaicesServicio {

    public double getDiscriminante(Raices r) {
        // Método getDiscriminante(): devuelve el valor del discriminante (double). 
        // El discriminante tiene la siguiente fórmula: (b^2) - 4 * a * c   
        //System.out.println(((Math.pow(r.getB(), 2)) - 4 * r.getA() * r.getC()));
        return ((Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC()));
    }

    public boolean tieneRaices(Raices r) {
        // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
        // que esto ocurra, el discriminante debe ser mayor o igual que 0.
        //System.out.println(getDiscriminante(r) > 0);
        return getDiscriminante(r) > 0;
    }

    public boolean tieneRaiz(Raices r) {
        // *  Método
        // * tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
        // * que esto ocurra, el discriminante debe ser igual que 0.
        //System.out.println(getDiscriminante(r) == 0);
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        // * Método
        // * obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2
        // * posibles soluciones. 
        if (tieneRaices(r)) {
            System.out.println("2 Posibles Soluciones: ");
            
            //(-b ± √((b^2)-(4*a*c))) / (2*a) 
            System.out.println("x1 = "+(-r.getB() + Math.sqrt((getDiscriminante(r)))) / (2 * r.getA()));
            System.out.println("x2 = "+(-r.getB() - Math.sqrt((getDiscriminante(r)))) / (2 * r.getA()));
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }
    }

    public void obtenerRaiz(Raices r) {
        // * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́
        // * true imprime una única raíz. Es en el caso en que se tenga una única solución
        // * posible. 
        if (tieneRaiz(r)) {
            System.out.println("Unica Raiz: ");
            //(-b ± √((b^2)-(4*a*c))) / (2*a) 
            System.out.println("x = "+(-r.getB() + Math.sqrt((getDiscriminante(r)))) / (2 * r.getA()));
        } else {
            System.out.println("La ecuacion no tiene una unica raiz.");
        }
    }

    public void calcular(Raices r) {
        // * Método calcular(): esté método llamará tieneRaices() y a
        // * tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene
        // * nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
        // * que devuelvan nuestros métodos y en caso de no existir solución, se mostrará
        // * un mensaje. 

        // Nota: Fórmula ecuación 2o grado: 
        // (-b±√((b^2)-(4*a*c)))/(2*a) 
        //Solo varía el signo delante de -b
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("La ecuacion no tiene solucion real.");
        }
    }

}
