/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;


import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class ListaReproduccion {

    private List<Cancion> lista;

    //Constructor predeterminado 
    public ListaReproduccion(List<Cancion> canciones) {
        this.lista = canciones;
    }

    //Getter y Setter. 
    public List<Cancion> getCanciones() {
        return lista;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.lista = canciones;
    }

    //Hashcode y Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.lista);
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
        final ListaReproduccion other = (ListaReproduccion) obj;
        return Objects.equals(this.lista, other.lista);
    }

    //Método que devuelve el número de canciones que tiene la lista. 
    public int numeroCanciones() {
        return this.lista.size();
    }

    //Método que devuelve si la lista de reproducción está vacia. 
    public boolean estaVacia() {
        return this.lista.isEmpty();
    }
    
    public Cancion escucharCancion(int posicion) {
        return this.lista.get(posicion);
        //Controlar excepciones
    }
    //Método que cambia de posición las canciones de una lista. 
    public void cambiarCancion(int posicion, Cancion cancion){
        if (posicion < this.lista.size() && posicion > -1) {
            this.lista.set(posicion, cancion);
        }
    }
}
