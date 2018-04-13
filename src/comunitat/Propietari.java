package comunitat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu2015059
 */
public class Propietari {
    private String nom;
    private String poblacio;
    private String correu;

    public Propietari(String nom, String poblacio, String correu) {
        this.nom = nom;
        this.poblacio = poblacio;
        this.correu = correu;
    }

    
    @Override
    public String toString() {
        return "Propietari{" + "nom=" + nom + ", poblacio=" + poblacio + ", correu=" + correu + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }
    
}
