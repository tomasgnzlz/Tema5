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
public class Equis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FBDFYN
        //Creo la lista en la que van a estar todos los objetos que vamos a comparar. 
        List<ClaseX> c1 = new ArrayList();
        //Creo esos objetos dentro del arrayList.
        c1.add(new ClaseX("CCCC", "Kia", 4, 180, 183));
        c1.add(new ClaseX("458 Spider", "Ferrari", 8, 570, 320));
        c1.add(new ClaseX("Twingo", "Renault", 3, 58, 135));
        c1.add(new ClaseX("Huracan", "Lamborghini", 5, 640, 325));
        //
        //c1.forEach(System.out::println);
        System.out.println("                         ORDENO LA LISTA POR SU NOMBRE                       ");
        Collections.sort(c1);
        c1.forEach(System.out::println);

        //Comparators. (Long es para números)
        Comparator<ClaseX> porNombre = (p1, p2) -> p1.getVehiculos().compareToIgnoreCase(p2.getVehiculos());
        Comparator<ClaseX> porMarca = (p1, p2) -> p1.getMarca().compareToIgnoreCase(p2.getMarca());
        Comparator<ClaseX> porCilindrada = (p1, p2) -> Long.compare(p1.getCilindrada(), p2.getCilindrada());
        Comparator<ClaseX> porNumeroRuedas = (p1, p2) -> Long.compare(p1.getNumeroRuedas(), p2.getNumeroRuedas());
        Comparator<ClaseX> porVelocidad = (p1, p2) -> Long.compare(p1.getPotenciaMaxima(), p2.getPotenciaMaxima());

        //Creo aquello que me será necesario para realizar las ordenaciones y las busquedas. 
        ClaseX objetoBuscarBinario = new ClaseX();
        int posicionObjeto;

        Collections.sort(c1);

        System.out.println("                            ORDENO POR NOMBRE DE VEHICULOS");
        Collections.sort(c1, porNombre);
        c1.forEach(System.out::println);
        //Busqueda binaria por nombre.
        objetoBuscarBinario.setVehiculos("Huracan");
        posicionObjeto = Collections.binarySearch(c1, objetoBuscarBinario);
        System.out.println("Huracan se encuentra en la posicion: " + posicionObjeto + "\n");

        System.out.println("                            ORDENO POR Nº RUEDAS DE VEHICULOS");
        Collections.sort(c1, porNumeroRuedas);
        c1.forEach(System.out::println);
        //Busqueda binaria por nº ruedas. 
        objetoBuscarBinario.setNumeroRuedas(4);
        posicionObjeto = Collections.binarySearch(c1, objetoBuscarBinario, porNumeroRuedas);
        System.out.println("El Vehiculo con 4 ruedas está en la posición: " + posicionObjeto + "\n");

        System.out.println("                            ORDENO POR CILINDRADA DE VEHICULOS");
        Collections.sort(c1, porCilindrada);
        c1.forEach(System.out::println);
        //Busqueda binaria por cilindrada
        objetoBuscarBinario.setCilindrada(570);
        posicionObjeto = Collections.binarySearch(c1, objetoBuscarBinario, porCilindrada);
        System.out.println("El vehiculo con cilindrada " + objetoBuscarBinario.getCilindrada() + " está en la posición: " + posicionObjeto + "\n");

        System.out.println("                            ORDENO POR VELOCIDAD MÁXIMA DE VEHICULOS");
        Collections.sort(c1, porVelocidad);
        c1.forEach(System.out::println);
        //Busqueda binaria por velocidad máxima de vehiculos. 
        objetoBuscarBinario.setPotenciaMaxima(320);
        posicionObjeto = Collections.binarySearch(c1, objetoBuscarBinario, porVelocidad);
        System.out.println("El vehiculo con cilindrada " + objetoBuscarBinario.getPotenciaMaxima() + " está en la posición: " + posicionObjeto + "\n");

        System.out.println("\n");

    }

}
