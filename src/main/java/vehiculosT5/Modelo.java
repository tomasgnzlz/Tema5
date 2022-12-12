/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
*/
package vehiculosT5;

import java.util.Random;

/**
 *
 * @author tomas
 */
public enum Modelo {
    //Creo los módelos de vehiculos a elegir. 
     SEAT_PANDA("Seat", "Panda", "48"),
     FORD_KUGA("Ford", "Kuga", "120"),
     SEAT_CUPRA("Seat", "Cupra", "95");
    
    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", cilindrada=").append(cilindrada);
        sb.append('}');
        return sb.toString();
    }
    //Método para escoger un vehiculo aleatorio. 
    public static Modelo getAleatorio(){
        Random r = new Random();
        Modelo[] modelos = Modelo.values();//Generá un array de todos los modelos del enum. 
//        for( int i = 0; i<modelos.lenght; i++){
//        System.out.println(modelos[i])
//        }
        int posicionValida = r.nextInt(0,modelos.length);
        return modelos[posicionValida];
        
    }

    
    
    
}
