package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Comptoir implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    int id_c;
    String libelle;
    @ManyToOne
    @JoinColumn(name = "id")
    Mouvement mouvement;
    
    public Comptoir( String libelle){
        this.libelle = libelle;
    }
    public String toString() {
        return libelle;
    }
}