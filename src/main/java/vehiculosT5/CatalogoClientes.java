/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

/**
 *
 * @author tomas
 */
public class CatalogoClientes {
    
    private int numeroClientes;
    private Cliente[] listaClientes;
    
    public CatalogoClientes( int tamanio){
        this.numeroClientes =  tamanio;
        tamanio = Math.abs(tamanio);
        this.listaClientes = new Cliente[tamanio];
        
        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[i] = new Cliente("Tomas", "Gnzlz", "AAAAA");
        }
    }
    
}
