/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploBurbuja;

import java.util.Arrays;

/**
 *
 * @author tomas pene
 */
public class OrdenacionArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = {6, 5, 3, 1, 2};
        System.out.println("Mostrar array desordenado " + Arrays.toString(numeros));
        ordenarBurbuja(numeros);
        //tbn ordena los numerosr
        Arrays.sort(numeros);
        System.out.println("Mostrar array ordenado " + (Arrays.toString(numeros)));
        System.out.println("········································································");
        System.out.println("                    BUSQUEDA DE NÚMEROS Y SU POSICIÓN");
        System.out.println("········································································");
        int pos = busquedaSecuencial(numeros, 1);
        System.out.println("El 10 está en la posición: " + pos);
        
        if (pos >= 0) {
            System.out.println("El elemento de la posición " + pos + " es " + numeros[pos]);
        }
        System.out.println(" ");
        
        int posicion = Arrays.binarySearch(numeros, 5);
        System.out.println(" " + posicion);
        posicion = Arrays.binarySearch(numeros, 15);
        System.out.println(" " + posicion);
        
        
        
        
        System.out.println(" ");

        pos = busquedaSecuencial(numeros, 3);
        System.out.println("El 3 está en la posición: " + pos);
        
        if (pos >= 0) {
            System.out.println("El elemento de la posición " + pos + " es " + numeros[pos]);
        }
        
        
        System.out.println("  ");
        pos = busquedaSecuencial(numeros, 30);
        System.out.println("El 30 está en la posición: " + pos);
        //Si el número que buscamos no está dentro del array el programa mostrará -1. 
        if (pos >= 0) {
            System.out.println("El elemento de la posición " + pos + " es " + numeros[pos]);
        }

    }
    //Método para ordenar el conjunto de números dentro de un array. 
    public static void ordenarBurbuja(int numeros[]) {

        int tmp;
        //Se pone -i para que llegue al penultimo número del array, de lo contrario se saldría ya que en el bucle posterior
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }
    }

    //Posición en el array. 
    //Si hay varios, devuelve la primera. 
    //Si no existe devuelve -1. 
    public static int busquedaSecuencial(int[] array, int numeroBuscar) {
        int indice = -1;
        for (int i = 0; i < array.length; i++) {
            //Recorremos el array completo
            if (numeroBuscar == array[i]) {//Lo he encontrado
                indice = i; //Guarda la posición para devolverla. 
                break;
            }
        }
        return indice;
    }
}
