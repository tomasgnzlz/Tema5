/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacionBusqueda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tomas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        //Se crean los paises que se compararán. 
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dolar Americnao"));
        paises.add(new Pais("Vietnam", 46, 505_400, "Euro"));
        System.out.println("···································· NORMAL ····································");
        paises.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        //Ordenación usando orden natural(Requiere que pais implemente comparable.)
        Collections.sort(paises);
        paises.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        //Ordenar por Población
        //Ordenación usando comparator(proporcionamos el citerio mediante una lambda)
        /*
        PUEDO METER TODO ESO EN UN COMPARATOR PARA VERLO MÁS CLARO. 
        //Collections.sort(paises, (p1,p2)->Long.compare(p1.getPoblacion(), p2.getPoblacion()));
         */
        Comparator<Pais> cirterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Comparator<Pais> cirteriosuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> cirterionombre = (p1, p2) -> Long.compare(p1.getNombre().compareToIgnoreCase(p2.getNombre()), p2.getSuperficie());

        Collections.sort(paises, cirterioPoblacion);
        //Collections.sort(paises, cirterioPoblacion.reversed());
        paises.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        //Ordenación por superficie
        Collections.sort(paises, cirteriosuperficie);
        paises.forEach(System.out::println);

        Collections.sort(paises, cirteriosuperficie.thenComparing(cirterionombre));
        paises.forEach(System.out::println);

    }

}
