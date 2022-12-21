/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

/**
 *
 * @author tomas
 */
public class CatalogoClientesHerencia extends Catalogo<Cliente> {
    
    //Esto lo pongo para que el super llama al constructor de la clase padre.
    public CatalogoClientesHerencia(int tamanio) {
        super(tamanio);
        //La clase padre es catálogo. 
        for (int i = 0; i < tamanio; i++) {
            this.anadirElemento(new Cliente());
        }
    }
    
    //Método exclusivo de la clase Cliente, por eso se mete dentro de está clase.
    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNIF(nif);
        //int posicion = buscarCliente(aux);
        int posicion = buscarElemento(aux);
        //return (posicion >= 0) ? this.listaClientes[posicion] : null;
        return (posicion >=0) ? this.lista.get(posicion) : null;
    }
    
    //Método para copiar los datos de un array en otro array nuevo(privado). 
//    private Cliente[] copiarArrays() {
//
//        //Cliente[] copy = new Cliente[this.numeroClientes + 1];
//        Cliente[] copy = new Cliente[this.getNumeroElementos()];
//
//        for (int i = 0; i < this.listaClientes.length; i++) {
//            copy[i] = this.listaClientes[i];
//        }
//        return copy;
//    }
//
//    public Cliente[] getListaClientes() {
//        return listaClientes;
//    }
}
