/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionClases;

/**
 *
 * @author tomas
 */
public class Ventanas {

    private boolean estado;//Abierta o Cerrada. 

    public Ventanas(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {//Consulta el estado de la ventana. 
        return estado;
    }

    public void setEstado(boolean estado) {//Le paso true o false. 
        this.estado = estado;
    }

    public void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventanas{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    

}
