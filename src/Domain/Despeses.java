package Domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu2015059
 */
public class Despeses {
    private String identificacio;
    private String descripcio;
    private Double importe;
    private char zona;

    public Despeses(String identificacio, String descripcio, Double importe, char zona) {
        this.identificacio = identificacio;
        this.descripcio = descripcio;
        this.importe = importe;
        this.zona = zona;
    }

    
    @Override
    public String toString() {
        return "Despeses{" + "identificacio=" + identificacio + ", descripcio=" + descripcio + ", importe=" + importe + ", zona=" + zona + "}" + "\n";
    }

    public String getIdentificacio() {
        return identificacio;
    }

    public void setIdentificacio(String identificacio) {
        this.identificacio = identificacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public char getZona() {
        return zona;
    }

    public void setZona(char zona) {
        this.zona = zona;
    }
    
    
    
}
