/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5F;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class PruebaClaseEjercitoOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //COPIO EL MISMO MAIN QUE EL APARTADO A PERO COMPRUBEO QUE NO ME DEJE ALISTAR DOS SOLADOS IGUALES. 
        Ejercito ejercito = new Ejercito();

        //Se crea la lista donde estarán aquellso soldados que se vayan a alistar. 
        ArrayList<Soldado> soldados = new ArrayList<>();
        //Se crean los Soldados. 
        Soldado s1 = new Soldado(1, "Tomas", "Gonzalez", "Atienza", 19);
        Soldado s2 = new Soldado(2, "Ariel", "Gonzalez", "Atienza", 19);
        Soldado s5 = new Soldado(5, "Juan", "Herrera", "Martines", 49);
        Soldado s6 = new Soldado(6, "Carlos", "Navarro", "Herrera", 59);
        Soldado s7 = new Soldado(7, "Antonio", "Martines", "Navarro", 69);
        Soldado s3 = new Soldado(3, "Juan", "Hernandes", "Messi", 29);
        Soldado s4 = new Soldado(4, "Marta", "Morales", "Gonzalez", 39);

        //Uso del método para alistar soldados y añadirlos a la listaSoldadosAlistados. 
        ejercito.alistarSoldado(s1);
        ejercito.alistarSoldado(s2);
        ejercito.alistarSoldado(s4);
        ejercito.alistarSoldado(s5);
        ejercito.alistarSoldado(s6);
        ejercito.alistarSoldado(s7);
        ejercito.alistarSoldado(s3);

        //Uso del método nº de soldados que hay en el ejercito.
        int numSoldados = ejercito.numeroSoldados();
        System.out.println("El ejercito tiene " + numSoldados + " alistados." + "\n");
        //Uso del método para  ver si el ejercito está vacío o no. 
        boolean estadoEjercito = ejercito.ejercitoVacio();
        System.out.println("¿El ejerctito está vacío? " + estadoEjercito + "\n");

        //Uso del método para comprobar que un soldado está en el Ejercito. 
        boolean esta = ejercito.soldadoEnEjercito(7);
        System.out.println("¿Está el soldado con el nif 7 en el ejercito? " + esta + "\n");

        //Uso del método que Muestra en una lista todos los sodlados alistados.
        soldados = ejercito.sacarArrayListSoldado();
        ejercito.getEjercito().forEach(System.out::println);
        System.out.println(" ");

        //Uso del método para eliminar soldados de la lista. 
        ejercito.eliminarSoldados(7);
        numSoldados = ejercito.numeroSoldados();
        soldados = ejercito.sacarArrayListSoldado();
        ejercito.getEjercito().forEach(System.out::println);
        System.out.println(" ");
        //Si sale un soldado menos que en el método anterior quiere decir que nuestro metodo funciona. 
        System.out.println("El ejercito tiene " + numSoldados + " alistados." + "\n");

//································································································································
        Soldado s8 = new Soldado(7, "Antonio", "Martines", "Navarro", 69);
        ejercito.alistarSoldado(s8);
        //Imprimo la lista de soldados
        ejercito.getEjercito().forEach(System.out::println);
        //Como el solado con ese nombre ya está alistado no lo añade a la lista de soldados. 

        /*
        ME FALTA ORDENARLO CON EL COMPARATOR QUE SERÍA EL ORDEN NATURAL DE LOS SET. 
         */
    }

}
