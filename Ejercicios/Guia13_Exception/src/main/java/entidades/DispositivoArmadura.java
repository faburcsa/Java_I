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
    public boolean damage=false;

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
        int energiaConsumida;
        if (this.energia < (nivelIntensidad * tiempoUsoMinutos)) {
            throw new EnergiaException("No hay Energia");
        } else {
            energiaConsumida = nivelIntensidad * tiempoUsoMinutos;
        }

        return energiaConsumida;
    }

    @Override
    public String toString() {
        return "DispositivoArmadura{" + "energia=" + energia + ", consumo=" + consumo + '}';
    }
    
    

}
