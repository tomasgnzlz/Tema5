/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculosT5;

/**
 *
 * @author tomas
 */
public class EjemploVehiculoEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //Se crea un nuevo vehiculo 
//        System.out.println("SE CREA UN NUEVO VEHICULO CON VALORES NULOS");
//        Vehiculo v1 = new Vehiculo();
//        System.out.println(v1);
//        System.out.println(" ");
//        //Elijo el modelo de vehiculo
//        Modelo x = Modelo.SEAT_CUPRA;
//        System.out.println(" ");
//        System.out.println("SE ESCOGE UN VEHICULO ALEATORIO");
//        Modelo aleatorio = Modelo.getAleatorio();
//        System.out.println(Modelo.getAleatorio());
//        System.out.println(" ");
//        System.out.println("SE ESCOGE UN COLOR ALEATORIO AL VEHICULO");
//        System.out.println("color" + Color.getAleatorio());
//
//        System.out.println(" ");        
//        System.out.println(" ");
//        
//        //CATALOGO DE VEHICULOS
//        System.out.println("MOSTRAR UN CATALOGO DE 5 VEHICULOS");
//        CatalogoVehiculos catalogo = new CatalogoVehiculos(5);
//        catalogo.mostrarCatalogo();
//        System.out.println(" ");
//        System.out.println("MOSTAR CATALOGO DE VEHICULOS PERO EL VEHICULO QUE EN LA POSICIÓN 0 DEL ARRAY TENGA EL Nº DE BASTIDOR=123A");
//        Vehiculo [] array = catalogo.getListaVehiculos();
//        array[0].setBastidor("123A");
//        catalogo .mostrarCatalogo();
//        System.out.println(" MOSTRAR EL VEHICULO CON EL Nº DE BASTIDOR=123A");
//        Vehiculo v = new Vehiculo();
//        v.setBastidor("123A");
//        System.out.println(v);
//        
//        System.out.println(" ");
//        System.out.println("MOSTRAR LA POSICIÓN DEL VEHICULO v");
//        int posicionVehiculoArray = catalogo.buscarVehiculo(v);
//        System.out.println("Posición " + posicionVehiculoArray);
//        System.out.println("------------------ DESPUES DE BORRAR ------------------");
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
//        System.out.println("MOSTRAR CATALOGO DE VEHICULOS");
//        catalogo .mostrarCatalogo();

            CatalogoVehiculos catalogo = new CatalogoVehiculos(5);
            System.out.println("Nº de vehiculos del catalogo " + catalogo.getNumeroVehiculos());
            System.out.println(catalogo);
            
            System.out.println(" ");
            
            catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
            System.out.println("Despues de borrar el vehiculo de la posición 3");
            System.out.println("Nº vehículos del catálogo" + catalogo.getNumeroVehiculos());
            System.out.println(catalogo);
            
            System.out.println("  ");
            
            Vehiculo aux = new Vehiculo();
            aux.setBastidor("12344321");
            catalogo.anadirVehiculo(new Vehiculo());
            System.out.println("Despues de añadir el vehiculo de la posición ");
            System.out.println("Nº vehículos del catálogo" + catalogo.getNumeroVehiculos());
            System.out.println(catalogo);
            System.out.println("  ·········");
            aux.setBastidor("0000000");
            catalogo.anadirVehiculo(aux);
            System.out.println("Despues de borrar el vehiculo de la posición 3");
            System.out.println("Nº vehículos del catálogo" + catalogo.getNumeroVehiculos());
            System.out.println(catalogo);
            
            
            System.out.println(" ");
            System.out.println("·································································································································");
            System.out.println("·········· EJEMPLOS Y PRUEBAS CON LA CLASE CLIENTES Y CATÁLOGO CLIENTE ··········");
            System.out.println("·································································································································");
            System.out.println(" ");
            
            
            CatalogoClientes catalogoClientes = new CatalogoClientes(5);
            System.out.println("Nº de Clientes del catalogo " + catalogoClientes.getNumeroClientes());
            System.out.println(catalogoClientes);
            
            System.out.println(" ");
            
            catalogoClientes.borrarCliente(catalogoClientes.getListaClientes()[3]);
            System.out.println("Despues de borrar el Cliente de la posición 3");
            System.out.println("Nº Clientes del catálogo" + catalogoClientes.getNumeroClientes());
            System.out.println(catalogoClientes);
            
            System.out.println("  ");
            
            Cliente c1 = new Cliente();
            //hemos borrado añadirClientes
            //catalogoClientes.añadirClientes(new Cliente());
            System.out.println("Despues de añadir el Cliente de la posición ");
            System.out.println("Nº Clientes del catálogo" + catalogoClientes.getNumeroClientes());
            System.out.println(catalogoClientes);
            System.out.println("  ·········");
            //catalogoClientes.añadirClientes(c1);
            System.out.println("Despues de borrar el Cliente de la posición 3");
            System.out.println("Nº Cliente del catálogo" + catalogoClientes.getNumeroClientes());
            System.out.println(catalogoClientes);
    }

}
