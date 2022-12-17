/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class CatalogoAlquiler {
    //Declaro aquellas variables que serán necesarias en el proyecto. 
    private int numeroAlquiler;
    private Alquileres[] listaAlquiler;

    //El constructor recibe el tamaño del catálogo e 
    //Inicializa la estructura de datos con vehiculos aleatorios.
    public CatalogoAlquiler(int tamanio) {
        this.numeroAlquiler = 0;
        tamanio = Math.abs(tamanio);
        this.listaAlquiler = new Alquileres[tamanio];
    }

//    public void mostrarCatalogo() {
//        for (Vehiculos v : listaVehiculos) {
//            System.out.println(v);
//        }
//    }
    @Override
    public String toString() {
        String tmp = "";
        for (Alquileres a : listaAlquiler) {
            if (a != null) {
                tmp += a.toString() + "\n";
            }
        }
        return tmp;
    }

    public int getNumeroAlquiler() {
        return numeroAlquiler;
    }

    public Alquileres buscarAlquiler(int id) {
        Alquileres aux = new Alquileres();
        aux.setAlquilerID(id); //Para encontrar a la persona que tenga el nombre que se solicita. 
        int posicion = buscarAlquiler(aux);
        return (posicion >= 0) ? this.listaAlquiler[posicion] : null;
    }

    
    public boolean borrarAlquiler(Alquileres a) {
        int posicion = buscarAlquiler(a);
        if (posicion >= 0) {

            this.listaAlquiler[posicion] = null;
            this.numeroAlquiler--;
            return true;
        }
        return false;
    }

    private int buscarAlquiler(Alquileres a) {
        //Búsqueda secuencial
        if (a != null) {
            for (int i = 0; i < this.listaAlquiler.length; i++) {
                if (this.listaAlquiler[i] != null && a.equals(this.listaAlquiler[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirAlquiler(Alquileres a) {
        //Si hay hueco, se inserta en el hueco

        if (this.numeroAlquiler < this.listaAlquiler.length) {
            for (int i = 0; i < this.listaAlquiler.length; i++) {
                if (this.listaAlquiler[i] == null) {
                    this.listaAlquiler[i] = a;
                    this.numeroAlquiler++;
                    System.out.println("Guardando cliente en posicion " + i);
                    break;
                }
            }
        } else {
            this.numeroAlquiler++;
            this.listaAlquiler = Arrays.copyOf(listaAlquiler,
                    this.numeroAlquiler);
            this.listaAlquiler[this.numeroAlquiler - 1] = a;
        }
    }
}
