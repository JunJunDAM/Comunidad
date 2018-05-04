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
    private String id_Despeses;
    private String descripcio;
    private Double importe;
    private Zona zona;

    public Despeses(String id_Despeses, String descripcio, Double importe, Zona zona) {
        this.id_Despeses = id_Despeses;
        this.descripcio = descripcio;
        this.importe = importe;
        this.zona = zona;
    }

    public String getId_Despeses() {
        return id_Despeses;
    }

    public void setId_Despeses(String id_Despeses) {
        this.id_Despeses = id_Despeses;
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
}
