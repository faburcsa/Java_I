/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class LibroDAO {

    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaFMU");
    private EntityManager em = EMF.createEntityManager();

    // Este método nos permite conectar con la base de datos
    // se verifica si la conexión está realizada, en caso que
    // no esté realizada, se realiza.
    public void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    // Este método nos permite desconectarnos de la base de datos
    // Se verifica si existe una conexión, y de ser el caso, se
    // cierra la conexión y se desconecta el programa con la base de datos.
    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    // este método nos permite persistir un objeto en la base de datos.
    // Toma como parámetro el objeto de tipo Mascota que se quiere persistir
    public void guardar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();
    }

    // Este método nos permite eliminar un registro de la base de datos.
    // Como parámetro se pasa el objeto a eliminar de la base de datos.
    // Se busca en la base de datos el registro que contenga la misma información
    // que el parámetro recibido, y se elimina.
    public void eliminar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        desconectar();
    }

    // Este método nos permite modificar un registro de una base de datos.
    // Recibe como parámetro el objeto con los datos cambiados (debe mantener
    // la misma llave primaria) y lo reemplaza por el anterior.
    public void editar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT a FROM Libro a ").getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarPorIsbn(Long isbn) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.isbn LIKE :isbn").setParameter("isbn", isbn.toString()).getSingleResult();
        desconectar();
        return libro;
    }

    public List buscarPorTitulo(String titulo) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE CONCAT('%', :titulo, '%')")
                .setParameter("titulo", titulo).getResultList();
        desconectar();
        return libros;
    }

    public List buscarLibroPorAutor(String nombre) throws Exception {
        conectar();
        //Opcion 1 sin JOIN
        //        List<Persona> personas = em.createQuery("SELECT p FROM Persona p WHERE p.direccion.pais LIKE :pais AND p.direccion.provincia LIKE :provincia ")
        //                .setParameter("pais", pais).setParameter("provincia", provincia).getResultList();
        //Opcion 2 con JOIN
        //List<Persona> personas = em.createQuery("SELECT p FROM Persona p JOIN p.direccion d WHERE d.pais LIKE :pais AND d.provincia LIKE :provincia ")
        //        .setParameter("pais", pais).setParameter("provincia", provincia).getResultList();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE CONCAT('%', :nombre, '%')")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }

        public List buscarLibroPorEditorial(String nombre) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE CONCAT('%', :nombre, '%')")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }
}
