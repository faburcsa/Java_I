/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente.
 *
 *
 * Métodos: • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios. • mojar(): devuelve true
 * si la posición del agua coincide con la posición actual • siguienteChorro():
 * cambia a la siguiente posición del tambor • toString(): muestra información
 * del revolver (posición actual y donde está el agua)
 */
public class Revolver {

    private Integer posActual;
    private Integer posAgua;

    /**
     * llenarRevolver(): le pone los valores de posición actual y de posición
     * del agua. Los valores deben ser aleatorios.
     *
     * @param r
     */
    public void llenarRevolver(Revolver r) {
        r.setPosActual((int) (Math.random() * 6) + 1);
        r.setPosAgua((int) (Math.random() * 6) + 1);
    }

    /**
     * mojar(): devuelve true si la posición del agua coincide con la posición
     * actual
     *
     * @param pos1 Posicion Agua
     * @param pos2 Posicion Actual
     * @return
     */
    public boolean mojar(int pos1, int pos2) {
        return pos1 == pos2;
    }

    /**
     * • siguienteChorro(): cambia a la siguiente posición del tambor
     *
     * @param r
     */
    public void siguienteChorro(Revolver r) {
        if (r.getPosActual() == 6) {
            r.setPosActual(1);
        } else {
            r.setPosActual(r.getPosActual() + 1);
        }
        
    }

    public Revolver() {
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

}
