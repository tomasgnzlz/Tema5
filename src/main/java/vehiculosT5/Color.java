/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vehiculosT5;

import java.util.Random;

/**
 *
 * @author tomas
 */
public enum Color {
    ROJO, AZUL, AMARILLO;
    public static Color getAleatorio(){
        Random r = new Random();
        //Genera un array de todos los colores del enum. 
        Color[] colores = Color.values();

        int posicion = r.nextInt(0,colores.length);
        //Devuelvo un color dependiendo la posición en la que este el numero random. 
        return colores[posicion];
    }
    
}
