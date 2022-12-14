/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.Objects;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Empresa {

    private String cif;
    private String nombre;
    private CatalogoVehiculosHerencia catalogoVehiculo;
    private CatalogoClientesHerencia catalogoCliente;
    private CatalogoAlquilerHerencia catalogoAlquiler;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;//ççççç
    }

    public Empresa(String nombre) {
        //8números y una letra. 
        this.cif = RandomStringUtils.randomAlphanumeric(8)
                + RandomStringUtils.randomAlphabetic(1);
        this.nombre = nombre;
        this.catalogoVehiculo = new CatalogoVehiculosHerencia(5);
        this.catalogoCliente = new CatalogoClientesHerencia(5);
        this.catalogoAlquiler = new CatalogoAlquilerHerencia(5);
    }

    public Empresa() {
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogoVehiculosHerencia getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public void setCatalogoVehiculo(CatalogoVehiculosHerencia catalogoVehiculo) {
        this.catalogoVehiculo = catalogoVehiculo;
    }

    //COMO HE ELIMINADO LA CLASE CatalogoClientes me da error, pero solo he de poner CatalogoClientesHerencia. 
    public CatalogoClientesHerencia getCatalogoCliente() {
        return catalogoCliente;
    }

    public void setCatalogoCliente(CatalogoClientesHerencia catalogoCliente) {
        this.catalogoCliente = catalogoCliente;
    }

    public CatalogoAlquilerHerencia getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCatalogoAlquiler(CatalogoAlquilerHerencia catalogoAlquiler) {
        this.catalogoAlquiler = catalogoAlquiler;
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cif=").append(cif);
        sb.append("nombre=").append(nombre);
        sb.append("catalogoVehiculo=").append(catalogoVehiculo);
        sb.append("catalogoCliente=").append(catalogoCliente);
        sb.append("catalogoAlquiler=").append(catalogoAlquiler);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.cif);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    public void registarCliente() {
        Cliente aux = new Cliente();
        //this.catalogoCliente.anadirCliente(aux);
        this.catalogoCliente.anadirElemento(aux);
    }

    //Método para registrar clientes. 
    public void registrarCliente(Cliente aux) {
        //Registrar en la empresa al cliente carlos perez, no se pueden establecer
        //los datos del cliente de forma aleatoria. 
        //this.catalogoCliente.anadirCliente(aux);
        this.catalogoCliente.anadirElemento(aux);
    }

    public void registarVehiculo() {
        Vehiculo aux = new Vehiculo();
        //this.catalogoVehiculo.anadirVehiculo(aux);
        this.catalogoVehiculo.anadirElemento(aux);
    }

    //Método para registrar vehiculos.
    public void registrarVehiculo(Vehiculo aux) {
        //Lo mismo que con registrarClientes. 
        //this.catalogoVehiculo.anadirVehiculo(aux);
        this.catalogoVehiculo.anadirElemento(aux);
    }

    //Método para buscar clientes dentro del catálogo. 
    public void buscarCliente(String cif) {
        this.catalogoCliente.buscarCliente(cif);
    }

    //Método para buscar vehiculos dentro del catálogo de Vehiculos. 
    public void buscarVehiculo(String bastidor) {
        this.catalogoVehiculo.buscarVehiculos(bastidor);
    }

    //Método para regsitar los alquileres de vehiculos. 
    //Teniendo en cuenta la fecha en la que se alquila el vehiculo y el nº de días que se mantendrá el aqlquiler. 
    public boolean registrarAlquilerVehiculo(LocalDate fechaInicio, int duracionDias, Vehiculo v, Cliente c) {
        Cliente auxCli = this.catalogoCliente.buscarCliente(cif);
        Vehiculo auxVe = this.catalogoVehiculo.buscarVehiculos(cif);
        if (auxCli != null && auxVe != null && auxVe.isDisponible() == true) {
            this.catalogoAlquiler.anadirElemento(new Alquileres(auxCli, auxVe, fechaInicio, duracionDias));
            auxVe.setDisponible(false);
            return true;
        }
        return false;
    }

    public void recibirVehiculo(Alquileres a) {
        if (this.catalogoAlquiler.buscarAlquiler(a.getArquilerID()) != null) {
            a.getVehiculo().setDisponible(true);
        }
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------
    //Nuevos métodos que pide el Ejercicio 5C. 

    //1. Método que devuelve una lista con todos Alquileres de un cliente, usando su NIF.
    //NO ME SALE. 
    
    public List devolverAlquilerClienteNif(String nif) {
        List<Alquileres> listaAlquileresCliente = new ArrayList<Alquileres>();
        Alquileres auxalquiler = new Alquileres();
        Cliente auxCliente = new Cliente();
        auxCliente.setNIF(nif);
        auxalquiler.setCliente(auxCliente);
        for (int i = 0; i < this.catalogoAlquiler.getNumeroElementos(); i++) {
            if (this.catalogoAlquiler.equals(this.catalogoCliente.buscarCliente(nif))) {
                listaAlquileresCliente.add(auxalquiler);
            }
        }
        return null;
    }
     
    
    
    
    
    //2. Método que devuelve una lista con todos Alquileres de un cliente, usando su Nº bastidor.
    public ArrayList devolverAlquilerVehiculosBastidor(String bastidor) {

        ArrayList<Alquileres> alquileresBastidor = new ArrayList();

        for (int i = 0; i < this.catalogoVehiculo.getNumeroElementos(); i++) {

            if (this.catalogoAlquiler.equals(this.catalogoCliente.buscarCliente(cif))) {

                alquileresBastidor.add(catalogoAlquiler.lista.get(i));
            }
        }
        //Devuelvo la lista con el elemento añadido. 
        return alquileresBastidor;
    }

    //3. Borrar alquiler dado un alquiler.
    public void borrarAlquiler(int alquilerPorId) {
        this.catalogoAlquiler.lista.remove(alquilerPorId);
    }

    //4. Borrar cliente del catálogo de clientes
    public void borrarClienteSinAlq(Cliente c) {

        Alquileres aux = new Alquileres();
        aux.setCliente(c);
        if (this.catalogoAlquiler.buscarElemento(aux) < 0) {
            //En este caso el cliente tendría algun alquiler en ese momento 
            //Por lo que no se lo podría eliminar del catálogo. 
        } else {
            catalogoCliente.borrarElemento(c);
            //En cuanto termine el periódo de su alquiler, se borra el mismo. 
        }

    }

    //5. Borrar Vehiculo del catálogo de vehiculos. 
    public void borrarVehiculoV(Vehiculo v) {
        Alquileres aux = new Alquileres();
        aux.setVehiculo(v);
        if (this.catalogoAlquiler.buscarElemento(aux) < 0) {
            //En este caso el cliente tendría algun alquiler en ese momento
            //Por lo que no se lo podría eliminar del catálogo. 
            System.out.println("NO");
        } else {
            catalogoVehiculo.borrarElemento(v);
        }
    }

    //6. Lista con los vehiculos con la fecha del día en el que se pide la misma. 
    public ArrayList devolverListaVehiculos(LocalDate fecha) {
        ArrayList<Vehiculo> devolverListaVehiculos = new ArrayList();
        for (Alquileres alqAux : this.catalogoAlquiler.lista) {
            devolverListaVehiculos.add(alqAux.getVehiculo());
        }
        //Devuvlvo la lista con todos los vehiculos. 
        return devolverListaVehiculos;
    }

}
