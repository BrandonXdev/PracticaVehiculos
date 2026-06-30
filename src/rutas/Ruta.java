/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rutas;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import personas.Cliente;

/**
 *
 * @author brand
 */
public class Ruta {
    
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaLocal;
    private int cupoMaximo;
    private Cliente[] clientes;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraLocal() {
        return horaLocal;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Ruta(String nombre, LocalDate fecha, LocalTime horaLocal, int cupoMaximo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaLocal = horaLocal;
        this.cupoMaximo = cupoMaximo;
        this.clientes = new Cliente[cupoMaximo];
    }
    
    public boolean espaciosDisponibles(){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                return true;  
            }
        }
        return false;
    }
    
    public void registrarCliente(Cliente cliente){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                return;
            }
        }
    }
    
    public double porcentajeOcupacion(){
        int ocupados = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                ocupados++;   
            }
        }
        if (cupoMaximo == 0) {
            return 0;
        }
        return (ocupados * 100.0) / cupoMaximo;
    }
    
    
    
}
