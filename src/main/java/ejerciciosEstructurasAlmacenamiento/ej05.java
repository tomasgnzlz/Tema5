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
public class ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hola;
        leerValores();

    }

    //Leer valores enteros e introducirlos en el array.
    public static void leerValores() {
        //Declaración del Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los numeros enteros");
        int numZ = teclado.nextInt();
        int[] dimensionArray = new int[10];

        for (int i = 0; i < dimensionArray.length; i++) {
            //Aqui en ves de poner el teclado.nextInt pongo el método que filtre todos los numeros con sus excepciones
            dimensionArray[i] = numIntroduce();
        }
    }

    public static int numIntroduce() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero entero");
        int numZ = teclado.nextInt();
        
        return numZ;
    }
}
