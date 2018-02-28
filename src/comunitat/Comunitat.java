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
public class Comunitat {
    private String identificacio;
    private String nom;
    private String poblacio;

    public Comunitat(String identificacio, String nom, String poblacio) {
        this.identificacio = identificacio;
        this.nom = nom;
        this.poblacio = poblacio;
    }

    @Override
    public String toString() {
        return "Comunidad{" + "identificacio=" + identificacio + ", nom=" + nom + ", poblacio=" + poblacio + '}';
    }
    
    public String getIdentificacio() {
        return identificacio;
    }

    public void setIdentificacio(String identificacio) {
        this.identificacio = identificacio;
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
    
}
