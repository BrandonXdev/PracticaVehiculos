/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquileres;

import java.time.LocalDate;
import vehiculos.Vehiculo;

/**
 *
 * @author joanreciojimenez
 */
public class Alquiler {
    private cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    
    public cliente getCliente (){
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Alquiler(cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaDevolucion) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "\ncliente = "  + cliente + 
                "\nvehiculo = " + vehiculo + "," + 
                "\nfechaInicio = " + fechaInicio +
                "\nfechaDevolucion = " + fechaDevolucion + '}';
    } 
    

}   
