/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionClases;

/**
 *
 * @author tomas
 */
public class Puertas {

    public Puertas(Ventanas ventanaPiloto, boolean par) {
    }
    
    private Ventanas ventana;
    private boolean estado;

    public Ventanas getVentana() {
        return ventana;
    }

    public void setVentana(Ventanas ventana) {
        this.ventana = ventana;
    }

    public boolean getEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }
    
    
    
}
