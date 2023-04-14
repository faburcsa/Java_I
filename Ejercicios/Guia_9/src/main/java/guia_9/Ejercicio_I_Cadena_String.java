/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package guia_9;

import guia9.entidades.Cadena;
import guia9.servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia 
 * 
 *
 *
 */
public class Ejercicio_I_Cadena_String {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs=new CadenaServicio();
        

        Cadena c1=cs.crearCadena();
        
        System.out.println(c1);
        
        System.out.println("Cantidad de Vocales " + cs.mostrarVocales(c1));
        
        cs.invertirFrase(c1);
        
        cs.vecesRepetido("a", c1);
        
        System.out.println("Ingrese Otra Frase:");
        String frase2=leer.next();
        
        if (cs.compararLongitud(frase2, c1)) {
            System.out.println("Poseen Misma Longitud");
        }
        
        cs.unirFrases(frase2, c1);
        
        cs.reemplazar("$", c1);
        
        System.out.println("Ingrese Letra a Verificar:");
        String letra=leer.next();
        if (cs.contiene(letra, c1)) {
            System.out.println("La Frase posee la letra "+letra);
        }
    }
}
