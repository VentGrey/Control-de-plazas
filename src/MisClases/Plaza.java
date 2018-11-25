/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author omar
 */
public class Plaza {
    String Nombre;
    Integer Policias;
    Integer NPC;
    String Ciudad;
    String IdPlaza; //Único

    public Plaza(String Nombre, Integer Policias, Integer NPC, String Ciudad, String IdPlaza) {
        this.Nombre = Nombre;
        this.Policias = Policias;
        this.NPC = NPC;
        this.Ciudad = Ciudad;
        this.IdPlaza = IdPlaza;
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getPolicias() {
        return Policias;
    }

    public Integer getNPC() {
        return NPC;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getIdPlaza() {
        return IdPlaza;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPolicias(Integer Policias) {
        this.Policias = Policias;
    }

    public void setNPC(Integer NPC) {
        this.NPC = NPC;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setIdPlaza(String IdPlaza) {
        this.IdPlaza = IdPlaza;
    }
    
    
}
