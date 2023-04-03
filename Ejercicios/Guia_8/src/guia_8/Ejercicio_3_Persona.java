/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import guia_8.entidades.Persona;
import guia_8.servicios.PersonaServicio;
import java.util.ArrayList;

/**
 *
 * @author Fabian M. Urchueguia Realizar una clase llamada Persona en el paquete
 * de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’
 * para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir
 * algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
 *
 *
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. Metodo crearPersona(): el método crear persona, le pide
 * los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
 *
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *
 *
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * Persona con distintos valores, a continuación, llamaremos todos los métodos
 * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 *
 * Por último, guardaremos los resultados de los métodos calcularIMC y
 * esMayorDeEdad en distintas variables(arrays), para después calcular un
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
 * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
 * cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos
 * métodos adicionales.
 *
 */
public class Ejercicio_3_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vIMC[] = new int[4];
        boolean vMayor[] = new boolean[4];
        int i = 0;

        PersonaServicio ps = new PersonaServicio();
        //Persona p = new Persona();
//        Persona p1 = new Persona();
//        Persona p2 = new Persona();
//        Persona p3 = new Persona();
//        Persona p4 = new Persona();

        // Creo una Lista Personas de Objetos tipo Persona
        ArrayList<Persona> Personas;
        // Inicializo la Lista
        Personas = new ArrayList();

        //Creo una persona con el contructor qu pregunta datos
        //p=ps.crearPersona();
        
        // Creo las personas con el contructor con Parametros
//        p1=ps.crearPersona("Fabian Urchueguia",41,'M', (float)77.5, (float)1.79);
//        p2=ps.crearPersona("Candela Almada",39,'F', (float)59, (float)1.55);
//        p3=ps.crearPersona("Lara Urchueguia",19,'F', (float)77.5, (float)1.62);
//        p4=ps.crearPersona("Joaquin Urchueguia",14,'M', (float)49.5, (float)1.75);

        // Creo y Agrego las personas a la lista directamente desde la clase de servicios
        Personas.add(ps.crearPersona("Fabian Urchueguia", 41, 'M', (float) 77.5, (float) 1.79));
        Personas.add(ps.crearPersona("Candela Almada", 39, 'F', (float) 59, (float) 1.55));
        Personas.add(ps.crearPersona("Lara Urchueguia", 19, 'F', (float) 77.5, (float) 1.62));
        Personas.add(ps.crearPersona("Joaquin Urchueguia", 14, 'M', (float) 49.5, (float) 1.75));

        //System.out.println(ps.esMayorDeEdad(p));
        //System.out.println(ps.calcularIMC(p));
        
        
        // Recorro la lista y por cada persona hago lo solicitado
        
        
        // * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
        // * Persona con distintos valores, a continuación, llamaremos todos los métodos
        // * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
        // * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        // * persona es mayor de edad.
        for (Persona ptemp : Personas) {
            System.out.print("La Persona " + ptemp.getNombre() + ", ");

            if (ps.esMayorDeEdad(ptemp)) {
                System.out.print("Es Mayor de Edad, ");
            } else {
                System.out.print("Es Menor de Edad, ");
            }

            switch (ps.calcularIMC(ptemp)) {
                case -1:
                    System.out.println("Esta por debajo del peso ideal.");
                    break;
                case 0:
                    System.out.println("Esta en su peso ideal.");
                    break;
                case 1:
                    System.out.println("Posee Sobrepeso.");
                    break;
            }

            // * Por último, guardaremos los resultados de los métodos calcularIMC y
            // * esMayorDeEdad en distintas variables(arrays), para después calcular un
            // * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
            // * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
            // * cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos
            // * métodos adicionales.
            vMayor[i] = ps.esMayorDeEdad(ptemp);
            vIMC[i] = ps.calcularIMC(ptemp);

            i += 1;

            //System.out.println(ptemp.toString());
        }
        
        porcEdad(vMayor);
        porcIMC(vIMC);

    }

    public static void porcEdad(boolean[] a) {
        int countMayor = 0, countMenor = 0;
        for (boolean r : a) {
            if (r) {
                countMayor += 1;
            } else {
                countMenor += 1;
            }
        }

        System.out.println("");
        System.out.println("FUNCION PORCENTAJE EDADES:");
        System.out.println("El porcentaje de Mayores es: " + (100 * countMayor / 4 ) + "%.");
        System.out.println("El porcentaje de Menores es: " + (100 * countMenor / 4 ) + "%.");
    }
    
    
    public static void porcIMC(int[] imc) {
        int countMayor = 0, countMenor = 0, countOK=0;
        for (int r : imc) {
            if (r == 1) {
                countMayor += 1;
            } else {
                if (r == -1) {
                    countMenor += 1;
                } else {
                    countOK += 1 ;
                }
                
            }
        }

        System.out.println("");
        System.out.println("FUNCION PORCENTAJE PESO:");
        System.out.println("El porcentaje de Peso OK es: " + (100 * countOK / 4 ) + "%.");
        System.out.println("El porcentaje de Peso Bajo es: " + (100 * countMenor / 4 ) + "%.");
        System.out.println("El porcentaje de SobrePeso es: " + (100 * countMayor / 4 ) + "%.");
    }

}
