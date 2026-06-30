
package automoviles;

import vehiculos.Vehiculo;






public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public Automovil(int codigoUnico, String marca, int capacidadPasajeros, double precioPorDiaAlquiler, 
            boolean estadoDisponibilidad, int numeroPuertas) {
        super(codigoUnico, marca, capacidadPasajeros, precioPorDiaAlquiler, estadoDisponibilidad);
        this.numeroPuertas = numeroPuertas;
    }
    
}
