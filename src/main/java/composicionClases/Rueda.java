/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionClases;

/**
 *
 * @author tomas
 */
public class Rueda {
    private double diametro;
    private String marcaNeumatico;

    public Rueda(double diametro, String marcaNeumatico) {
        this.diametro = diametro;
        this.marcaNeumatico = marcaNeumatico;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getMarcaNeumatico() {
        return marcaNeumatico;
    }

    public void setMarcaNeumatico(String marcaNeumatico) {
        this.marcaNeumatico = marcaNeumatico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rueda{");
        sb.append("diametro=").append(diametro);
        sb.append(", marcaNeumatico=").append(marcaNeumatico);
        sb.append('}');
        return sb.toString();
    }
    
    
}
