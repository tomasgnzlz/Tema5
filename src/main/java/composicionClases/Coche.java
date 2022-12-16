/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionClases;

/**
 *
 * @author tomas
 */
public class Coche {

    //4 Ruedas
    private Rueda delanteraDerecha;
    private Rueda delanteraIzquierda;
    private Rueda traseraDerecha;
    private Rueda traseraIzquierda;
    
    //1 Motor
    private Motor motor;

    //Puertas
    private Puertas puertaPiloto;
    private Puertas puertaCopiloto;
    
    //Matricula. 
    private String matricula;

    public Coche(Rueda delanteraDerecha, Rueda delanteraIzquierda, Rueda traseraDerecha, Rueda traseraIzquierda, Motor motor, Puertas puertaPiloto, Puertas puertaCopiloto, String matricula) {
        this.delanteraDerecha = delanteraDerecha;
        this.delanteraIzquierda = delanteraIzquierda;
        this.traseraDerecha = traseraDerecha;
        this.traseraIzquierda = traseraIzquierda;
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.matricula = matricula;
    }

    public Rueda getDelanteraDerecha() {
        return delanteraDerecha;
    }

    public void setDelanteraDerecha(Rueda delanteraDerecha) {
        this.delanteraDerecha = delanteraDerecha;
    }

    public Rueda getDelanteraIzquierda() {
        return delanteraIzquierda;
    }

    public void setDelanteraIzquierda(Rueda delanteraIzquierda) {
        this.delanteraIzquierda = delanteraIzquierda;
    }

    public Rueda getTraseraDerecha() {
        return traseraDerecha;
    }

    public void setTraseraDerecha(Rueda traseraDerecha) {
        this.traseraDerecha = traseraDerecha;
    }

    public Rueda getTraseraIzquierda() {
        return traseraIzquierda;
    }

    public void setTraseraIzquierda(Rueda traseraIzquierda) {
        this.traseraIzquierda = traseraIzquierda;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puertas getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puertas puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puertas getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puertas puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("delanteraDerecha=").append(delanteraDerecha);
        sb.append(", delanteraIzquierda=").append(delanteraIzquierda);
        sb.append(", traseraDerecha=").append(traseraDerecha);
        sb.append(", traseraIzquierda=").append(traseraIzquierda);
        sb.append(", motor=").append(motor);
        sb.append(", puertaPiloto=").append(puertaPiloto);
        sb.append(", puertaCopiloto=").append(puertaCopiloto);
        sb.append(", matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
    
    

}
