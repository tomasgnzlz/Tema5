/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5F;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Soldado implements Comparable<Soldado>{
    //Se crean aquellos atributos que pide el ejercicio. 
    private int nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    //Constructor predeterminado. 
    public Soldado(int nif, String nombre, String apellido1, String apellido2, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    //Constructor vacío. 
    public Soldado() {
    }

    //Getters & Setters. 
    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //toString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Soldado{");
        sb.append("nif=").append(nif);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido1=").append(apellido1);
        sb.append(", apellido2=").append(apellido2);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    //Equals & HashCode. 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nif);
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
        final Soldado other = (Soldado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    //CompareTo
    @Override
    public int compareTo(Soldado o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //return this.nif.compareToIgnoreCase(o.nif);
        return Integer.compare(this.nif, o.getNif());
    }
    
    
    
    
    
    
    
    
    
}
