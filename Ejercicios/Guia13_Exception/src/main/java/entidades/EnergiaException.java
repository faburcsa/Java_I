/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class EnergiaException extends Exception{

    /**
     * Creates a new instance of <code>EnergiaException</code> without detail
     * message.
     */
    public EnergiaException() {
    }

    /**
     * Constructs an instance of <code>EnergiaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EnergiaException(String msg) {
        super(msg);
    }
}
