/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejPracticaOrdenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tomas
 */
public class equis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo la lista en la que van a estar todos los objetos que vamos a comparar. 
        List<ClaseX> c1 = new ArrayList();
        //Creo esos objetos dentro del arrayList.
        c1.add(new ClaseX("Kia", "Kia", 4, 180, 183));
        c1.add(new ClaseX("Twingo", "Renault", 3, 58, 135));
        c1.add(new ClaseX("458 Spider", "Ferrari", 4, 570, 320));
        c1.add(new ClaseX("Huracan", "Lamborghini", 4, 640, 325));

        System.out.println("                         IMPRIMO LA LISTA                       ");
        //Para hacer cualquier tipo de ordenación, antes debo de ordenar está lista por su nombre/defecto. 
        c1.forEach(System.out::println);

        System.out.println("····························· BinarySearch ·····························");
        //
        Collections.sort(c1);
        //Creo el objeto del que quiero realizar la busqueda. 
        ClaseX objetoBuscarBinario = new ClaseX();
        objetoBuscarBinario.setVehiculos("twingo");
        int posicionObjeto = Collections.binarySearch(c1, objetoBuscarBinario);
        System.out.println("El vehiculo con el nombre " + objetoBuscarBinario.getVehiculos() + " se encuentra en la posición:" + posicionObjeto);
        System.out.println("\n");
        //Imprimo la lista creada. 
/*
        
        
        
         */
        System.out.println("                         ORDENO LA LISTA POR SU CILINDRADA                       ");

        Comparator<ClaseX> porMarca = (p1, p2) -> Long.compare(p1.getCilindrada(), p2.getCilindrada());
        Collections.sort(c1, porMarca);
        c1.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("                         ORDENO LA LISTA POR EL Nº DE RUEDAS                       ");
        Comparator<ClaseX> porNumeroRuedas = (p1, p2) -> Long.compare(p1.getNumeroRuedas(), p2.getNumeroRuedas());
        Collections.sort(c1, porNumeroRuedas);
        c1.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("                         ORDENO LA LISTA POR LA VELOCIDAD MÁXIMA                       ");
        Comparator<ClaseX> porVelocidad = (p1, p2) -> Long.compare(p1.getPotenciaMaxima(), p2.getPotenciaMaxima());
        Collections.sort(c1, porVelocidad);
        c1.forEach(System.out::println);
        System.out.println("\n");
    }

    /*
        Pasos crear Comparators:
            ·Nombre.
            ·El atributo que quiero comparar
        Y para mostrarlo con un sort. 
            ·La lista donde se encuentran dichos objetos.
            ·El comparator que dice que es lo que se va a comparar. 
    EJEMPLO: 
        ·Comparator<ClaseX> porVelocidad = (p1, p2) -> Long.compare(p1.VALORQQUIEROCOMPRBAR, p2.VALORCONELQUECOMPROBARELANTERIOR);  
        El lambda(->) no se ha explicado pero lo empezamos a implementar, ¿sirven para ordenar más de 1 atributo?
     */
}
