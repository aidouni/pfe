package org.sid.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aeroport implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAero;
    String nom;
    String ville;
    String libelle;
    String pays;
    String OASI;
    String IATA;

    @OneToMany(mappedBy = "aeroA")
    Set<Vol> aVols = new HashSet<Vol>();    
    @OneToMany(mappedBy = "aeroD")
    Set<Vol> dVols = new HashSet<Vol>(); 

    

    public Aeroport(String nom, String ville, String libelle, String pays, String OASI, String IATA) {
        this.nom = nom;
        this.ville = ville;
        this.libelle = libelle;
        this.pays = pays;
        this.OASI = OASI;
        this.IATA = IATA;
        
    }

    public Aeroport() {
    }
    
   
    
    public String getIATA() {
        return IATA;
    }
    
    public int getIdAero() {
        return idAero;
    }
    public String getLibelle() {
        return libelle;
    }
    public String getNom() {
        return nom;
    }
    public String getOASI() {
        return OASI;
    }
    public String getPays() {
        return pays;
    }
    public String getVille() {
        return ville;
    }
    public void setIATA(String iATA) {
        IATA = iATA;
    }
    public void setIdAero(int idAero) {
        this.idAero = idAero;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setOASI(String oASI) {
        OASI = oASI;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    
   
    
    
    
}