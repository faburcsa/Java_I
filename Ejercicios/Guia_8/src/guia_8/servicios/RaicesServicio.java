/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.servicios;

/**
 *
 * @author Fabian M. Urchueguia
 *
 */
public class RaicesServicio {

    public double getDiscriminante() {
        // Método getDiscriminante(): devuelve el valor del discriminante (double). 
        // El discriminante tiene la siguiente fórmula: (b^2)-4*a*c    
        return 0;
    }
    
    public boolean tieneRaices(){
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    // que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    return true;
    }

    public boolean tieneRaiz(){
    // *  Método
    // * tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    // * que esto ocurra, el discriminante debe ser igual que 0.
    return true;
    }
    
    public boolean obtenerRaices(){
// * Método
// * obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2
// * posibles soluciones. 

    return true;
    }
    
    public boolean obtenerRaiz(){
    // * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́
    // * true imprime una única raíz. Es en el caso en que se tenga una única solución
    // * posible. 
    return true;
    }
    
    public void calcular(){
    // * Método calcular(): esté método llamará tieneRaices() y a
    // * tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene
    // * nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    // * que devuelvan nuestros métodos y en caso de no existir solución, se mostrará
    // * un mensaje. Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo
    // * varía el signo delante de -b
    
    }

}
