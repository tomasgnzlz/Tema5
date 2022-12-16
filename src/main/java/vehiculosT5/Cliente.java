/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.Objects;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
/*
        Clientes:
            ·Nombre
            ·Apellido
            ·NIF
 */
public class Cliente {

    Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String apellido;
    private String nif;
     private static int contador = 0;

    //Constructor
    public Cliente() {
        this.nombre = RandomStringUtils.randomAlphabetic(7);
        this.apellido = RandomStringUtils.randomAlphabetic(5);
        contador++;
        this.nif = String.valueOf(contador);
    }

    //Getters & Setters
    public String getNIF() {
        return nif;
    }

    public void setNIF(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //ToString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", NIF=").append(nif);
        sb.append('}');
        return sb.toString();
    }

    //HashCode & Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nif);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }
    
}
