/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosEstructurasAlmacenamiento;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej08 {

    /**
     * @param args the command line arguments
     */
    /*
    Ejemplo: 
        ·Se inbtroduce por teclado el nº 4. (Se crea un array de 4)
        ·Se lo rellena con los valores 5,4,3,2 que producirán la siguiente salida:
            *****
            ****
            ***
            **
     */
    public static void main(String[] args) {
        //Creamos un Scanner para pèdir pro consola un número y posterioirmente, rellenar el array. 
        Scanner teclado = new Scanner(System.in);
        String resultado;
        System.out.println("¿De que tamaño desea que sea el Array?");
        int tamanio = teclado.nextInt();
        System.out.println("·············································································································");
        //Se crea array cuyo tamaño será el número introducido por el usuario.
        int arrayDeseado[] = new int[tamanio];
        //Una vez se tiene el array del tamaño deseado hay que rellenarlo
        //con valores numericos. 
        for (int i = 0; i < arrayDeseado.length; i++) {
            arrayDeseado[i] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(arrayDeseado));

        if (arrayDeseado.length == 1) {
            System.out.println("*");
        } else if (arrayDeseado.length == 2) {
            System.out.println("**");
        } else if (arrayDeseado.length == 3) {
            System.out.println("***");
        } else if (arrayDeseado.length == 4) {
            System.out.println("****");
        } else if (arrayDeseado.length == 5) {
            System.out.println("*****");
        } else if (arrayDeseado.length == 6) {
            System.out.println("*******");
        } else if (arrayDeseado.length == 7) {
            System.out.println("*******");
        } else if (arrayDeseado.length == 8) {
            System.out.println("********");
        } else if (arrayDeseado.length == 9) {
            System.out.println("*********");
        } else if (arrayDeseado.length == 10) {
            System.out.println("**********");
        } else {
            System.out.println("BOBO");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}