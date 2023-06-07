/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ServicioPersona {

    public static void asignaPerro(Persona p, ArrayList<Perro> pe, String nombre) {
        ArrayList<Perro> perrosAdoptado = p.getPerros();
        //System.out.println(perrosAdoptado.toString());

        Perro perroElegido = null;
        for (Perro perro : pe) {
            if (perro.getNombre().equalsIgnoreCase(nombre) && !perro.isIsAdoptado()) {
                perroElegido = perro;
                perrosAdoptado.add(perroElegido);
                break;
            }
        }

        if (perroElegido != null) {
            p.setPerros(perrosAdoptado);
            perroElegido.setIsAdoptado(true);
            System.out.println(p.getNombre() + " adoptó a " + perroElegido.getNombre());
        } else {
            System.out.println("El perro no está disponible para adopción.");
        }
    }
}
