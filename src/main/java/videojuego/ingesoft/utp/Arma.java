/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.ingesoft.utp;

/**
 *
 * @author wilso
 */
public class Arma {
    private Integer codArma;
    private Integer agilidad;
    private Integer fuerza;
    private Integer inteligencia;
    private Integer durabilidad;
    private boolean equipada;

    public Integer getCodArma() {
        return codArma;
    }

    public void setCodArma(Integer codArma) {
        this.codArma = codArma;
    }

    public Integer getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(Integer agilidad) {
        this.agilidad = agilidad;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(Integer durabilidad) {
        this.durabilidad = durabilidad;
    }

    public boolean isEquipada() {
        return equipada;
    }

    public void setEquipada(boolean equipada) {
        this.equipada = equipada;
    }
}
