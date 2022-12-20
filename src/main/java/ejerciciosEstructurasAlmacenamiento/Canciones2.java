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
public class Canciones2 {
    private List<Cancion> canciones;
     
    //Constructor predeterminado 

    public Canciones2(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    //Getter y Setter. 
    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    //Hashcode y Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.canciones);
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
        final Canciones2 other = (Canciones2) obj;
        return Objects.equals(this.canciones, other.canciones);
    }

    //Método que devuelve el número de canciones que tiene la lista. 
    public int numeroCanciones(){
        
        return 0;
    }
    
    //Método que devuelve si la lista de reproducción está vacia. 
    public int estaVacia(){
        
        return 0;
    }
     
    
}
