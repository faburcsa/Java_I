/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_EJ01_Guia;

import Entidad.Persona;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class POOEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona p1=new Persona();
        Persona p2=new Persona("Fabian Urchueguia");
        
        p1.setDni(28950784);
        p1.setNombre("Fabian Urchueguia");
        
        p2.setNombre("Joaquin Urchueguia");
        
        System.out.println(p1.getNombre()+" DNI: "+p1.getDni());
        System.out.println(p2.getNombre()+" DNI: "+p2.getDni());
    }
    
}
