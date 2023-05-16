/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia_11_relaciones;

import entidades.Juego;
import entidades.Revolver;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
 * juego se trata de un número de jugadores, que, con un revolver de agua, el
 * cual posee una sola carga de agua, se dispara y se moja. Las clases por hacer
 * del juego son las siguientes: 
 * Pensar la lógica necesaria para realizar esto,
 * usando los atributos de la clase Juego.
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego game = new Juego();
        Revolver r=new Revolver();
        
        game.llenarJuego(r);
        System.out.println(r);
        System.out.println(game);
        game.ronda();
    }

}
