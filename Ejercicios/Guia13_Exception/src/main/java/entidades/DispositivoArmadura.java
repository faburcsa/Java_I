/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class DispositivoArmadura {

    public int energia;
    public int consumo;
    public boolean damage = false;

    public DispositivoArmadura(int energia, int consumo) {
        this.energia = energia;
        this.consumo = consumo;
    }

    public DispositivoArmadura() {
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    /**
     *
     * @param nivelIntensidad
     * @param tiempoUsoMinutos
     * @return
     * @throws EnergiaException
     */
    public int usarDispositivo(int nivelIntensidad, int tiempoUsoMinutos) throws EnergiaException {
        sufriendoDanios();
        reparaDanios();
        int energiaConsumida;
        if (this.energia < (nivelIntensidad * tiempoUsoMinutos)) {
            throw new EnergiaException("No hay Energia");
        } else {
            energiaConsumida = nivelIntensidad * tiempoUsoMinutos;
        }

        return energiaConsumida;
    }

    /*
    Sufriendo Daños
    A veces los dispositivos de la armadura sufren daños para esto cada dispositivo contiene un
    atributo público que dice si el dispositivo se encuentra dañado o no. Al utilizar un dispositivo
    existe un 30% de posibilidades de que se dañe.
    La armadura solo podrá utilizar dispositivos que no se encuentren dañados.
    Modifique las clases que sean necesarias para llevar adelante este comportamiento.
     */
    public void sufriendoDanios() {
        double randomNumber = Math.random() * 100; // Generar un número aleatorio entre 0 y 100
        // Cambiar la bandera si el número aleatorio es menor o igual al 30
        if (randomNumber <= 30) {
            this.damage = true;
            System.out.println("ATENCION - Se daño el dispositivo!!!");
        }
    }
    
    /*
    Reparando Daños
Hay veces que se puede reparar los daños de un dispositivo, en general es el 40% de las veces
que se puede hacer. Utilizar la clase Random para modelar este comportamiento. En caso de estar
dentro de la probabilidad (es decir probabilidad menor o igual al 40%) marcar el dispositivo como
sano. Si no dejarlo dañado.
    */
    public void reparaDanios() {
        double randomNumber = Math.random() * 100; // Generar un número aleatorio entre 0 y 100
        // Cambiar la bandera si el número aleatorio es menor o igual al 30
        if (randomNumber <= 40) {
            this.damage = false;
            System.out.println("Dispositivo REPARADO!!!");
        } else {
            if (this.damage = true) {
                System.out.println("No se pudo reparar....");
            }
        }
    }
    @Override
    public String toString() {
        return "DispositivoArmadura{" + "energia=" + energia + ", consumo=" + consumo + '}';
    }

}
