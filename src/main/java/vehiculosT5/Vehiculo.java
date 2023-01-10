/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosT5;

import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Vehiculo {
    private String bastidor;
    private String matricula;
    private Color color;
    private Modelo modelo;
    private boolean disponible;
    private double tarifa;
    private static int contador = 0;

    //Constructor sin parametros que genere vehiculos diferentes con datos diferentes.
    public Vehiculo() {
        contador = contador++;
        this.bastidor = String.valueOf(++contador);
        this.matricula = RandomStringUtils.randomNumeric(4)
                + RandomStringUtils.randomAlphabetic(3);
        this.modelo = Modelo.getAleatorio();
        this.color = Color.getAleatorio();
        this.disponible = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("bastidor=").append(bastidor);
        sb.append(", matricula=").append(matricula);
        sb.append(", color=").append(color);
        sb.append(", modelo=").append(modelo);
        sb.append(", disponible=").append(disponible);
        sb.append(", tarifa=").append(tarifa);
        sb.append('}');
        return sb.toString();
    }

    //Getters and Setters
    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        /*
    Se pueden poner dos metodos, uno para que se diga que el vehiculo está 
    disponible(true) y uno para cuando no lo este(false). Ejemplo:
        
        public void Disponible(){
            this.estado=true;
        }
        public void noDisponible(){
            this.estado=false;
        }
         */
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.bastidor);
        hash = 59 * hash + Objects.hashCode(this.matricula);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + (this.disponible ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.bastidor, other.bastidor);
    }

}
