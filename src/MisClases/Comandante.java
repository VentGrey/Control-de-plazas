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
public class Comandante {
    
    String Nombre, Apaterno, Especialidad;
    Integer Cedula, Antiguedad; //Quisiera pensar que la cédula es única

    public Comandante(String Nombre, String Apaterno, String Especialidad, Integer Cedula, Integer Antiguedad) {
        this.Nombre = Nombre;
        this.Apaterno = Apaterno;
        this.Especialidad = Especialidad;
        this.Cedula = Cedula;
        this.Antiguedad = Antiguedad;
    }
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public void setCedula(Integer Cedula) {
        this.Cedula = Cedula;
    }

    public void setAntiguedad(Integer Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public Integer getCedula() {
        return Cedula;
    }

    public Integer getAntiguedad() {
        return Antiguedad;
    }
    
    
}
