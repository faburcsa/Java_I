/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 *     La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
se mide con un número entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell).
    
    Detalles:

Para materiales muy duros, se emplea un cono con punta de diamante de 120° y una carga de 60 kg, se simboliza HRA.
Para aceros de baja resistencia se emplea una bola de acero extraduro de 1/16" y una carga de 100 kg, se simboliza HRB.
Para aceros de alta resistencia se emplea un cono con punta de diamante de 120° y una carga de 150 kg, se simboliza HRC.
Para la medida superficial de un material en el que ha aplicado un esfuerzo de 30 kg con bola de 1/16 pulgadas: HR30TW.
 */
public enum Rockwell {HRA,HRB,HRC,HR30TW
    
}
