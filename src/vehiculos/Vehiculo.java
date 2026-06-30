/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author joanreciojimenez
 */
public class Vehiculo {
    private int codigoUnico;
    private String marca;
    private int capacidadPasajero;
    private double precioPorDiaAlquiler;
    private boolean estadoDisponibilidad;
    
    
    public int getCodigoUnico(){
        return codigoUnico;
    }
    public String getMarca(){
        return marca;
    }
    public int getCapacidadPasajeros(){
        return capacidadPasajero;
    }
    public double getPrecioPorDiaAlquiler(){
        return precioPorDiaAlquiler;
    }
    public boolean getEstadoDisponibilidad(){
        return estadoDisponibilidad;
    }

    public void setPrecioPorDiaAlquiler(double precioPorDiaAlquiler) {
        this.precioPorDiaAlquiler = precioPorDiaAlquiler;
    }

    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public Vehiculo(int codigoUnico, String marca, int capacidadPasajero, double precioPorDiaAlquiler, boolean estadoDisponibilidad) {
        this.codigoUnico = codigoUnico;
        this.marca = marca;
        this.capacidadPasajero = capacidadPasajero;
        this.precioPorDiaAlquiler = precioPorDiaAlquiler;
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "\ncodigoUnico = " + codigoUnico + 
                "\nmarca = " + marca + 
                "\ncapacidadPasajero = " + capacidadPasajero +
                "\nprecioPorDiaAlquiler = " + precioPorDiaAlquiler + 
                "\nestadoDisponibilidad = " + estadoDisponibilidad + '}';
    }
}
