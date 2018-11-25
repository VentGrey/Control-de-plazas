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
    String Nombre, Ciudad, IdPlaza;
    Integer Policias, NPC;

    public Plaza(String IdPlaza) {
        this.IdPlaza = IdPlaza;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setPolicias(Integer Policias) {
        this.Policias = Policias;
    }

    public void setNPC(Integer NPC) {
        this.NPC = NPC;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getIdPlaza() {
        return IdPlaza;
    }

    public Integer getPolicias() {
        return Policias;
    }

    public Integer getNPC() {
        return NPC;
    }

    
}
