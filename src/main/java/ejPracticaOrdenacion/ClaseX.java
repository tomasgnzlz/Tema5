/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejPracticaOrdenacion;

import java.util.Objects;

/**
 *
 * @author tomas
 * esgseghe
 */
public class ClaseX implements Comparable<ClaseX> {

    //Se declaran aquellos atributos con los que se trabajará. 
    private String vehiculos;
    private String marca;
    private int numeroRuedas;
    private int cilindrada;
    private int potenciaMaxima;

    //Constructor predeterminado. 
    public ClaseX(String vehiculos, String marca, int numeroRuedas, int cilindrada, int potenciaMaxima) {
        this.vehiculos = vehiculos;
        this.marca = marca;
        this.numeroRuedas = numeroRuedas;
        this.cilindrada = cilindrada;
        this.potenciaMaxima = potenciaMaxima;
    }

    //ConstructorVacío. 
    public ClaseX() {
    }

    //Getters&Setters.
    public String getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(String vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    //ToString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClaseX{");
        sb.append("vehiculos=").append(vehiculos);
        sb.append(", marca=").append(marca);
        sb.append(", numeroRuedas=").append(numeroRuedas);
        sb.append(", cilindrada=").append(cilindrada);
        sb.append(", potenciaMaxima=").append(potenciaMaxima);
        sb.append('}');
        return sb.toString();
    }

    //Equals&HashCode. 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.vehiculos);
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
        final ClaseX other = (ClaseX) obj;
        return Objects.equals(this.vehiculos, other.vehiculos);
    }

    @Override
    public int compareTo(ClaseX o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.vehiculos.compareToIgnoreCase(o.vehiculos);
    }

}
