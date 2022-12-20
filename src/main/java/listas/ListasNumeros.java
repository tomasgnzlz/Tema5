/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ListasNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INTRODUCCIÓN ARRAYLIST VICO

        ArrayList<Integer> listaEnteros = new ArrayList<>();

        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);

        System.out.println("Tamaño de la lista: " + listaEnteros.size());
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println("Posición " + (i + 1) + ". Elemento: " + listaEnteros.get(i));
        }
        listaEnteros.add(0, Integer.SIZE);//Añande en un posición en contreta, eliminando lo que ocupe ese espacio. 
        listaEnteros.clear();//Lo borra todo

        if (listaEnteros.contains(7)) {//Te dice si ese eemento está dentro de la lista o no
            System.out.println("El 7 está en la lista");
        }


        int posicion = listaEnteros.indexOf(6);
        System.out.println("Posición del 6 en la lista" + posicion);

       
//        Integer numero = 10;
//        listaEnteros.remove(10);

//        
        
        listaEnteros.forEach(System.out::println);
        
        for (Integer num : listaEnteros) {
            System.out.print(" - " + num);
        }
    }

}
