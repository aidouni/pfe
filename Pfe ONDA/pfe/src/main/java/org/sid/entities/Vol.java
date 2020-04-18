package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
@Inheritance(
    strategy = InheritanceType.JOINED
)
public class Vol  implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1410458146975019184L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol;

    
    Date dateD;
    Date dateA;
    String type;
    String sens;

    @OneToOne(mappedBy = "vol")
    Mouvement mouvement;

    @ManyToOne
    @JoinColumn(name = "AeroA_id")
    Aeroport aeroA =new Aeroport();    
    
    @ManyToOne
    @JoinColumn(name = "AeroD_id")
    Aeroport aeroD = new Aeroport();

    
    public Vol(){

    }

    public Vol(Date dateD, Date dateA, String type, String sens, Aeroport destAeroport, Aeroport arriAeroport) {
        this.dateD = dateD;
        this.dateA = dateA;
        this.type = type;
        this.sens = sens;
        this.aeroD = destAeroport ;
        this.aeroA = arriAeroport;
    }


    public int getIdVol() {
        return this.idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }

    public Date getDateD() {
        return this.dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateA() {
        return this.dateA;
    }

    public void setDateA(Date dateA) {
        this.dateA = dateA;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSens() {
        return this.sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public Aeroport getAeroA() {
        return this.aeroA;
    }

    public void setAeroA(Aeroport aeroA) {
        this.aeroA = aeroA;
    }

    public Aeroport getAeroD() {
        return this.aeroD;
    }

    public void setAeroD(Aeroport aeroD) {
        this.aeroD = aeroD;
    }

    
 
    public String toString(){
        return"ID vol : "+this.idVol+" Depart :"+this.aeroD;
    }
}