/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosEstructurasAlmacenamiento;

import java.util.InputMismatchException;
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
        //Inicializo los valores para que no de error. 
        int contadorDePositivos = 0;
        int contadorDeNegativos = 0;
        int contadorDeCeros = 0;
        //Creo un nuevo array de 10 valores para que el usuario
        int[] numerosIntroducidosUsuario = new int[10];
        System.out.println("····································································································································································");
        guardarArray(numerosIntroducidosUsuario);
        mostrarArray(numerosIntroducidosUsuario);
        System.out.println("····································································································································································");
        //Contadores para los valores que el usuario introduzca, ya sean negativos, ceros o positivos. 
        contadorDePositivos = arrayNumerosPositivos(numerosIntroducidosUsuario);
        System.out.println("Ha introducido " + contadorDePositivos + " numeros positivos");
        System.out.println("····································································································································································");

        contadorDeNegativos = arrayNumerosNegativos(numerosIntroducidosUsuario);
        System.out.println("Ha introducido " + contadorDeNegativos + " numeros negativos");

        System.out.println("····································································································································································");
        contadorDeCeros = arrayCeros(numerosIntroducidosUsuario);
        System.out.println("Ha introducido " + contadorDeCeros + " ceros");

        System.out.println("····································································································································································");
        mediaPositivos(numerosIntroducidosUsuario);
        mediaNegativos(numerosIntroducidosUsuario);
    }
    //Importamos Scanner para no tener que inicializarlo en cada método.
    private static final Scanner teclado = new Scanner(System.in);

    public static int leerNumerosEnteros() {
        int numZ = 0;
        boolean repetir = true;
        do {
            System.out.println("Introduce el numero entero");
            //Controlar excepciones.
            try {
                numZ = teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
            }
        } while (repetir);
        return numZ;
    }

    //Se guardan en el array los numeros introducidos por el usuario
    public static void guardarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            origen[i] = leerNumerosEnteros();
        }

    }
    public static int arrayNumerosPositivos(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 0) {
                contador++;
            }
        }
        return contador;

    }
    public static int arrayNumerosNegativos(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int arrayCeros(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.println(" " + origen[i]);
        }
    }
    public static void mediaPositivos(int[] origen) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 0) {
                suma = (suma + origen[i]);
            }
        }
        //Controlar excepciones.
        try {
            media = suma / arrayNumerosPositivos(origen);
        } catch (ArithmeticException eme) {
            System.out.println("Operación imposible");
        }
        System.out.println("La media de los positivos es: " + media);
    }

    public static void mediaNegativos(int[] origen) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] < 0) {
                suma += origen[i];
            }
        }
        //Controlar excepciones.
        try {
            media = suma / arrayNumerosNegativos(origen);
        } catch (ArithmeticException eme) {
            System.out.println("Operación imposible");
        }
        System.out.println("La media de los negativos es: " + media);
    }
}
