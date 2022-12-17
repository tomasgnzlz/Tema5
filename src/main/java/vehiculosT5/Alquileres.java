/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Alquileres {

    private int arquileID;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int duracionDias;
    private static int contador = 0;

    public Alquileres(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, int duracionDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.duracionDias = duracionDias;
        contador++;
        this.arquileID = contador;
    }

    public Alquileres() {
    }

    public int getArquilerID() {
        return arquileID;
    }

    public void setAlquilerID(int alquilerID) {
        this.arquileID = alquilerID;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquileres{");
        sb.append("arquileID=").append(arquileID);
        sb.append(", cliente=").append(cliente);
        sb.append(", vehiculo=").append(vehiculo);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.arquileID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alquileres other = (Alquileres) obj;
        return this.arquileID == other.arquileID;
    }

}
