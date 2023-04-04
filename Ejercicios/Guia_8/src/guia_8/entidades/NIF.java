/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.entidades;

/**
 *
 * @author Fabian M. Urchueguia
 *  * Crear una clase NIF que se usará para mantener DNIs con 
 * su correspondiente letra (NIF). Los atributos serán el número de DNI (entero 
 * largo) y la letra (String o char) que le corresponde. 
 */
public class NIF {
    private char NIF;
    private long dni;

    public NIF() {
    }

    public NIF(long dni) {
        this.dni = dni;
        
    }

    public char getNIF() {
        return NIF;
    }

    public void setNIF(char NIF) {
        this.NIF = NIF;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    
}
