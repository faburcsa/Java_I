/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpa.libreria;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class JPALibreria {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static private LibroServicio libroServ = new LibroServicio();
    static private EditorialServicio editorialServ = new EditorialServicio();
    static private AutorServicio autorServ = new AutorServicio();

    public static void main(String[] args) {
        Boolean outMenu = true;
        while (outMenu) {
            //Me falta el editar Todos y eliminar Libro
            try {
                System.out.println("MENU");
                System.out.println("1 - Agregar Autor");
                System.out.println("2 - Agregar Editorial");
                System.out.println("3 - Eliminar Autor");
                System.out.println("4 - Eliminar Editorial");
                System.out.println("5 - Agregar Libro");
                System.out.println("6 - Búsqueda de un Autor por nombre");
                System.out.println("7 - Búsqueda de un libro por ISBN.");
                System.out.println("8 - Búsqueda de un libro por Título. ");
                System.out.println("9 - Búsqueda de un libro/s por nombre de Autor");
                System.out.println("10 - Búsqueda de un libro/s por nombre de Editorial.");

                System.out.println("99 - Salir");
                System.out.println("Ingrese Opcion:");
                int opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        agregarAutor();
                        break;
                    case 2:
                        agregarEditorial();
                        break;
                    case 3:
                        eliminarAutor();
                        break;
                    case 4:
                        eliminarEditorial();
                        break;
                    case 5:
                        agregarLibro();
                        break;
                    case 6:
                        buscarAutorNombre();
                        break;
                    case 7:
                        buscarLibroId();
                        break;
                    case 8:
                        buscarLibroTitulo();
                        break;
                    case 9:
                        buscarLibroAutor();
                        break;
                    case 10:
                        buscarLibroEditorial();
                        break;
                    case 99:
                        outMenu = false;
                        break;
                    default:
                        System.out.println("Opcion Incorrecte, reintente...");
                }

            } catch (Exception e) {
            }
        }
    }

    static public Autor agregarAutor() {
        System.out.println("Ingrese Nombre Autor:");
        String nombreAutor = leer.next();
        Autor autor = autorServ.crearAutor(nombreAutor);
        return autor;
    }

    static public void agregarLibro() {
        System.out.println("Ingrese Titulo Libro:");
        String nombreTitulo = leer.next();
        System.out.println("Ingrese Cant. Ejemplares:");
        Integer cantEjemplares = leer.nextInt();

        System.out.println("Desea Ingresar nuevo Autor S/N?");
        String newObj = leer.next().toLowerCase();
        Autor autor = null;
        if (newObj.equals("s")) {
            autor = agregarAutor();
        } else {
            System.out.println("Autores Disponibles:");
            autorServ.listarAutores().forEach((a) -> System.out.println(a.toString()));
            System.out.println("Ingrese ID autor:");
            autor = autorServ.buscarPorId(leer.nextInt());
        }

        System.out.println("Desea Ingresar nueva Editorial S/N?");
        newObj = leer.next().toLowerCase();
        Editorial editorial = null;
        if (newObj.equals("s")) {
            editorial = agregarEditorial();
        } else {
            System.out.println("Editoriales Disponibles:");
            editorialServ.listarEditoriales().forEach((a) -> System.out.println(a.toString()));
            System.out.println("Ingrese ID Editorial:");
            editorial = editorialServ.buscarPorId(leer.nextInt());
        }

        System.out.println("Ingrese Año publicacion:");
        Integer anio = leer.nextInt();
        Libro libro = libroServ.crearLibro(nombreTitulo, cantEjemplares, autor, editorial, anio);
    }

    static public Editorial agregarEditorial() {
        System.out.println("Ingrese Nombre Editorial:");
        String nombreEditorial = leer.next();
        Editorial editorial = editorialServ.crearEditorial(nombreEditorial);
        return editorial;
    }

    static public void eliminarEditorial() {
        editorialServ.listarEditoriales().forEach((a) -> System.out.println(a.toString()));

        System.out.println("Ingrese Id Editorial a Eliminar:");
        Integer idEditorial = leer.nextInt();
        boolean editorial = editorialServ.eliminarPorId(idEditorial);
    }

    static public void eliminarAutor() {
        autorServ.listarAutores().forEach((a) -> System.out.println(a.toString()));

        System.out.println("Ingrese Id Autor a Eliminar:");
        Integer idAutor = leer.nextInt();
        boolean autor = autorServ.eliminarPorId(idAutor);
    }

    static public void buscarLibroId() {
        System.out.println("Ingrese ISBN Libro a Buscar:");
        Long isbn = leer.nextLong();
        try {
            Libro libro = libroServ.buscarPorIsbn(isbn);
            System.out.println(libro.toString());
        } catch (Exception e) {
            System.out.println("No Existe Libro con ese ISBN");
        }
    }

    static public void buscarAutorNombre() {
        System.out.println("Ingrese Nombre Autor a Buscar:");
        String nombre = leer.next();
        try {
            List<Autor> autores = autorServ.buscarPorNombre(nombre);
            if (autores.isEmpty()) {
                System.out.println("No Existen Autores con ese Nombre");
            } else {
                for (Autor autore : autores) {
                    System.out.println(autore.toString());
                }
            }
            //autorServ.listarAutores().forEach((a) -> System.out.println(a.toString()));
        } catch (Exception e) {
            System.out.println("No Existen Autores con ese Nombre");
        }
    }
    
    
    static public void buscarLibroTitulo() {
        System.out.println("Ingrese Titulo Libro a Buscar:");
        String titulo = leer.next();
        try {
            List<Libro> libros = libroServ.buscarLibroPorTitulo(titulo);
            if (libros.isEmpty()) {
                System.out.println("No Existen Libros con ese Titulo");
            } else {
                for (Libro libr : libros) {
                    System.out.println(libr.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("No Existen Libros con ese Titulo");
        }
    }
    
   static public void buscarLibroAutor() {
        System.out.println("Ingrese Nombre Autor a Buscar:");
        String nombreAutor = leer.next();
        try {
            List<Libro> libros = libroServ.buscarLibroPorAutor(nombreAutor);
            if (libros.isEmpty()) {
                System.out.println("No Existen Libros de ese Autor");
            } else {
                for (Libro libr : libros) {
                    System.out.println(libr.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("No Existen Libros de ese Autor");
        }
    }
   
   
     static public void buscarLibroEditorial() {
        System.out.println("Ingrese Nombre Editorial a Buscar:");
        String nombreEditorial = leer.next();
        try {
            List<Libro> libros = libroServ.buscarLibroPorEditorial(nombreEditorial);
            if (libros.isEmpty()) {
                System.out.println("No Existen Libros de esa Editorial");
            } else {
                for (Libro libr : libros) {
                    System.out.println(libr.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("No Existen Libros de esa Editorial");
        }
    }
}
