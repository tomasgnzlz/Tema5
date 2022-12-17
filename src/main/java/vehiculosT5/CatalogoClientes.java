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
public class CatalogoClientes {

    private int numeroClientes;
    private Cliente[] listaClientes;

    public CatalogoClientes(int numClientes) {
        numClientes = Math.abs(numClientes);
        this.numeroClientes = numClientes;
        this.listaClientes = new Cliente[numClientes];
        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[i] = new Cliente();
        }
    }

    //ToString
    @Override
    public String toString() {
        String tmp = "";
        for (Cliente c : listaClientes) {
            if (c != null) {
                tmp += c.toString() + "\n";
            }
        }
        return tmp;
    }

    //Método para saber el numero de clientes que se han creado.
    public int getNumeroClientes() {
        return numeroClientes;
    }

    //Método para borrar clientes del catálogo.
    public void borrarCliente(Cliente c) {
        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.listaClientes[pos] = null;
            this.numeroClientes = numeroClientes--;//Cuando se elimine uno, que se borre del catálogo. 
        }
    }

    //Método para buscar clientes segun sus datos. 
    private int buscarCliente(Cliente c) {
        //Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNIF(nif);
        int posicion = buscarCliente(aux);
        return (posicion >= 0) ? this.listaClientes[posicion] : null;
    }

    //Método para añadir los clientes creados al catálogo. 
    public void anadirCliente(Cliente c) {
        //Si hay hueco, se inserta en el hueco

        if (this.numeroClientes < this.listaClientes.length) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] == null) {
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    System.out.println("Guardando cliente en posicion " + i);
                    break;
                }
            }
        } else {
            this.numeroClientes++;
            this.listaClientes = Arrays.copyOf(listaClientes,
                    this.numeroClientes);
            this.listaClientes[this.numeroClientes - 1] = c;
        }
    }

    //Método para copiar los datos de un array en otro array nuevo(privado). 
    private Cliente[] copiarArrays() {

        Cliente[] copy = new Cliente[this.numeroClientes + 1];

        for (int i = 0; i < this.listaClientes.length; i++) {
            copy[i] = this.listaClientes[i];
        }
        return copy;
    }

    public Cliente[] getListaClientes() {
        return listaClientes;
    }

}
