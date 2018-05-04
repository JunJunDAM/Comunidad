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
public class Comunitat {
    private String id_Comunitat;
    private String nom;
    private String poblacio;

    public Comunitat(String identificacio, String nom, String poblacio) {
        this.id_Comunitat = identificacio;
        this.nom = nom;
        this.poblacio = poblacio;
    }

    @Override
    public String toString() {
        return "Comunidad{" + "identificacio=" + id_Comunitat + ", nom=" + nom + ", poblacio=" + poblacio + '}';
    }
    
    
    public String getIdentificacio() {
        return id_Comunitat;
    }

    public void setIdentificacio(String identificacio) {
        this.id_Comunitat = identificacio;
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
