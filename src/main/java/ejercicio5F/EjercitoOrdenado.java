/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5F;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tomas
 */
public class EjercitoOrdenado {

    private Set<Soldado> ejercito;

    public EjercitoOrdenado(Set<Soldado> ejercito) {
        this.ejercito = new TreeSet<>();
    }

    public void setEjercito(Set<Soldado> ejercito) {
        this.ejercito = ejercito;
    }

    public Set<Soldado> getEjercito() {
        return ejercito;
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
    public boolean soldadoEnEjercito(int nif) {
        Soldado solAux = new Soldado();
        solAux.setNif(nif);//Cambiar a int en su clase.
        return ejercito.contains(nif);
    }

    //Método para mostrar todos los Soldados en un ArrayList.
    public ArrayList<Soldado> sacarArrayListSoldado() {
        //Se crea la lista con todos los Soldados del ejercito. 
        ArrayList<Soldado> listaSoldadosAlistados = new ArrayList<>();

        //Recorro la clase Soldados para obtener todos sus elementos y devolverlos en una lista.
        for (Soldado soldadosDesdeClaseS : listaSoldadosAlistados) {
            //Añado los soldados a la lista.
            listaSoldadosAlistados.add(soldadosDesdeClaseS);
        }
        return listaSoldadosAlistados;
    }

    //Método para eliminar soldados de listasoldadosAlistados.
    public void eliminarSoldados(int nif) {
        //Creo el objeto soldado. 
        Soldado solAux = new Soldado();
        //LE paso el atributo que hace falta introducir para eliminar un soldado.
        solAux.setNif(nif);
        //Elimino dicho soldado. 
        ejercito.remove(solAux);
    }

}
