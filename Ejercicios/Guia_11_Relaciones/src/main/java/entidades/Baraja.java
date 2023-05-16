/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Baraja {

    private Integer cant = 40;
    private List<Carta> cartas;
    private Integer disponibles = 40;
    private List<Carta> cartasEntregadasFull = new ArrayList();

    /**
     * barajar(): cambia de posición todas las cartas aleatoriamente.
     */
    public void crearBaraja() {
        ArrayList<Carta> cards = new ArrayList();

        for (Palos palo : Palos.values()) {  // Para cada uno de los palos enum
            for (int i = 0; i < 12; i++) {  // 12 cartas
                if ((i + 1) != 8 && (i + 1) != 9) {  // omito 8 y 9
                    Carta card = new Carta((i + 1), palo); // creo la carta
                    cards.add(card); // Agrego a la baraja
                }

            }

        }
        System.out.println(String.valueOf("Cantidad de cartas: " + cards.size()));
        this.cartas = cards;
    }

    public void barajar() {
        System.out.println("BARAJAR");
        Collections.shuffle(cartas);
    }

    /**
     * • siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas.
     *
     * @return
     */
    public Carta siguienteCarta() {
        Iterator<Carta> itCarta = this.cartas.iterator();

        if (itCarta.hasNext()) {
            return itCarta.next();
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
    }

    // cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles() {
        return cartas.size();
    }

//darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public List<Carta> darCartas(int cantidad) {  // Devuelve las cartas entregadas
        if (cartas.size() >= cantidad) {  // si lo pedido es mayor a la cant. baraja actual
            List<Carta> cartasEntregadas = new ArrayList(); // Temporal
            for (int i = 0; i < cantidad; i++) {
                Carta carta = cartas.remove(0);  // el remove tb asigna a un objeto la actual
                cartasEntregadas.add(carta);  // La agrego al temporal
                this.cartasEntregadasFull.add(carta); // la agrego al a global de entregadas
            }
            System.out.println("SUS CARTAS:");
            System.out.println(cartasEntregadas.toString());
            return cartasEntregadas;
        } else {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }
    }

    /**
     * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
     * salido ninguna indicárselo al usuario
     */
    public void cartasMonton() {
        System.out.println("CARTAS ENTREGADAS:");
        if (!cartasEntregadasFull.isEmpty()) {
            System.out.println(cartasEntregadasFull.toString());
        } else {
            System.out.println("Ninguna carta fue entregada aun.");
        }
    }

    /**
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
     * saca una carta y luego se llama al método, este no mostrara esa primera
     * carta.
     */
    public void mostrarBaraja() {
        System.out.println("MOSTRAR BARAJA:");
        if (!cartas.isEmpty()) {
            System.out.println(cartas.toString());
        } else {
            System.out.println("Ya No quedan Cartas");
        }
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cant=" + cant + ", cartas=" + cartas + '}';
    }

}
