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
public class Enemigo extends Personaje{
    private Integer experiencia;

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }
    
    public String elemento_debilidad(){
        //TODO - Implementar
        return "0";
    }
    
    public String elemento_fortaleza(){
        //TODO - Implementar
        return "0";
    }
}
