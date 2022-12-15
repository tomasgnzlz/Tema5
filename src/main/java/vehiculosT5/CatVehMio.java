package vehiculosT5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;

/**
 *
 * @author tomas
 */
public class CatVehMio {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;

    //El constructor recibe el tamaño del catalogo e inicializa
    //la estructura de datos con vehiculos aleatorios.
    public CatVehMio(int tamanio) {
        this.numeroVehiculos = tamanio;
        tamanio = Math.abs(tamanio);//incializa el Nº de vehiculos del catalogo al tamaño que le estoy diciendo
        this.listaVehiculos = new Vehiculo[tamanio];

        //Una vez creada la estructura de datos le doy valor a cada elemento.
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }
    }
    //COMENTAR
    public void mostrarCatalogo() {
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
    }

    //Nº de vehiculos que hay en el catáologo, no el tamaño. 
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public int buscarVehiculo(Vehiculo v) {
        if (v != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
            if (v.equals(this.listaVehiculos[i])) {
                return i;
            }
        }
        }
        //Como no encuetra ese bastidor duevuelve -1
        return -1;
    }
    //Método para borrar vehiculos del catálogo. 
    public void borrarVehiculo(Vehiculo v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.listaVehiculos[pos] = null;
        }
    }

//    public boolean borrarVehiculo(Vehiculo v) {
//        int posicionVehiculoArray = buscarVehiculo(v);
//        if (posicionVehiculoArray >= 0) {
//            this.listaVehiculos[posicionVehiculoArray] = null;
//            this.numeroVehiculos--;
//            return true;
//        }
//        return false;
//    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

    public void anadirVehiculo(Vehiculo v) {
        //Si hay hueco, se inserta en el hueco
        if (this.numeroVehiculos < this.listaVehiculos.length) {
            //Hay hueco.
            for (int i = 0; i < listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null) {
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    System.out.println("Guardando vehiculo en posición " + i);
                    break;
                }
            }
        } else {//El array está lleno
            //Vehiculos[] nuevo = Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);
            numeroVehiculos++;
            this.listaVehiculos = Arrays.copyOf(listaVehiculos, numeroVehiculos);
            this.listaVehiculos[this.numeroVehiculos - 1] = v;
        }
    }

    //ToString
    @Override
    public String toString() {
        String tmp = "";
        for (Vehiculo v : listaVehiculos) {
            if (v != null) {
                tmp += v.toString() + "\n";
            }
        }
        return tmp;
    }

    /*
        1. ·MÉTODO COPIAR array  PRIVADO
    
        2. ·CATÁLOGO DE CLIENTES
                            -NOMBRE, APELLIDO, NIF. (CLASE CLIENTE, CREAR CATALOGO CLIENTES AL IGUAL QUE CATALOGO VEHICULOS)
        ·
     */
}
