/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.Arrays;

/**
 *
 * @author tomas
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;

    //El constructor recibe el tamaño del catálogo e 
    //Inicializa la estructura de datos con vehiculos aleatorios.
    public CatalogoVehiculos(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;
        this.listaVehiculos = new Vehiculo[tamanio];
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }
    }

//    public void mostrarCatalogo() {
//        for (Vehiculos v : listaVehiculos) {
//            System.out.println(v);
//        }
//    }
    public String toString() {
        String tmp = "";
        for (Vehiculo v : listaVehiculos) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }
        }
        return tmp;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public boolean borrarVehiculo(Vehiculo v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.numeroVehiculos = numeroVehiculos--;
            this.listaVehiculos[pos] = null;
            return true;
        }
        return false;
    }

    public Vehiculo buscarVehiculos(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;
    }

    private int buscarVehiculo(Vehiculo v) {
        //Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (v.equals(this.listaVehiculos[i])) {
                    return i;
                }
            }
        }
        return -1;//Si no lo encuentra devuelve -1. 
    }

    //Añadir Vehiculo. 
    public void anadirVehiculo(Vehiculo v) {
        //Si hay hueco, se inserta en el hueco

        if (this.numeroVehiculos < this.listaVehiculos.length) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null) {
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    System.out.println("Guardando vehículo en posicion " + i);
                    break;
                }
            }
        } else {
            this.numeroVehiculos++;
            this.listaVehiculos = Arrays.copyOf(listaVehiculos, this.numeroVehiculos);
            this.listaVehiculos[this.numeroVehiculos - 1] = v;
        }
    }

    private Vehiculo[] copiar() {
        Vehiculo[] aux = new Vehiculo[this.listaVehiculos.length + 1];
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            aux[i] = this.listaVehiculos[i];
        }
        return aux;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

}
