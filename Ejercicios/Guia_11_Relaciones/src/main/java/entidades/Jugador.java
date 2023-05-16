/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia Clase Jugador: esta clase posee los siguientes
 * atributos: id (representa el número del jugador), nombre (Empezara con
 * Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está mojado o
 * no el jugador). El número de jugadores será decidido por el usuario, pero
 * debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. Métodos:
 * • disparo(Revolver r): el método, recibe el revolver de agua y llama a los
 * métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
 * aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
 * atributo mojado pasa a false y el método devuelve true, sino false.
 */
public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        mojado = false;
    }

    /**
     * disparo(Revolver r): el método, recibe el revolver de agua y llama a los
     * métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
     * aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
     * atributo mojado pasa a false y el método devuelve true, sino false
     *
     * @param r
     * @param j
     */
    public void disparo(Revolver r, Jugador j) {
        //System.out.println(r.mojar(r.getPosAgua(), r.getPosActual()));
        j.setMojado(r.mojar(r.getPosAgua(), r.getPosActual()));
        r.siguienteChorro(r);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

}
