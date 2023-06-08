/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class DamageException extends Exception{

    /**
     * Creates a new instance of <code>DamageException</code> without detail
     * message.
     */
    public DamageException() {
    }

    /**
     * Constructs an instance of <code>DamageException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DamageException(String msg) {
        super(msg);
    }
}
