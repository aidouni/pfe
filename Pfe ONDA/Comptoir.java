
public class Comptoir {
    int id;
    String libelle;
    public Comptoir(int id, String libelle){
        this.id = id;
        this.libelle = libelle;
    }
    @Override
    public String toString() {
        return libelle;
    }
}