/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author tomas
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No se puede poner int, ha de ser integer ya que el int es primitivo. 
        Map<String, Integer> nombresEdades = new HashMap<>();
        nombresEdades.put("Vico", 25);
        nombresEdades.put("Vico", 55);//El putt tb reemplaza el dato si este ya existe. 
        nombresEdades.put("Lucas", 25);
        System.out.println("Nº de elementos Map: " + nombresEdades.size());

        //Recorrer el Map para mostrar valores.
        for (Map.Entry<String, Integer> filaMap : nombresEdades.entrySet()) {//entryset me devuelve un set(conjunto de filas desordenadas) de entradas, entradas que son unicas. 
            String key = filaMap.getKey();
            Integer value = filaMap.getValue();

            System.out.println("Key: " + key + " ··  Value: " + value);
        }

        System.out.println("                    Conjunto de claves unicas");

        for (String key : nombresEdades.keySet()) {
            System.out.println("Key: " + key);
        }
        //Necesito crear un objeto collections.
        System.out.println("                    Colección de values");
        Collection<Integer> coleccionEdades = nombresEdades.values();
        for (Integer Edad : coleccionEdades) {
            System.out.println("Values: " + Edad);
        }
        
        //Lista de edades. 
        List<Integer> listaEdades = new ArrayList<>(nombresEdades.values());
        //nombresEdades.replace --> SOLO FUNCIONA SI ESA KEY YA ESTÁ CREADA, SI NO ESTÁ NO VA A FUNCIONAR. 
        //PASAR SET A LIST NSQ JUANDIEGO
        
    }

}

//Si pide que devuelva una lista le vale la lista o el ArrayList
