
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Mouvement extends Vol {
    /**
     *
     */
    private static final long serialVersionUID = -7281900439927291027L;
    int prevu;
    LocalTime heureMvt;
    String etat;
    List<Comptoir> c1 =new ArrayList<Comptoir>();
    Porte p;
    public Mouvement(int idVol,int numVol,Aeroport a, Aeroport b,int prevu,LocalTime heureMvt,String etat,Porte p){
       super(idVol, numVol, a, b);
       this.prevu = prevu;
       this.heureMvt = heureMvt;
       this.etat = etat;
       this.p = p;
    }
    public Mouvement(Vol v,int prevu,LocalTime heureMvt,String etat,Porte p){
        super(v.idVol,v.numVol,v.a,v.b);
        this.prevu = prevu;
        this.heureMvt = heureMvt;
        this.etat = etat; 
        this.p = p;
     }
    public void addC(Comptoir c){
         c1.add(new Comptoir(c.id, c.libelle));
    }
  /**
   * @return the prevu
   */
  public int getPrevu() {
      return prevu;
  }/**
   * @return the heureMvt
   */
  public LocalTime getHeureMvt() {
      return heureMvt;
  }/**
   * @return the etat
   */
  public String getEtat() {
      return etat;
  }
    public String toString(){
        return super.toString()+" Etat "+this.etat+" Porte : "+this.p.libelle+" Prevu à "+this.heureMvt+" Comptoir "+c1.toString();
    }
}