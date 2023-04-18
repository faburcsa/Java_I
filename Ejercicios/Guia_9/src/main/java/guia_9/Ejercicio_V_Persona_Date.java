/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_9;

import guia9.entidades.Persona;
import guia9.servicios.PersonaService;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Ejercicio_V_Persona_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PersonaService ps = new PersonaService();
        Persona p = PersonaService.crearPersona();
        
        PersonaService.mostrarPersona(p);
        PersonaService.calcularEdadFull(p);
    }
    
}
