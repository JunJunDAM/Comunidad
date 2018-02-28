/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunitat;

/**
 *
 * @author alu2015059
 */
public class Propietat {
    private char tipus;
    private String codiPropietat;
    private int metros2;
    private String codiPropietari;
    private String percentatges;
    private String lugar;

    public Propietat(char tipus, String codiPropietat, int metros2, String codiPropietari, String percentatges, String lugar) {
        this.tipus = tipus;
        this.codiPropietat = codiPropietat;
        this.metros2 = metros2;
        this.codiPropietari = codiPropietari;
        this.percentatges = percentatges;
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Propietat{" + "tipus=" + tipus + ", codiPropietat=" + codiPropietat + ", metros2=" + metros2 + ", codiPropietari=" + codiPropietari + ", percentatges=" + percentatges + ", lugar=" + lugar + '}';
    }

    public char getTipus() {
        return tipus;
    }

    public void setTipus(char tipus) {
        this.tipus = tipus;
    }

    public String getCodiPropietat() {
        return codiPropietat;
    }

    public void setCodiPropietat(String codiPropietat) {
        this.codiPropietat = codiPropietat;
    }

    public int getMetros2() {
        return metros2;
    }

    public void setMetros2(int metros2) {
        this.metros2 = metros2;
    }

    public String getCodiPropietari() {
        return codiPropietari;
    }

    public void setCodiPropietari(String codiPropietari) {
        this.codiPropietari = codiPropietari;
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
