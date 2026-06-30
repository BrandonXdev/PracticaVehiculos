
package motocicletas;

import vehiculos.Vehiculo;



public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public int getCilindraje() {
        return cilindraje;
    }

    public Motocicleta(int codigoUnico, String marca, int capacidadPasajeros, double precioPorDiaAlquiler, 
            boolean estadoDisponibilidad,int cilindraje) {
    super(codigoUnico, marca, capacidadPasajeros, precioPorDiaAlquiler, estadoDisponibilidad);
        this.cilindraje = cilindraje;
    }
       
}
