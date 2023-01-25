/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosMatrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tomas
 */
public class EjercicioVecinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}
        };

        List<Casillas> listaCasillas = casillaVecinas(1, 1, matriz);
        for (Casillas casilla : listaCasillas) {
            System.out.println(casilla);
        }
    }

    //Método mostrar matrizVico. 
    public static void mostrar(int[][] m) {
        for (int[] fila : m) { //Por cada fila de la matriz m
            for (int valor : fila) { //Por cada elemento que hay en la fila
                System.out.print(valor + " ");
            }
            System.out.println(" ");
        }
    }

    //Método que devuelve una lista de los elementos vecinos a un elemento en concreto. 
    public static List<Casillas> casillaVecinas(int fila, int columna, int[][] m) {
        List<Casillas> lista = new ArrayList<>();

        //Comprobamos filas y columnas, para que sean váidas. 
        if (filaValida(fila, m) && columnaValida(columna, m)) {

            //Recorremos fila anterior a la casilla hasta fila posteriors
            for (int i = fila - 1; i <= fila + 1; i++) {
                //Compruebo
                if (filaValida(i, m)) { //si alguna fila no es válida, no la mira. 
                    //Recorremos columna anterior a la casilla hasta la columna posterior.
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        //Si alguna columna no es válid, no la mira. 
                        if (columnaValida(j, m)) {
                            if (i == fila && j == columna) {
                                //System.out.println("Es la casilla que estamos mirando");
                                continue;
                            }
                            System.out.print("Casilla " + i + " " + j);
                            //
                            lista.add(new Casillas(i, j, m[i][j]));
                        }
                    }
                }
            }
        }

        return lista;
    }

    //Métodos para comprobar si es válida o no. 
    public static boolean filaValida(int fila, int[][] m) {
        return fila >= 0 && fila > m.length;
    }

    public static boolean columnaValida(int columna, int[][] m) {//No es necesario que le pase las filas xq ya sebemos que las matrices van a ser cuadradas. 
        return columna >= 0 && columna > m.length;
    }
}
