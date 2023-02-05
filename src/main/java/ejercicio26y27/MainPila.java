/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26y27;

/**
 *
 * @author tomas
 */
public class MainPila {

    public static void main(String[] args) {
        //Se crea la pila en cuestión
        Pila<String> stringPila = new Pila(5);
        
        //Prueba del Método para añadir elementos a la pila.
        stringPila.push("1");
        stringPila.push("5");
        stringPila.push("3");
        stringPila.push("7");
        stringPila.push("9");
        stringPila.mostrarListaPila();
        
        //Prueba del Método para eliminar elementos de la pila. 
        stringPila.pop("7");
        System.out.println("Elementos de la lista tras eliminar el elemento 7: ");
        stringPila.mostrarListaPila();
        System.out.println("La lista tiene "+stringPila.numeroelementos() + " elementos");
        stringPila.push("6");//Este elemento debería de salir el primero de la lista.
        System.out.println("Una vez añadimos el elemento 6, este deberia de salir el primero en la lista ");
        stringPila.mostrarListaPila();
    }    
}
