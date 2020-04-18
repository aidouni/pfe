package org.sid.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passerelle implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String Libelle;

    @OneToOne(mappedBy = "passerelle")
    Mouvement mouvement;
    

    public Passerelle() {
    }

    public Passerelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public Mouvement getMouvement() {
        return this.mouvement;
    }

    public void setMouvement(Mouvement mouvement) {
        this.mouvement = mouvement;
    }

    public Passerelle id(int id) {
        this.id = id;
        return this;
    }

    public Passerelle Libelle(String Libelle) {
        this.Libelle = Libelle;
        return this;
    }

    public Passerelle mouvement(Mouvement mouvement) {
        this.mouvement = mouvement;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Passerelle)) {
            return false;
        }
        Passerelle passerelle = (Passerelle) o;
        return id == passerelle.id && Objects.equals(Libelle, passerelle.Libelle) && Objects.equals(mouvement, passerelle.mouvement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Libelle, mouvement);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", Libelle='" + getLibelle() + "'" +
            ", mouvement='" + getMouvement() + "'" +
            "}";
    }


}