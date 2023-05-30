/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class EdificioDeOficinas extends Edificio {

    protected int nroOficinas;
    protected int cantPersonasXOficina;
    protected int nroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int cantPersonasXOficina, int nroPisos, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        if (nroOficinas == 0) {
            this.nroOficinas = 1;
        } else {
            this.nroOficinas = nroOficinas;
        }

        this.cantPersonasXOficina = cantPersonasXOficina;
        this.nroPisos = nroPisos;
    }

    public void cantPersonas() {
        /**
         * De esta clase nos interesa saber cuántas personas pueden trabajar en
         * todo el edificio, el usuario dirá cuántas personas entran en cada
         * oficina, cuantas oficinas y el número de piso (suponiendo que en cada
         * piso hay una oficina). Crear el método cantPersonas(), que muestre
         * cuantas personas entrarían en un piso y cuantas en todo el edificio.
         */
        int cantPerXPiso = this.cantPersonasXOficina * this.nroOficinas;
        int cantPerXEdificio = cantPerXPiso * this.nroPisos;

        System.out.println("El edificio puede albergar " + cantPerXPiso + " personas por piso.");
        System.out.println("El edificio puede albergar " + cantPerXEdificio + " personas en total.");
    }

    @Override
    public float calcularSuperficie() {
        return this.alto * this.ancho * this.nroPisos;
    }

    @Override
    public float calcularVolumen() {
        return this.alto * this.ancho * this.alto * this.nroPisos;
    }

    @Override
    public String toString() {
        return super.toString() + "EdificioDeOficinas{" + "nroOficinas=" + nroOficinas + ", cantPersonasXOficina=" + cantPersonasXOficina + ", nroPisos=" + nroPisos + '}';
    }

    
}
