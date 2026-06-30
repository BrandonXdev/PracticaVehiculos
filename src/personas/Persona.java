/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author hilar
 */
public abstract class Persona {
private String nombreCompleto;
private String identificacion;
private LocalDate fechaNacimiento;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad(){
        return Period.between( fechaNacimiento,LocalDate.now()).getYears();
    }
    public Persona(String nombreCompleto, String identificacion, LocalDate fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        
    }

    @Override
    public String toString() {
        return "Nombre Completo: " + nombreCompleto + "\n Identificacion: " + identificacion + "\n Edad: " + getEdad();
  }
}
   