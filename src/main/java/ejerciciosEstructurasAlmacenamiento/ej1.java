/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosEstructurasAlmacenamiento;

/**
 *
 * @author tomas
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro e inicializo el array deseado. 
        int [] numeros = {1, 2, 3, 4, 5, 6};
        //Creo un bucle for para recorrer todo el array y enseñar sus valores. 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        //Creo una variable que me ayudará a sumar los valores del array. 
        System.out.println("");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
//            suma = numeros[i] + suma;
            suma += numeros[i];
        }
        System.out.println("La suma de todos los numeros del array es " + suma);
    }
    
}
