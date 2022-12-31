/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculosT5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcionMenu = "";
        int duracionAlquiler;
        /*
        Creo un menu del proyecto, para cada entidad,  con el que se podrá acceder a todas las 
        funcionalidades del proyecto. 
         */
        String menuProyecto = """
                                 1-Clientes
                                 2-Vehiculos
                                 3-Alquiler de Vehiculos
                                 4-Terminar el programa
                                 """;
        String menuClientes = """
                                 1-Registrarse
                                 2-Anular registro 
                                 3-Buscar un registro dentro del catálogo. 
                                 5-Salir de clientes
                                 """;
        String menuVehiculos = """
                                1-Añadir vehiculo
                                2-Borrar vehiculo del catálogo
                                3-Buscar vehiculo del catálogo
                                6-Salir de vehiculos. 
                                 """;

        //Empresa e1 = new Empresa(" ", "Alquila tu vehiculo aquí.");
        //Empresa con los valores a null. 
        Empresa e1 = new Empresa("RENTACAR");
        System.out.println("Empresa 1: " + e1.toString());
        //Declaro variables que utilizaré a lo largo del programa. 
        String clienteAux = " ", vehiculoAux = " ";
        System.out.println(" ");


        /*
        A continuación podremos observar una serie de bucles y switches que 
        realizarán diferentes funciones, como por ejemplo registrarse como cliente, 
        la anulación de la misma o buscar a un cliente dentro del catálogo de clientes
        para ver el historial de alquileres por ejemplo. 
        Estas opciones van a depender de los valores que el usuario vaya introduciendo. 
         */
        do {
            System.out.println(menuProyecto);
            System.out.println("Introduzca una opción: ");
            opcionMenu = teclado.nextLine();

            switch (opcionMenu) {
                case "1" -> {
                     System.out.println("USTED HA SELECCIONADO: Clientes");
                    do {
                        System.out.println(menuClientes);
                        System.out.println("Escoga una opción");
                        opcionMenu = teclado.nextLine();
                        switch (opcionMenu) {
                            case "1" -> {                               
                                /*
                                Una vez realizado el registro del cliente, 
                                podemos verlo dentro de nuestro catálogo de Clientes. 
                                 */
                                e1.registarCliente();
                                System.out.println("Catálogo Clientes: " + e1.getCatalogoCliente().toString());
                            }
                            case "2" -> {
                                System.out.println("Para eliminar un cliente ha de introducir el nif del mismo.");
                                clienteAux = teclado.nextLine();
                                Cliente aux = new Cliente();
                                aux.setNIF(clienteAux);
                                if (e1.getCatalogoCliente().buscarCliente(clienteAux) != null) {
                                    //e1.getCatalogoCliente().borrarCliente(aux);
                                    //Como he eliminado la clase Cliente me da error. 
                                    e1.getCatalogoCliente().borrarElemento(aux);
                                    System.out.println("Catálogo actualizado: " + e1.getCatalogoCliente().toString());
                                } else {
                                    System.out.println("Error, ha introducido el dato incorrecto.");
                                }
                            }
                            case "3" -> {
                                System.out.println("Introduzca el nif del cliente que desea buscar en nuesto catálogo.");
                                clienteAux = teclado.nextLine();
                                if (e1.getCatalogoCliente().buscarCliente(clienteAux) == null) {
                                    System.out.println("Error, ha introducido el dato incorrecto.");
                                } else {
                                    System.out.println("Cliientes nuestros " + e1.getCatalogoCliente().buscarCliente(clienteAux).toString());
                                }
                            }
                            default -> {
                            }

                        }

                        //El bucle se repetirá hasta que la opción sea 5. 
                    } while (!opcionMenu.contentEquals("5"));
                }
                case "2" -> {
                     System.out.println("USTED HA SELECCIONADO: Vehiculo");
                    do {
                        //Se enseña el menú en función a la opción escogida. 
                        System.out.println(menuVehiculos);
                        System.out.println("Escoga una opción: ");
                        opcionMenu = teclado.nextLine();
                        switch (opcionMenu) {
                            case "1" -> {
                                Vehiculo aux = new Vehiculo();
                                //e1.getCatalogoVehiculo().anadirVehiculo(aux);
                                /*
                                    ESTE ERROR ME VA A SALIR EN VARIAS LINEAS DEL MENÚ, SOLO 
                                    HAY QUE CAMBIAR ELEMENTO POR VEHICULO. 
                                */
                                e1.getCatalogoVehiculo().anadirElemento(aux);
                                System.out.println("Vehiculo Añadido " + e1.getCatalogoVehiculo().toString());
                            }
                            case "2" -> {
                                System.out.println("Para eliminar un vehiculo, introduzca su nº de bastidor.");
                                vehiculoAux = teclado.nextLine();
                                Vehiculo aux1 = new Vehiculo();
                                aux1.setBastidor(vehiculoAux);
                                if (e1.getCatalogoVehiculo().buscarVehiculos(vehiculoAux) != null) {
                                    //e1.getCatalogoVehiculo().borrarVehiculo(aux1);
                                    e1.getCatalogoVehiculo().borrarElemento(aux1);
                                    System.out.println("Catálogo de Vehiculos actualizado: " + e1.getCatalogoVehiculo().toString());
                                } else {
                                    System.out.println("Nº de bastidor no encontrado");
                                }
                            }
                            case "3" -> {
                                System.out.println("Introduzca el nº debastidor del vehiculo");
                                vehiculoAux = teclado.nextLine();

                                if (e1.getCatalogoVehiculo().buscarVehiculos(vehiculoAux) == null) {
                                    System.out.println("Nº de bastidor no encontrado");
                                } else {
                                    System.out.println("Vehiculo encontrado: " + e1.getCatalogoVehiculo().buscarVehiculos(vehiculoAux).toString());
                                }
                            }
                            default -> {
                            }
                        }
                        //El bucle se repetirá hasta que la opción sea 6. 
                    } while (!opcionMenu.contentEquals("6"));
                }
                case "3" -> {
                    System.out.println("USTED HA SELECCIONADO: Alquilar un vehiculo");
                    System.out.println("A continuación usted realizará la gestión para alquilar un vehiculo");
                    System.out.println("Introduzca su nif para introducirlo en el registro");
                    clienteAux = teclado.nextLine();
                    if (e1.getCatalogoCliente().buscarCliente(clienteAux) != null) {
                        System.out.println("Introduzca el nº de bastidor del vehiculo");
                        vehiculoAux = teclado.nextLine();

                        if (e1.getCatalogoVehiculo().buscarVehiculos(vehiculoAux) != null) {
                            duracionAlquiler = introducirEnteros();
                            //Creo estas dos entidades para que al regsitrarlos no me de error.
                            Vehiculo v1 = new Vehiculo();
                            Cliente c1 = new Cliente("Tomas", "Gonzalez");
                            e1.registrarAlquilerVehiculo(LocalDate.now(), duracionAlquiler, v1, c1);
                        } else {
                            System.out.println("Error, vehiculo incorrecto");
                            break;
                        }
                    } else {
                        System.out.println("error");
                    }
                    System.out.println("Alquiler registrado correctamente");
                }
                default -> {
                }
            }
            //El bucle se repetirá hasta que la opción sea 4. 
            System.out.println("Usted ha seleccionado terminar el programa");
        } while (!opcionMenu.equalsIgnoreCase("4"));
        
        
        //MÉTODOS DE LA CLASE EMPRESA TAREA 5C. 
        
        
        List<Alquileres> alquileresUnCliente = new ArrayList<>();
                                Cliente aux = new Cliente();
                                System.out.println("Indique el nif del cliente");
                                clienteAux = teclado.nextLine();
                                aux.setNIF(clienteAux);
                                //alquileresUnCliente = rentAcar.getCatalogoAlquileres().buscarAlquilerNif(clienteAux);
                                alquileresUnCliente = e1.getCatalogoAlquiler().buscarAlquilerNif(clienteAux);
                                if (alquileresUnCliente.size() > 0) {

                                    System.out.println(alquileresUnCliente.toString());
                                } else {
                                    //En caso de no encopntrar alquileres de ese cliente. 
                                    System.out.println("Error");
                                }
                                //Los demas métodos son identicos, solo cambia la utilidad de los mismos. 
                                
                                
        
        
    }

    //Metodo para controlar los valores que el usario introduzca por teclado. 
    public static int introducirEnteros() {
        Scanner teclado = new Scanner(System.in);
        int entero = 0;
        System.out.println("¿Introduzca la duración del alquiler?");
        entero = teclado.nextInt();

        return entero;

    }

}
