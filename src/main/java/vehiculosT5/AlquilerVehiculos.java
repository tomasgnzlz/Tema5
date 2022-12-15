/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class AlquilerVehiculos {

    public static void main(String[] args) {

        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoClientes cc = new CatalogoClientes(5);
        System.out.println(cv);
        System.out.println(cc);
        //ERROR EN EL MÉTODO BUSCAR CLIENTES. 
        Cliente c = cc.buscarCliente("3");
        System.out.println("Cliente Random  ->" + c);
        System.out.println("  ");

        Vehiculo v = cv.buscarVehiculos("4");
        System.out.println("Vehiculo    " + v);
        Alquileres a = new Alquileres(c, v, LocalDate.now(), 8);
        System.out.println(a);
        CatalogoAlquiler ca = new CatalogoAlquiler(5);
        ca.anadirAlquiler(a);
        System.out.println("Lista de alquileres");
        System.out.println(ca);
    }
}

/*
mostrar clientes
mostrar vehiculos

dar de alya vehiculos y clientes
mostrar los vehiculos disponibles para alquilar
*/
