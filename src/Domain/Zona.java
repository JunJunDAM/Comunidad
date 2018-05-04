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
public class Zona {
    private char id_Zona;
    private String nom;
    private char tipus;

    public Zona(char identificacio, String nom, char tipus) {
        this.id_Zona = identificacio;
        this.nom = nom;
        this.tipus = tipus;
    }

    
    @Override
    public String toString() {
        return "Zona{" + "identificacio=" + id_Zona + ", nom=" + nom + ", tipus=" + tipus + '}';
    }

    public char getIdentificacio() {
        return id_Zona;
    }

    public void setIdentificacio(char identificacio) {
        this.id_Zona = identificacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getTipus() {
        return tipus;
    }

    public void setTipus(char tipus) {
        this.tipus = tipus;
    }
    
    
}
