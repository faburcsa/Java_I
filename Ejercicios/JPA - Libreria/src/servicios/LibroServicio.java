/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import persistencia.LibroDAO;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class LibroServicio {

    private AutorServicio direccionServicio;
    private EditorialServicio personaServicio;
    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }

    public void setServicios(AutorServicio direccionServicio, EditorialServicio personaServicio) {
        this.direccionServicio = direccionServicio;
        this.personaServicio = personaServicio;
    }

    // este método invoca el método guardar de la clase DAO padre para 
    // persistir un objeto Libro
    public Libro crearLibro(String titulo, Integer ejemplares, Autor autor, Editorial editorial, Integer anio) {
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setAnio(anio);

            DAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarPorIsbn(Long isbn) {
        try {
            return DAO.buscarPorIsbn(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorIsbn(Long isbn) {
        try {
            Libro libro = DAO.buscarPorIsbn(isbn);
            DAO.eliminar(libro);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Libro> listarLibros() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        try {
            return DAO.buscarPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Libro> buscarLibroPorAutor(String nombreAutor) {
        try {
            return DAO.buscarLibroPorAutor(nombreAutor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Libro> buscarLibroPorEditorial(String nombreEditorial) {
        try {
            return DAO.buscarLibroPorEditorial(nombreEditorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
