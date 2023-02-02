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
public class Pila<E> {

     private List<E> listaGenerica;

//  A)Constructor que cree las pilas. 
    public Pila(/*Le quito lo que tiene por defecto para que al crearla siempre slaga vacio*/) {
        this.listaGenerica = new ArrayList<>();
    }
    
//  B)
    
    
    //D)Método para saber si la pila está vacía o no. 
    public boolean estaVacia(){
        return this.listaGenerica.isEmpty();
    }
    
    
    
    
    
    
}
