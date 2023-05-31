/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia12_herencia;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import enumeraciones.TipoGym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Una compañía de promociones turísticas desea mantener información sobre la
 * infraestructura de alojamiento para turistas, de forma tal que los clientes
 * puedan planear sus vacaciones de acuerdo con sus posibilidades. Los
 * alojamientos se identifican por un nombre, una dirección, una localidad y un
 * gerente encargado del lugar. La compañía trabaja con dos tipos de
 * alojamientos: Hoteles y Alojamientos Extrahoteleros. Los Hoteles tienen como
 * atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos,
 * Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
 * características de las distintas categorías son las siguientes: • Hotel ****
 * Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
 * Nombre del Restaurante, Capacidad del Restaurante, Precio de las
 * Habitaciones. • Hotel ***** Cantidad de Habitaciones, Número de camas,
 * Cantidad de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del
 * Restaurante, Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de
 * Limosinas, Precio de las Habitaciones. Los gimnasios pueden ser clasificados
 * por la empresa como de tipo “A” o de tipo “B”, de acuerdo a las prestaciones
 * observadas. Las limosinas están disponibles para cualquier cliente, pero
 * sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más
 * caro será. El precio de una habitación debe calcularse de acuerdo con la
 * siguiente fórmula: PrecioHabitación = $50 + ($1 x capacidad del hotel) +
 * (valor agregado por restaurante) + (valor agregado por gimnasio) + (valor
 * agregado por limosinas). Donde: Valor agregado por el restaurante: • $10 si
 * la capacidad del restaurante es de menos de 30 personas. • $30 si está entre
 * 30 y 50 personas. • $50 si es mayor de 50. Valor agregado por el gimnasio: •
 * $50 si el tipo del gimnasio es A. • $30 si el tipo del gimnasio es B. Valor
 * agregado por las limosinas: • $15 por la cantidad de limosinas del hotel.
 *
 * En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a
 * los de los hoteles, estando más orientados a la vida al aire libre y al
 * turista de bajos recursos. Por cada Alojamiento Extrahotelero se indica si es
 * privado o no, así como la cantidad de metros cuadrados que ocupa. Existen dos
 * tipos de alojamientos extrahoteleros: los Camping y las Residencias. Para los
 * Camping se indica la capacidad máxima de carpas, la cantidad de baños
 * disponibles y si posee o no un restaurante dentro de las instalaciones. Para
 * las residencias se indica la cantidad de habitaciones, si se hacen o no
 * descuentos a los gremios y si posee o no campo deportivo.
 *
 *
 * Realizar un programa en el que se representen todas las relaciones
 * descriptas. Realizar un sistema de consulta que le permite al usuario
 * consultar por diferentes criterios: • todos los alojamientos. • todos los
 * hoteles de más caro a más barato. • todos los campings con restaurante •
 * todos las residencias que tienen descuento.
 */
public class Extra_3_Turismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando Lista con Alojamientos Disponibles 2 de cada tipo
        List<Alojamiento> alojamientos = new ArrayList();
        boolean menu = true;

        Hotel5 h5_1 = new Hotel5(2, 3, 22, TipoGym.B, "Garrote", 55, 24, 12, 5, "Johnson", "Retiro Bs As", "Ciudad Autonoma", "Candela Almada");
        Hotel5 h5_2 = new Hotel5(5, 10, 2, TipoGym.A, "Guerrin", 55, 12, 43, 15, "Johnson II", "Retiro Bs As", "Ciudad Autonoma", "Celeste Urchueguia");
        Hotel4 h4_1 = new Hotel4(TipoGym.A, "El Costerito", 40, 10, 22, 2, "Mayorazgo", "Parque Urquiza 555", "Parana ER", "Fabian Urchueguia");
        Hotel4 h4_2 = new Hotel4(TipoGym.B, "El Portal", 20, 5, 12, 5, "Stella Maris", "Ni Idea 232", "Foz Iguazu", "Un Brazuca");

        //Calculo Precio de habitaciones x Hotel
        System.out.println("Precio Habitacion $" + h4_1.precioHabitacion());
        System.out.println("Precio Habitacion $" + h4_2.precioHabitacion());
        System.out.println("Precio Habitacion $" + h5_1.precioHabitacion());
        System.out.println("Precio Habitacion $" + h5_2.precioHabitacion());

        Camping c1 = new Camping(10, 2, false, true, 1000f, "Toma Vieja", "Thompson", "Parana", "Municipalidad");
        Camping c2 = new Camping(50, 22, true, true, 1000f, "Villa Urquiza", "Ruta 14", "Villa Urquiza", "Vialidad Nacional");
        Residencia r1 = new Residencia(5, true, true, true, 500, "Residencia La Posta", "ALmafuerte 52", "Santa Fe", "Lara Urchueguia");
        Residencia r2 = new Residencia(3, false, true, false, 100, "Residencia Encuentro Intimos", "XXX 69", "El Cielo", "Joaquin Urchueguia");

        alojamientos.add(h4_1);
        alojamientos.add(h4_2);
        alojamientos.add(h5_1);
        alojamientos.add(h5_2);
        alojamientos.add(c1);
        alojamientos.add(c2);
        alojamientos.add(r1);
        alojamientos.add(r2);

        /**
         * Realizar un sistema de consulta que le permite al usuario consultar
         * por diferentes criterios:
         */
        //MENU
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (menu) {

            System.out.println("MOSTRAR ALOJAMIENTOS:");
            System.out.println("1 - Todos los alojamientos.");
            System.out.println("2 - Todos los hoteles de más caro a más barato.");
            System.out.println("3 - Todos los campings con restaurante");
            System.out.println("4 - Todos las residencias que tienen descuento.");
            System.out.println("5 - Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Alojamiento aux : alojamientos) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 2:
                    List<Hotel> hotelesXprecio = new ArrayList<>();
                    for (Alojamiento aux : alojamientos) {

                        if (aux instanceof Hotel) {
                            hotelesXprecio.add((Hotel) aux);
                        }
                    }
                    Collections.sort(hotelesXprecio);

                    for (Hotel hotel : hotelesXprecio) {
                        System.out.println("$" + hotel.getPrecio() + " - Hotel " + hotel.getNombre());
                        //System.out.println(hotel.toString());
                    }
                    break;
                case 3:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isPoseeRestaurant()) {
                                System.out.println(aux.toString());
                            }
                        }

                    }
                    break;
                case 4:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Residencia) {
                            if (((Residencia) aux).isDtoGremios()) {
                                System.out.println(aux.toString());
                            }
                        }

                    }
                    break;
                case 5:
                    System.out.println("Saliendo del Sistema");
                    menu = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta - Intente nuevamente...");
                    ;
            }
        }
    }
}
