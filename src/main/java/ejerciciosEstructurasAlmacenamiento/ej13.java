/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosEstructurasAlmacenamiento;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Si en el array hay 3 1, entonces se deben de escribir ***
        Si en el array hay 1 5, se debe escribir 5: *****
        Y asi sucesivamente dependiendo del numero de espacios del array y de
        los valores que se hayan introducido
         */
        Scanner teclado = new Scanner(System.in);
        int espacioArray;
        espacioArray = pedirEntero();
        int[] array = new int[espacioArray];
        //Bucle for para enseñar el array que se haya creado. 
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        
    }

    public static int pedirEntero() {
        Scanner teclado = new Scanner(System.in);
        int entero;
        System.out.println("Introduce el numero de espacios que tendrá el Array");
        entero = teclado.nextInt();
        return entero;
    }

}
