/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Clase Juego: esta clase posee los siguientes
 * atributos: Jugadores (conjunto de Jugadores) y Revolver Métodos: •
 */
public class Juego {

    private List<Jugador> jugadores;
    private Revolver revolver;

    /**
     * llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe
     * los jugadores y el revolver para guardarlos en los atributos del juego.
     *
     * @param r
     */
    public void llenarJuego(Revolver r) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> players = new ArrayList();

        System.out.println("Ingrese Cant. Jugadores - 1 al 6 - 6 por defecto");
        int nro = leer.nextInt();
        if (nro >= 6) {
            nro = 6;
        }

        for (int i = 0; i < nro; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            j.setNombre("Jugador" + " " + String.valueOf(j.getId()));
            players.add(j);
        }
//        System.out.println("Ingrese Nombre:");
//        String nombre=leer.nextLine();
        r.llenarRevolver(r);

        this.revolver = r;
        this.jugadores = players;
    }

    /**
     * ronda(): cada ronda consiste en un jugador que se apunta con el revolver
     * de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se
     * moja y se termina el juego, sino se moja, se pasa al siguiente jugador
     * hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del
     * juego, se debe mostrar que jugador se mojó.
     */
    public void ronda() {
        boolean gameOver = true;
        Jugador j = new Jugador();

        do {
            for (int i = 0; i < 6; i++) {
                System.out.print("Ronda " + (i + 1) + " - ");
                //System.out.println(String.valueOf(this.jugadores.size()));
                if ((i + 1) > this.jugadores.size()) {
                    i = 0;
                }
                j = this.jugadores.get(i);
                System.out.println(j.getNombre());
                j.disparo(this.revolver, j);
                //System.out.println(j.isMojado());
                
                if (j.isMojado() == true) {
                    gameOver = false;
                    break;
                }
                //System.out.println("GO " + gameOver);
            }
        } while (gameOver);

        System.out.println(
                "GAME OVER");
        System.out.println(
                "El jugador Mojado fue:");
        System.out.println(j);
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

}
