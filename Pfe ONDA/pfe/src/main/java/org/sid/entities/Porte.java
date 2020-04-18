package org.sid.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Porte implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String libelle;

    @OneToMany(mappedBy = "p")
    Set<Mouvement> mouvement =new HashSet<Mouvement>();


    public Porte() {
    }

    public Porte( String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Set<Mouvement> getMouvement() {
        return this.mouvement;
    }

    public void setMouvement(Set<Mouvement> mouvement) {
        this.mouvement = mouvement;
    }

    

    public Porte id(int id) {
        this.id = id;
        return this;
    }

    public Porte libelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

   

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Porte)) {
            return false;
        }
        Porte porte = (Porte) o;
        return id == porte.id && Objects.equals(libelle, porte.libelle) && Objects.equals(mouvement, porte.mouvement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, mouvement);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", libelle='" + getLibelle() + "'" +
            "}";
    }

    
}