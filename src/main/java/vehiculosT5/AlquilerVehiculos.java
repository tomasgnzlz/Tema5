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
        
        //CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoVehiculosHerencia cv = new CatalogoVehiculosHerencia(5);
        CatalogoClientesHerencia cc = new CatalogoClientesHerencia(5);
         System.out.println(cv);
         System.out.println(cc);
         //ERROR EN EL MÉTODO BUSCAR CLIENTES. 
        Cliente c = cc.buscarCliente("3");
        System.out.println("Cliente Random  ->" + c);
        System.out.println("  ");
        
        Vehiculo v = cv.buscarVehiculos("4");
        System.out.println("Vehiculo    "+v);
        Alquileres a = new Alquileres(c, v, LocalDate.now(), 8);
        System.out.println(a);
        /*
        De catalogoAlquiler pasa a CatalogoAlquilerHerencia, ya que utilizamos 
        una clase genérica con métodos genéricos, y una clase herencia de esta
        que tiene los métodos exclusivos de los alquileres, por ejemplo. 
        */
        CatalogoAlquilerHerencia ca = new CatalogoAlquilerHerencia(5);
       ca.anadirElemento(a);
        System.out.println("Lista de alquileres");
        System.out.println(ca);
    }
}