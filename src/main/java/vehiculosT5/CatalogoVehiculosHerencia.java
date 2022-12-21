/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import vehiculosT5.Vehiculo;

/**
 *
 * @author tomas
 */
public class CatalogoVehiculosHerencia extends Catalogo<Vehiculo> {
    //En esta clase van a ir solamente

    public CatalogoVehiculosHerencia(int tamanio) {
        super(tamanio);
        //Esto lo pongo para que el super llama al constructor de la clase padre.
        //La clase padre es catálogo. 
        for (int i = 0; i < tamanio; i++) {
            this.anadirElemento(new Vehiculo());
        }
    }

    public Vehiculo buscarVehiculos(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = this.buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    

}
