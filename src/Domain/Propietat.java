/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author alu2015059
 */
public class Propietat {
    private String tipus;
    private String id_Propietat;
    private int metros2;
    private Propietari id_Propietari;
    private String percentatges;
    private String lugar;
    private String maas;

    public Propietat(String tipus, String id_Propietat, int metros2, Propietari id_Propietari, String percentatges, String lugar, String maas) {
        this.tipus = tipus;
        this.id_Propietat = id_Propietat;
        this.metros2 = metros2;
        this.id_Propietari = id_Propietari;
        this.percentatges = percentatges;
        this.lugar = lugar;
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Propietat{" + "tipus=" + tipus + ", id_Propietat=" + id_Propietat + ", metros2=" + metros2 + ", id_Propietari=" + id_Propietari + ", percentatges=" + percentatges + ", lugar=" + lugar + ", maas=" + maas + '}';
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getMetros2() {
        return metros2;
    }

    public void setMetros2(int metros2) {
        this.metros2 = metros2;
    }

    public String getId_Propietat() {
        return id_Propietat;
    }

    public void setId_Propietat(String id_Propietat) {
        this.id_Propietat = id_Propietat;
    }

    public Propietari getId_Propietari() {
        return id_Propietari;
    }

    public void setId_Propietari(Propietari id_Propietari) {
        this.id_Propietari = id_Propietari;
    }

    public String getPercentatges() {
        return percentatges;
    }

    public void setPercentatges(String percentatges) {
        this.percentatges = percentatges;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
