/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosMatrices;

import java.util.ArrayList;
import java.util.List;
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
        //Se piden los valores por consola. 
        dimensionMatriz = pedirValoresMatrizSinErrores();
        //Se crea la matriz con los valores introducidos por teclado.
        int[][] matriz = new int[dimensionMatriz][dimensionMatriz];
        //Se rellena la matriz automáticamente. 
        rellenarMatricesAutomatico(matriz);
        System.out.println("········· NORMAL ·········");
        imprimirMatriz(matriz);
        System.out.println("········· MATRICES SOLO CON SUS DIAGONALES ·········");
        recorrerDiagonalPrincipal(matriz);
        System.out.println("\n");
        recorrerDiagonalSecundaria(matriz);

//////////////······················································································································
////////////        int[][] matriz = {
////////////            {4, 6, 3, 2},
////////////            {5, 9, 7, 6},
////////////            {4, 4, 1, 1},
////////////            {0, 3, 6, 8}
////////////        };
////////////        
////////////        mostrar(matriz);
////////////        List<Integer> diagonal = elementosDiagonalPrincipal(matriz);
////////////        diagonal.forEach(System.out::println);
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
    private static void imprimirMatriz(int[][] matriz) {
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
    private static void recorrerDiagonalPrincipal(int[][] matrizX) {
        int a;
        for (int i = 0; i < matrizX.length; i++) {
            a = matrizX[i][i];
            System.out.println(a);
//            for (int j = 0; j < matrizX.length; j++) {
//
//                System.out.println("Número: " + matrizX[i][j]);
//            }
        }
    }

    //Método para recorrer solo las diagonales de la matriz.
    private static void recorrerDiagonalSecundaria(int[][] matrizX) {
        int a;
        for (int i = 0; i < matrizX.length; i++) {
            a = matrizX[i][((matrizX.length - 1) - i)];
            System.out.println(a + " ");

        }
    }

    /*
    
    
    //MÉTODOS VICO // MÉTODOS VICO // MÉTODOS VICO // MÉTODOS VICO // MÉTODOS VICO // MÉTODOS VICO.
    
    
     */
    //Método para mostrar los elementos de la diagonal principal de la matriz. 
    public static List<Integer> elementosDiagonalPrincipal(int[][] matriz) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < matriz.length; i++) {
            lista.add(matriz[i][i]);
        }
        return lista;
    }

    //Método para mostrar los elementos de la diagonal secundaria de la matriz. 
    public static int[] elementosDiagonalSecundaria(int[][] m) {
        int[] array = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            array[i] = m[i][m.length - 1 - i];
        }
        return array;
    }
}
