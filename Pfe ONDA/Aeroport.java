
public class Aeroport {
    int idAero;
    String type;
    String nom;
    String ville;
    String libelle;
    String pays;
    String OASI;
    String IATA;
    public Aeroport(int idAero,String nom){
    this.idAero=idAero;
    this.nom=nom;
    }
    
    /**
     * @return the iATA
     */
    public String getIATA() {
        return IATA;
    }
    /**
     * @return the idAero
     */
    public int getIdAero() {
        return idAero;
    }/**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }/**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }/**
     * @return the oASI
     */
    public String getOASI() {
        return OASI;
    }/**
     * @return the pays
     */
    public String getPays() {
        return pays;
    }/**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }/**
     * @param iATA the iATA to set
     */
    public void setIATA(String iATA) {
        IATA = iATA;
    }/**
     * @param idAero the idAero to set
     */
    public void setIdAero(int idAero) {
        this.idAero = idAero;
    }/**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }/**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }/**
     * @param oASI the oASI to set
     */
    public void setOASI(String oASI) {
        OASI = oASI;
    }/**
     * @param pays the pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }/**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
 
}