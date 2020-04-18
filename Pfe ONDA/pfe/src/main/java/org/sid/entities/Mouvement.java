package org.sid.entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Mouvement  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int prevu;
    LocalTime heureMvt;
    String etat;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    Set<Comptoir> c1 =new HashSet<Comptoir>();

    @ManyToOne
    @JoinColumn(name = "id_porte")
    Porte p;

    @OneToOne
    @JoinColumn(name = "id_passerelle")
    Passerelle passerelle;

    

    @OneToOne
    @JoinColumn(name = "idVol")
    Vol vol;

    public Mouvement(int prevu,LocalTime heureMvt,String etat,Porte p,Vol vol,Passerelle passerelle){
        this.prevu = prevu;
        this.heureMvt = heureMvt;
        this.etat = etat; 
        this.p = p;
        this.vol = vol;
        this.passerelle = passerelle;
     }
   

    public Mouvement() {
    }

    public Mouvement( int prevu, LocalTime heureMvt, String etat, Set<Comptoir> c1, Porte p, Passerelle passerelle, Vol vol) {
        this.prevu = prevu;
        this.heureMvt = heureMvt;
        this.etat = etat;
        this.c1 = c1;
        this.p = p;
        this.passerelle = passerelle;
        this.vol = vol;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrevu() {
        return this.prevu;
    }

    public void setPrevu(int prevu) {
        this.prevu = prevu;
    }

    public LocalTime getHeureMvt() {
        return this.heureMvt;
    }

    public void setHeureMvt(LocalTime heureMvt) {
        this.heureMvt = heureMvt;
    }

    public String getEtat() {
        return this.etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Set<Comptoir> getC1() {
        return this.c1;
    }

    public void setC1(Set<Comptoir> c1) {
        this.c1 = c1;
    }

    public Porte getP() {
        return this.p;
    }

    public void setP(Porte p) {
        this.p = p;
    }

    public Passerelle getPasserelle() {
        return this.passerelle;
    }

    public void setPasserelle(Passerelle passerelle) {
        this.passerelle = passerelle;
    }

    public Vol getVol() {
        return this.vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Mouvement id(int id) {
        this.id = id;
        return this;
    }

    public Mouvement prevu(int prevu) {
        this.prevu = prevu;
        return this;
    }

    public Mouvement heureMvt(LocalTime heureMvt) {
        this.heureMvt = heureMvt;
        return this;
    }

    public Mouvement etat(String etat) {
        this.etat = etat;
        return this;
    }

    public Mouvement c1(Set<Comptoir> c1) {
        this.c1 = c1;
        return this;
    }

    public Mouvement p(Porte p) {
        this.p = p;
        return this;
    }

    public Mouvement passerelle(Passerelle passerelle) {
        this.passerelle = passerelle;
        return this;
    }

    public Mouvement vol(Vol vol) {
        this.vol = vol;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mouvement)) {
            return false;
        }
        Mouvement mouvement = (Mouvement) o;
        return id == mouvement.id && prevu == mouvement.prevu && Objects.equals(heureMvt, mouvement.heureMvt) && Objects.equals(etat, mouvement.etat) && Objects.equals(c1, mouvement.c1) && Objects.equals(p, mouvement.p) && Objects.equals(passerelle, mouvement.passerelle) && Objects.equals(vol, mouvement.vol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prevu, heureMvt, etat, c1, p, passerelle, vol);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", prevu='" + getPrevu() + "'" +
            ", heureMvt='" + getHeureMvt() + "'" +
            ", etat='" + getEtat() + "'" +
            ", c1='" + getC1() + "'" +
            ", p='" + getP() + "'" +
            ", passerelle='" + getPasserelle() + "'" +
            ", vol='" + getVol() + "'" +
            "}";
    }
  
    
}