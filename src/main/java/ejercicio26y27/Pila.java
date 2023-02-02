/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26y27;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Pila<T> { //La T recibe cualquier tipo de objeto. 

    private List<T> listaGenerica;

    //A)Constructor que cree las pilas. 
    public Pila(/*Le quito lo que tiene por defecto para que al crearla siempre slaga vacio*/) {
        this.listaGenerica = new ArrayList<>();
    }

    //B)Método para apilar elemento, lo insertará donde proceda. 
    public void push(T elemento) { //Push = apilar/AñadirElementos.
        listaGenerica.add(elemento);
    }

    //C)Método para desapilar elemento de donde proceda. 
    public void pop(T elemento) {
        listaGenerica.remove(elemento);
    }

    //D)Método para saber si la pila está vacía o no. 
    public boolean estaVacia() {
        return this.listaGenerica.isEmpty();
    }

    //E)Método para saber si la pila está llena o no.
    public boolean estaLlena(int numeroElementos, int Capacidad) {
        //La capacidad de pilas se la dices tu. 
        boolean estaLlena = false;
        if (numeroElementos == Capacidad) {
            estaLlena = true;
        } else {
            estaLlena = false;
        }
        return estaLlena;

    }

    //F)Método para saber el numero de lementos que tiene la pila. 
    public int numeroelementos() {
        return this.listaGenerica.size();
    }

    //G)Método para mostrar los elementos con el orden en el que se han creado.
    public List<T> mostrarLista() {//Puedo poner ArrayList<T> o simplemente List<T>.
        List<T> lista = new ArrayList<>();

        for (T elemento : listaGenerica) {
            //System.out.println(elemento);
            lista.add(elemento);
        }
        return lista;
    }
    
    //H)

}
