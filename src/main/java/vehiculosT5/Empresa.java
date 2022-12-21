/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.Objects;
import java.time.LocalDate;
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
    private CatalogoAlquiler catalogoAlquiler;

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
        this.catalogoAlquiler = new CatalogoAlquiler(5);
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

    public CatalogoAlquiler getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCatalogoAlquiler(CatalogoAlquiler catalogoAlquiler) {
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
            this.catalogoAlquiler.anadirAlquiler(new Alquileres(auxCli, auxVe, fechaInicio, duracionDias));
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
    
    //Nuevas utilidades que pide el Ejercicio. 
}
