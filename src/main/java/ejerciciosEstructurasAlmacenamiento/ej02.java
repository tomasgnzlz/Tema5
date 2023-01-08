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
public class ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro un scanner para introducir los datos del ejercicio. 
        Scanner teclado = new Scanner(System.in);
        int[] alturaArray = new int[5];
        int altura;
        for (int j = 0; j < alturaArray.length; j++) {
            System.out.println("Introduce tu altura por favor");
            altura = teclado.nextInt();
            alturaArray[j] = altura;
        }

        //Bucle para recorrer el array formado y mostrar los datos del mismo. 
        for (int i = 0; i < alturaArray.length; i++) {
            System.out.println("La altura de la " + (i + 1) + " persona es:" + alturaArray[i]);
        }
        //Se realizará la media de alturas. 
        //Bucle para sumar todas las alturas que se han registrado
        int sumaAlturas = 0;
        for (int i = 0; i < 5; i++) {
            sumaAlturas += alturaArray[i];
        }
        System.out.println("La suma de todas las alturas juntas es: " + sumaAlturas);
        System.out.println("Ahora realizaremos la media de las alturas registradas.");
        double mediaAlturas = (sumaAlturas / alturaArray.length);
        System.out.println("La media total de las alturas es: " + mediaAlturas);
    }

}
