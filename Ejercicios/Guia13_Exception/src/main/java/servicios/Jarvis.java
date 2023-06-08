/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Armadura;
import entidades.DispositivoArmadura;
import enumeraciones.Rockwell;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Jarvis {

    public static int estadoInicialEnergiaGenerador;

    /**
     *
     * @return
     */
    public static Armadura crearArmadura() {
        DispositivoArmadura botaL = new DispositivoArmadura(100, 2);
        DispositivoArmadura botaR = new DispositivoArmadura(100, 2);
        DispositivoArmadura guanteL = new DispositivoArmadura(100, 1);
        DispositivoArmadura guanteR = new DispositivoArmadura(100, 1);
        DispositivoArmadura consola = new DispositivoArmadura(100, 1);
        DispositivoArmadura sintetizador = new DispositivoArmadura(100, 5);
        Armadura ironMan = new Armadura("Rojo", "Amarillo", Rockwell.HRA, 100, botaL, botaR, guanteL, guanteR, consola, sintetizador);

        estadoInicialEnergiaGenerador = ironMan.getNivelEnergiaGenerador();

        return ironMan;
    }

    /*
    Estado de la Batería
Hacer un método para que JARVIS informe el estado de la batería en porcentaje a través de la
consola. Poner como carga máxima del reactor el mayor float posible. Ejecutar varias acciones y
mostrar el estado de la misma.
     */
    public static void estadoBateria(Armadura ironMan) {
        System.out.println("Estado Actual Bateria Generador: " + (ironMan.getNivelEnergiaGenerador() * 100 / estadoInicialEnergiaGenerador) + "%");
    }
    
    /*Mostrar Información del Reactor
Hacer un método para que JARVIS informe el estado del reactor en otras dos unidades de
medida. Hay veces en las que Tony tiene pretensiones extrañas. Buscar en Wikipedia la tabla de
transformaciones.
    
    https://www.newark.com/es/calculadora-conversion-potencia
*/
    public static void infoReactor(Armadura ironMan) {
        System.out.println("Potencia eléctrica Megavatio (MW): " + ironMan.getNivelEnergiaGenerador());
        System.out.println("Potencia eléctrica Milivatio (mW): " + (ironMan.getNivelEnergiaGenerador() * 0.001) );
        System.out.println("Potencia eléctrica Ergio por segundo (erg/s): " + (ironMan.getNivelEnergiaGenerador() * 10000));
    }
    
    

}
