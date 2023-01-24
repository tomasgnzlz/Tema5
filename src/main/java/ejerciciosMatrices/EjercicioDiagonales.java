/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosMatrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class EjercicioDiagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dimensionMatriz;
        dimensionMatriz = pedirValoresMatrizSinErrores();
        int[][] matriz = new int[dimensionMatriz][dimensionMatriz];
        rellenarMatricesAutomatico(matriz);
        System.out.println("········· NORMAL ·········");
        imprimirMatrizMatrices(matriz);
        System.out.println("········· MATRIZ SOLO CON SUS DIAGONALES ·········");

    }

    //Método para pedir las dimensiones de la matriz. 
    private static int pedirValoresMatrizSinErrores() {

        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduce la dimensión que buscas en la matriz");
        n = teclado.nextInt();

        return n;
    }

    //Método para rellenar matrices automáticamente. 
    private static void rellenarMatricesAutomatico(int[][] matrizRandom) {
        Random random = new Random();
        for (int i = 0; i < matrizRandom.length; i++) {
            for (int j = 0; j < matrizRandom[i].length; j++) {
                matrizRandom[i][j] = random.nextInt(0, 21);
            }
        }

    }

    //Método  para imprimir las matrices. 
    private static void imprimirMatrizMatrices(int[][] matriz) {
        /*
        Con el primer bucle for recorro el primer array y con el otro aray 
        recorro la parte de la matriz que me queda por recorrer. 
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //Método para recorrer solo las diagonales de la matriz.
    private static void recorrerDiagonalesMatriz(int[][] matrizX) {
        for (int i = 0; i < matrizX.length; i++) {
            
            
            for (int j = 0; j < matrizX.length; j++) {

            }
        }
    }

}
