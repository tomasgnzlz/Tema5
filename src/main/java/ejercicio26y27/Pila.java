/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26y27;

import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Pila<T> { //La T recibe cualquier tipo de objeto. 

    private List<T> listaGenerica;
    private int tamanio;
    //METER EL ATRIBUTO PILA.
    //A)Constructor que cree las pilas. 
    public Pila(int tamanio/*Le quito lo que tiene por defecto para que al crearla siempre slaga vacio*/) {
        tamanio = Math.abs(tamanio);
        this.listaGenerica = new ArrayList<>();
        this.tamanio = tamanio;
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
//    public List<T> mostrarLista() {//Puedo poner ArrayList<T> o simplemente List<T>.
//        List<T> lista = new ArrayList<>();
//
//        for (T elemento : listaGenerica) {
//            //System.out.println(elemento);
//            lista.add(elemento);
//        }NO VALE
//        return lista;
//    }
    //G)Método para mostrar los elementos con el orden en el que se han creado.
    public void mostrarListaPila(){ //Recibe un array cualquiera/Genérico. 
        for (int i = listaGenerica.size() - 1; i < 0; i++) {
            System.out.println(listaGenerica.get(i));
        }
    }
    
    //H)Método que  almacena en la pila...¿?
    public void rellenarArray( T [] aux){
        int numElementos = aux.length;
        if (numElementos <= tamanio ) {
            for (int i = 0; i < numElementos; i++) {
                push(aux[i]);
            }
        }else{
            System.out.println("***");
        }
    }
    
    //G) Método para sacar elementos de la pila. 
    public Object[] sacarElementosPila(){
        Object[] elementos = this.listaGenerica.toArray();
        this.listaGenerica.clear();
        return elementos;
    }

}
