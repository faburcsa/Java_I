/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * rea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.

 */
public class Cuenta {
    private String titular;
    private double saldo;
    
    public void retirardinero(double money){
        if (this.saldo >= money ) {
            System.out.println("Saldo Actual $"+this.saldo+". Se retiran $"+money);
            this.saldo-=money;
        }else{
            System.out.println("No hay suficiente saldo para retirar $"+money+". Disponible $"+this.saldo);
        }
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
}
