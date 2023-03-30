/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Receta {
    private String nombre;
    private String[] ingredientes;

    public Receta(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        System.out.println("Receta "+nombre+" creada");
    }

    public Receta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        int i;
        System.out.println("El nombre es: "+nombre);
        System.out.println("Los ingredientes son: ");
        for (i = 0; i < ingredientes.length; i++) {
            System.out.println((i+1)+"-"+ingredientes[i]);
        }
        
        return "";
    }
    
    
}
