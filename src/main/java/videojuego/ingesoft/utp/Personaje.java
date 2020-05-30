/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.ingesoft.utp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wilso
 */
public class Personaje {
    private Integer vida;
    private Integer escudo;
    private String apodo;
    private Arma codArma;
    
    private final Map<Personaje, Integer> personajeDaño;

    public Personaje() {
        this.personajeDaño = new HashMap<>();
    }
    
    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Arma getCodArma() {
        return codArma;
    }

    public void setCodArma(Arma codArma) {
        this.codArma = codArma;
    }
    
    public int recibirDaño(int daño, Personaje jugador){
        
        Integer dañoAcumulado = personajeDaño.get(jugador) + daño;
        personajeDaño.put(jugador, dañoAcumulado);
        
        if(escudo != null && escudo > 0){
            this.escudo -= daño;
        }else {
            this.vida -= daño;
        }
        return daño;
    }
    
    public int atacar(int daño, Personaje personaje){
        personaje.recibirDaño(daño, personaje);
        return daño;
    }
    
    public int curarse(int cura){
        //TODO - Implementar
        return cura;
    }
}
