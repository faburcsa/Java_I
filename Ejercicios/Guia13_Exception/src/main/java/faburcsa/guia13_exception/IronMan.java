/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia13_exception;

import entidades.Armadura;
import entidades.DamageException;
import entidades.EnergiaException;
import servicios.Jarvis;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class IronMan {

    /**
     * @param args the command line arguments
     * @throws entidades.EnergiaException
     * @throws entidades.DamageException
     */
    public static void main(String[] args) throws EnergiaException, DamageException {
        //Crear Armadura
        Armadura ironMan = Jarvis.crearArmadura();

        Jarvis.estadoBateria(ironMan);
        Jarvis.infoReactor(ironMan);

        System.out.println(ironMan.toString());

        System.out.println("Caminar 20 Minutos");
        ironMan.caminar(20);
        Jarvis.estadoBateria(ironMan);

        System.out.println("Correr 2000 Minutos");
        ironMan.correr(2000);
        Jarvis.estadoBateria(ironMan);

        Jarvis.estadoBateria(ironMan);

        System.out.println("Volar 2 Minutos");
        ironMan.volar(2);
        Jarvis.estadoBateria(ironMan);

        System.out.println("Disparar 2 minutos");
        ironMan.guanteDisparo(2);
        Jarvis.estadoBateria(ironMan);

        System.out.println("Mensaje Consola");
        ironMan.escribirConsola();
        Jarvis.estadoBateria(ironMan);
    }

}
