/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5F;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tomas
 */
public class Ejercito {

    private Set<Soldado> ejercito;

    public Ejercito(Set<Soldado> ejercito) {
        this.ejercito = new HashSet<>();
    }

    //Método para saber el nº de soldados que hay. 
    public int numeroSoldados() {
        //Devuelvo cuantos soldados hay en el ejercito. 
        return ejercito.size();
    }

    //Método que alistar a un soldado. 
    public void alistarSoldado(Soldado solAux) {
        ejercito.add(solAux);
    }

    //Método saber si el ejercito no tiene soldados. 
    public boolean ejercitoVacio() {
        //o con un if que devuelve una opción u otra segun el nº de soldados que tenga ele ejercito. 
        return ejercito.isEmpty();
    }

    //Método para saber si un soldado está en el ejercito.
    public boolean soldadoEnEjercito(Soldado solAux) {
        boolean esta = true;
        
        if (solAux.getNif() ) {
            esta = true;
        } else {
            return esta = false;
        }

        return esta;

    }
}
