/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.tipoCobertura;
import java.util.Date;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 *  * c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos
 * tanto de un vehículo, como los datos de un solo cliente. Los datos incluidos
 * en ella son: número de póliza, fecha de inicio y fin de la póliza, cantidad
 * de cuotas, forma de pago, monto total asegurado, incluye granizo, monto
 * máximo granizo, tipo de cobertura (total, contra terceros, etc.). 
 */
public class Poliza {
    private Cliente cliente;
    private Integer nroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cantCuotas;
    private boolean granizo;
    private Double maxGranizo;
    private tipoCobertura tipo;
    
    
}
