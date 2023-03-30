/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo_cocina;

import entidad.Cocina;

/**
 *
 * @author Fabian M. Urchueguia
 * Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, 
 * crea métodos para agregar nuevas recetas a la lista, para buscar una receta 
 * por nombre y para obtener la lista de recetas que se pueden preparar con los 
 * ingredientes disponibles en la cocina.
 */
public class Guia_7_POO_Cocina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocina c1=new Cocina();
        int cantSolicitaReceta=2; // Cantidad de recetas a acargar en la prueba
        
        for (int i = 0; i < cantSolicitaReceta; i++) {
            c1.crearRecetas();
        }
        
        c1.buscarRecetas();
        
        //c1.buscarRecetasIngredientes();
        
    }
    
}
