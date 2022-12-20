/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosEstructurasAlmacenamiento;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cancion {
    //lista de objetos de la clase 
    //private List<String>canciones;
    private String nombre;
    private String generi;
    private double duración;

    //Constructor predeterminado. 
    public Cancion() {
    }

    //ToString. 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("nombre=").append(nombre);
        sb.append(", generi=").append(generi);
        sb.append(", duraci\u00f3n=").append(duración);
        sb.append('}');
        return sb.toString();
    }

    //Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneri() {
        return generi;
    }

    public void setGeneri(String generi) {
        this.generi = generi;
    }

    public double getDuración() {
        return duración;
    }
    
    public void setDuración(double duración) {
        this.duración = duración;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.generi);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.duración) ^ (Double.doubleToLongBits(this.duración) >>> 32));
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
        final Cancion other = (Cancion) obj;
        if (Double.doubleToLongBits(this.duración) != Double.doubleToLongBits(other.duración)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.generi, other.generi);
    }
    
    //MÉTODOS QUE PIDE EL EJERCICIO. 
    public void numeroCanciones(){
        //Este método devuelve el nº de canciones de la lista. 
    }
    
}
