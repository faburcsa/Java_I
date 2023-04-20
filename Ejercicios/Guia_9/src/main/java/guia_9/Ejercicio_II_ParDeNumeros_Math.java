/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_9;

import guia9.entidades.ParDeNumeros;
import guia9.servicios.ParDeNumerosService;

/**
 *
 * @author Fabian M. Urchueguia c1.getFrase()
 */
public class Ejercicio_II_ParDeNumeros_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParDeNumerosService pns = new ParDeNumerosService();
        ParDeNumeros pn = new ParDeNumeros();

        pns.mostrarValores(pn);

        System.out.println("La Potencia es " + pns.calcularPotencia(pn));
        System.out.println("La Raiz es " + pns.calculaRaiz(pn));
        System.out.println("El Numero Mayor es " + pns.devolverMayor(pn));
        
    }

}
