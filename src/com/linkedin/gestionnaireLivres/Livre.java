package com.linkedin.gestionnaireLivres;

public class Livre {

    private String titre;
    private String auteur;
    private int anneePublication;

    public Livre(String titre,String auteur, int anneePublication ){
        this.titre=titre;
        this.auteur=auteur;
        this.anneePublication=anneePublication;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }
}
