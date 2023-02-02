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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea la pila en cuestión
        Pila p1 = new Pila();
        
        //Prueba del Método para añadir elementos a la pila.
        p1.push(1);
        p1.push(5);
        p1.push(3);
        p1.push(7);
        p1.push(9);
        System.out.println("Elementos de la lista: "+p1.mostrarLista());
        
        //Prueba del Método para eliminar elementos de la pila. 
        p1.pop(7);
        System.out.println("Elementos de la lista tras eliminar el elemento 7: " + p1.mostrarLista());
        System.out.println("La lista tiene "+p1.numeroelementos() + " elementos");
        p1.push(6);//Este elemento debería de salir el primero de la lista.
        System.out.println("Una vez añadimos el elemento 6, este deberia de salir el primero en la lista " + p1.mostrarLista());
        //TERMINAR
    }    
}
