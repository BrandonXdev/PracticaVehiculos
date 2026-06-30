/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;

/**
 *
 * @author hilar
 */
public class Cliente extends personas.Persona {
   private String tipolicencia;

    public String getTipolicenciaString() {
        return tipolicencia;
    }

    public void setTipolicenciaString(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    public Cliente(String tipolicencia, String nombreCompleto, String identificacion, LocalDate fechaNacimiento) {
        super(nombreCompleto, identificacion, fechaNacimiento);
        this.tipolicencia = tipolicencia;
    }

    @Override
    public String toString() {
        return "Tipo licencia: " + tipolicencia;
    }
   
}
