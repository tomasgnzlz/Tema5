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

        System.out.println("------------------------------------- PAISES ----------------------------------------------------------------------------------");

        //Ordenación usando orden natural(Requiere que pais implemente comparable.)
        Collections.sort(paises);
        paises.forEach(System.out::println);

        System.out.println("---------------------------------------------- POBLACIÓN -------------------------------------------------------------------------");

        //PUEDO METER TODO ESO EN UN COMPARATOR PARA VERLO MÁS CLARO. 
        //Collections.sort(paises, (p1,p2)->Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        //Ordenación usando comparator(proporcionamos el citerio mediante una lambda)
        Comparator<Pais> cirterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Comparator<Pais> cirterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        //MAL//Comparator<Pais> cirterioNombre = (p1, p2) -> Long.compare(p1.getNombre().compareToIgnoreCase(p2.getNombre()), p2.getSuperficie());
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());

        //Ordenar por Población
        Collections.sort(paises, cirterioPoblacion);
        //Collections.sort(paises, cirterioPoblacion.reversed());
        paises.forEach(System.out::println);

        System.out.println("---------------------------------------------- SUPERFICIE -------------------------------------------------------------------------");

        //Ordenación por superficie.
        Collections.sort(paises, cirterioSuperficie);
        paises.forEach(System.out::println);

        //Ordenación por superficie, pero cuando se encuentra dos elementos con caracteres identicos utiliza otro criterio de referencia. 
        Collections.sort(paises, cirterioSuperficie.thenComparing(criterioNombre));
        paises.forEach(System.out::println);

        //###########Ordena la lista de paises por superficie y luego por población.
        //Collections.sort(paises, cirterioSuperficie);
        //Collections.sort(paises, cirterioPoblacion);
        //Cuando se pida que ordene por dos a la vez, mejor hacer esto. 
        Collections.sort(paises, cirterioSuperficie.thenComparing(cirterioPoblacion));

        System.out.println("---------------------------------------------- EJEMPLO BUSQUEDA BINARÍA -------------------------------------------------------------------------");
        //Busqueda por orden natural( por nombre)
        //La lista donde buscar la información debe de estar ordenada previamente
        //segun el criterio de orden natural (nombre)         --> Comparable en Pais. 
        Collections.sort(paises);//OrdenacionPorNombre
        paises.forEach(System.out::println);
        Pais objBuscar = new Pais();
        
        objBuscar.setNombre("Portugal");//Lista ordenada por nombre, busqueda por nombre, key es nombre.
        int posicion= Collections.binarySearch(paises, objBuscar);//No le paso el criterio xq ya lo tiene pais. 
        System.out.println("            PORTUGAL ESTA EN LA POSICIÓN: " + posicion);
        
        
        //SI INTENTO BUSCAR EN LA LISTA CON UN VALOR QUE NO ES NOMBRE, SE PUEDE OBTENER
        //UNA POSICIÓN ERRONEA. 
        
        objBuscar.setNombre("");
        objBuscar.setPoblacion(23);
        
        posicion= Collections.binarySearch(paises, objBuscar);//No le paso el criterio xq ya lo tiene pais. 
        System.out.println( "wHRRH                  "+posicion);//No me devuelve ninguno xq busca primero x nombre, y como el nombre está vacio y ninguno de los objetos creados es vacio ps no hay ninguno
        
        //Si ordeno la lista por un criterio y busco por otro, el resultado es inesperado
        posicion= Collections.binarySearch(paises, objBuscar, cirterioPoblacion); //eeste ya es de comparator
        System.out.println( "g24321H                  "+posicion);
        
        System.out.println("-------         ORDENACION Y  BUSQEDA X POBLACION           -------------------");
        //antes de unar binarySearch por poblacion la lista debe estar ordenada por población. 
        Collections.sort(paises,cirterioPoblacion);
        paises.forEach(System.out::println);
        objBuscar = new Pais();
        objBuscar.setPoblacion(146);
        posicion = Collections.binarySearch(paises,objBuscar, cirterioPoblacion);
        System.out.println("El país que tiene 146 millons de hbaitamtes es:              " + posicion);
        
        
        
    }
    //paises.forEach(System.out::println);

}
