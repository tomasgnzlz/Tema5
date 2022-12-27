package vehiculosT5;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tomas
 */
// Clase Genérica, srive para cualquier tipo de objeto. 
public class Catalogo<T> {// T, K o U --> indica que va a ir un tipo de dato: OBJETO. 

    protected List<T> lista;

    /*El mismo catálogo de vehiculo lo copio y lo dejo ahi, pero si que hay que
    ir cambiando una serie de nombres y variables para que no haya errores. 
     */
    //lista.size() es 0

    public Catalogo(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        //lista.size() es 0
    }

    public String toString() {
        String tmp = "";

        for (T objeto : this.lista) {

            if (objeto != null) {
                tmp += objeto.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroElementos() {
        return this.lista.size();
    }

    public boolean borrarElemento(T elemento) {
        int pos = buscarElemento(elemento);
        if (pos >= 0) {
            this.lista.remove(elemento);
            return true;
        }
        return false;
    }
    
//  SE QUITA XQ ES UN MÉTODO CONCRETO DE VEHICULOS, SOLO SE PONDRÁ EN LA CLASE HERENCIA DE CatalogoVehiculosHerencia. 
//    public Vehiculos buscarVehiculos(T elemento) {
//        Vehiculos aux = new Vehiculos();
//        aux.setBastidor(elemento);
//        int posicion = buscarElemento(aux);
//        return (posicion >= 0) ? this.lista.get(posicion) : null;
//    }

    public int buscarElemento(T elemento) {
        //Busqueda secuencial
        if (elemento != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (elemento.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirElemento(T elemento) {
        this.lista.add(elemento);
    }

}
