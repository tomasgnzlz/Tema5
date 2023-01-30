/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5F;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author tomas
 */
/*
    ·Aplica lo estudiado para realizar una nueva clase llamada Ejercito, que contenga un número de soldados N. El constructor debe inicializar la estructura SET (no hay soldados duplicados y el orden no importa). Debe haber métodos para:
        1. Saber el número de soldados que hay.//
        2. Alistar a un solado.//
        3. Saber si el ejército no tiene soldados.//
        4. Saber si un soldado está en el ejército.//
        4. Sacar todos los soldados, en forma de ArrayList.//
        5. Desmatricular a un soldado del ejército.

    ·Crea una clase de prueba para tu clase Ejército, donde se hagan uso de los métodos anteriores.
 */
public class Ejercito {

    //Cro ejercito genérico. 
    private Set<Soldado> ejercito;

    public Ejercito() {
        //Herencia//Polimorfismo. 
        this.ejercito = new HashSet<>();
        //No puede haber dos soldados con el mismo nif. 
        //Guarda los objetos impidiendo la reptición cuando tenen == nif
        //Ademas no hya orden para saber donde está cada objeto. 
    }

    //Getter & Setter. 
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
        //MIRAR BIEN QUE PARAMETRO PASO POR EL CONTAINS. 
        return ejercito.contains(solAux);
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
//--------------------------------------------------------------------------------------------

    public void mostrarEjercito1() {
        //Está usando un objeto de tipo iterator. 
        for (Soldado s : ejercito) {
            System.out.println(s);
        }
    }

    //Método para recorrer colecciones sin orden. 
    public void mostrarEjercito2() {
        Soldado sAux;
        Iterator<Soldado> iterador = ejercito.iterator();
        while (iterador.hasNext()) {
            sAux = iterador.next();
            System.out.println(sAux);
        }
    }

}
