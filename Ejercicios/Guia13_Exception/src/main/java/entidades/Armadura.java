/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.Rockwell;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Armadura {

    //Las armaduras de Stark se encuentran definidas por un color primario y un color secundario.
    protected String colorPrimario, colorSecundario;

    //Se encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
    //guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
    protected String propulsored, repulsores;

    /*
    La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
    se mide con un número entero cuya unidad de medida de dureza es Rockwell
    (https://es.wikipedia.org/wiki/Dureza_Rockwell).
    
    Detalles:
    Para materiales muy duros, se emplea un cono con punta de diamante de 120° y una carga de 60 kg, se simboliza HRA.
    Para aceros de baja resistencia se emplea una bola de acero extraduro de 1/16" y una carga de 100 kg, se simboliza HRB.
    Para aceros de alta resistencia se emplea un cono con punta de diamante de 120° y una carga de 150 kg, se simboliza HRC.
    Para la medida superficial de un material en el que ha aplicado un esfuerzo de 30 kg con bola de 1/16 pulgadas: HR30TW.
     */
    protected Rockwell nivelRockwell;

    //Todas las armaduras poseen un nivel de salud el cual se mide de 0 a 100.
    protected int nivelSalud;

    /*
    Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
    cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
    de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
    parte de la armadura.
     */
    protected int nivelEnergiaGenerador;

    /*
    La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
    información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
    susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
    consola y sintetizador) tienen un consumo de energía asociado.
     */
    protected DispositivoArmadura botaL, botaR;
    protected DispositivoArmadura guanteL, guanteR;
    protected DispositivoArmadura consola, sintetizador;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, Rockwell nivelRockwell, int nivelSalud, DispositivoArmadura botaL, DispositivoArmadura botaR, DispositivoArmadura guanteL, DispositivoArmadura guanteR, DispositivoArmadura consola, DispositivoArmadura sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelRockwell = nivelRockwell;
        this.nivelSalud = nivelSalud;
        this.botaL = botaL;
        this.botaR = botaR;
        this.guanteL = guanteL;
        this.guanteR = guanteR;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.nivelEnergiaGenerador = this.botaL.getEnergia() + this.botaR.getEnergia() + this.guanteL.getEnergia() + this.guanteR.getEnergia() + this.consola.getEnergia() + this.sintetizador.getEnergia();
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + "\n , nivelRockwell=" + nivelRockwell + ", nivelSalud=" + nivelSalud + "\n , nivelEnergiaGenerador=" + nivelEnergiaGenerador + "\n , botaL=" + botaL + ", botaR=" + botaR + "\n , guanteL=" + guanteL + ", guanteR=" + guanteR + "\n , consola=" + consola + ", sintetizador=" + sintetizador + '}';
    }

    /* Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo que se camina o se corra.
    
• Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le pasa
el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida y la
armadura deberá informar al generador se ha consumido esa cantidad de energía.
     */
    public void generadorInfo() {
        this.nivelEnergiaGenerador = this.botaL.getEnergia() + this.botaR.getEnergia() + this.guanteL.getEnergia() + this.guanteR.getEnergia() + this.consola.getEnergia() + this.sintetizador.getEnergia();
    }

    //Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
    //establecida como consumo en la bota por el tiempo en el que se camine.
    public void caminar(int tiempoMinutos) throws DamageException {
        try {
            if (this.botaL.isDamage() || this.botaR.isDamage()) {
                throw new DamageException("Botas Dañadas");
            }
            this.botaL.setEnergia(this.botaL.getEnergia() - botaL.usarDispositivo(1, tiempoMinutos));
            this.botaR.setEnergia(this.botaR.getEnergia() - botaR.usarDispositivo(1, tiempoMinutos));
        } catch (EnergiaException | DamageException e) {
            System.out.println("Caminar:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }
    //Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
    //energía establecida como consumo en la bota por el tiempo en el que se corra.

    public void correr(int tiempoMinutos) throws DamageException {

        try {
            if (this.botaL.isDamage() || this.botaR.isDamage()) {
                throw new DamageException("Botas Dañadas");
            }
            this.botaL.setEnergia(this.botaL.getEnergia() - botaL.usarDispositivo(2, tiempoMinutos));
            this.botaR.setEnergia(this.botaR.getEnergia() - botaR.usarDispositivo(2, tiempoMinutos));
        } catch (EnergiaException | DamageException e) {
            System.out.println("Correr:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }

    //Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
    //energía por el tiempo que dure la propulsión.
    public void propulsarse(int tiempoMinutos) throws DamageException {

        try {
            if (this.botaL.isDamage() || this.botaR.isDamage()) {
                throw new DamageException("Botas Dañadas");
            }
            this.botaL.setEnergia(this.botaL.getEnergia() - botaL.usarDispositivo(3, tiempoMinutos));
            this.botaR.setEnergia(this.botaR.getEnergia() - botaR.usarDispositivo(3, tiempoMinutos));
        } catch (EnergiaException | DamageException e) {
            System.out.println("Propulsion:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }

    //Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
    //consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
    public void volar(int tiempoMinutos) throws DamageException {

        try {
            if (this.botaL.isDamage() || this.botaR.isDamage()) {
                throw new DamageException("Botas Dañadas");
            }
            if (this.guanteL.isDamage() || this.guanteR.isDamage()) {
                throw new DamageException("Guantes Dañados");
            }
            this.botaL.setEnergia(this.botaL.getEnergia() - botaL.usarDispositivo(3, tiempoMinutos));
            this.botaR.setEnergia(this.botaR.getEnergia() - botaR.usarDispositivo(3, tiempoMinutos));
            this.guanteL.setEnergia(this.guanteL.getEnergia() - guanteL.usarDispositivo(2, tiempoMinutos));
            this.guanteR.setEnergia(this.guanteR.getEnergia() - guanteR.usarDispositivo(2, tiempoMinutos));
        } catch (EnergiaException | DamageException e) {
            System.out.println("Volar:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }

    //Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
    public void guanteDisparo(int tiempoMinutos) throws DamageException {

        try {
            if (this.guanteL.isDamage() || this.guanteR.isDamage()) {
                throw new DamageException("Guantes Dañados");
            }
            this.guanteL.setEnergia(this.guanteL.getEnergia() - guanteL.usarDispositivo(3, tiempoMinutos));
            this.guanteR.setEnergia(this.guanteR.getEnergia() - guanteR.usarDispositivo(3, tiempoMinutos));
        } catch (EnergiaException | DamageException e) {
            System.out.println("Disparo:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }

    //Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
    //establecido en estos dispositivos. Solo se usa en nivel básico.
    public void escribirConsola() throws EnergiaException {
        try {
            if (this.consola.getEnergia() == 0) {
                throw new EnergiaException("Sin Energia para la consola");
            } else {
                this.consola.setEnergia(this.consola.getEnergia() - this.consola.getConsumo());
            }
        } catch (EnergiaException e) {
            System.out.println("Consola:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }

    public void hablarSinte() throws EnergiaException {
        try {
            if (this.sintetizador.getEnergia() == 0) {
                throw new EnergiaException("Sin Energia para la sintetizador");
            } else {
                this.sintetizador.setEnergia(this.sintetizador.getEnergia() - this.sintetizador.getConsumo());
            }
        } catch (EnergiaException e) {
            System.out.println("Sintetizador:");
            System.out.println(e.getMessage());
        } finally {
            generadorInfo();
        }
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getPropulsored() {
        return propulsored;
    }

    public void setPropulsored(String propulsored) {
        this.propulsored = propulsored;
    }

    public String getRepulsores() {
        return repulsores;
    }

    public void setRepulsores(String repulsores) {
        this.repulsores = repulsores;
    }

    public Rockwell getNivelRockwell() {
        return nivelRockwell;
    }

    public void setNivelRockwell(Rockwell nivelRockwell) {
        this.nivelRockwell = nivelRockwell;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getNivelEnergiaGenerador() {
        return nivelEnergiaGenerador;
    }

    public void setNivelEnergiaGenerador(int nivelEnergiaGenerador) {
        this.nivelEnergiaGenerador = nivelEnergiaGenerador;
    }

    public DispositivoArmadura getBotaL() {
        return botaL;
    }

    public void setBotaL(DispositivoArmadura botaL) {
        this.botaL = botaL;
    }

    public DispositivoArmadura getBotaR() {
        return botaR;
    }

    public void setBotaR(DispositivoArmadura botaR) {
        this.botaR = botaR;
    }

    public DispositivoArmadura getGuanteL() {
        return guanteL;
    }

    public void setGuanteL(DispositivoArmadura guanteL) {
        this.guanteL = guanteL;
    }

    public DispositivoArmadura getGuanteR() {
        return guanteR;
    }

    public void setGuanteR(DispositivoArmadura guanteR) {
        this.guanteR = guanteR;
    }

    public DispositivoArmadura getConsola() {
        return consola;
    }

    public void setConsola(DispositivoArmadura consola) {
        this.consola = consola;
    }

    public DispositivoArmadura getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(DispositivoArmadura sintetizador) {
        this.sintetizador = sintetizador;
    }

}
