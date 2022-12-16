/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicionClases;

/**
 *
 * @author tomas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda di = new Rueda(225, "Michelin");
        Rueda dd = new Rueda(225, "Michelin");
        Rueda ti = new Rueda(225, "Michelin LowCost");
        Rueda tf = new Rueda(225, "Michelin LowCost");
        Ventanas ventanaPiloto = new Ventanas(false);
        Ventanas ventanaCopiloto = new Ventanas(false);
        
        Puertas piloto = new Puertas(ventanaPiloto, false);
        Puertas coPiloto = new Puertas(ventanaCopiloto, false);
        
        Motor motor = new Motor(95, false);
        Coche coche1 = new Coche(dd, ti, tf, ti, motor, piloto, coPiloto, "1234");
        System.out.println("El coche 1" + coche1);
        coche1.getPuertaPiloto().getVentana().abrir();
        
        coche1.getMotor().arrancar();
        
    }
    
}
