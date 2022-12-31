/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class CatalogoAlquilerHerencia extends Catalogo<Alquileres> {

    //Esto lo pongo para que el super llama al constructor de la clase padre.
    public CatalogoAlquilerHerencia(int tamanio) {
        super(tamanio);
        //La clase padre es catálogo. 
        for (int i = 0; i < tamanio; i++) {
            //this.anadirElemento(new Alquiler());
            this.anadirElemento(new Alquileres());
        }
    }

    //Método exclusivo de la clase Alquileres. 
    public Alquileres buscarAlquiler(int id) {
        Alquileres aux = new Alquileres();
        aux.setAlquilerID(id); //Para encontrar a la persona que tenga el nombre que se solicita. 
        //int posicion = buscarAlquiler(aux);
        int posicion = buscarElemento(aux);
        //return (posicion >= 0) ? this.listaAlquiler[posicion] : null;
        return (posicion >= 0) ? this.lista.get(id) : null;
    }
     public List<Alquileres> buscarAlquilerNif(String nif) {
        List<Alquileres> listaClientes = new ArrayList<Alquileres>();

        Cliente clienteAux = new Cliente();
        clienteAux.setNIF(nif);

        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getCliente().equals(clienteAux)) {
                listaClientes.add(this.lista.get(i));
            }
        }
        return listaClientes;
    }
}
