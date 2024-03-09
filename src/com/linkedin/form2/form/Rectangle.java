package com.linkedin.form2.form;

public class Rectangle extends Form3 {
    private int hauteur;
    private int largeur;

    public Rectangle(int hauteur , int largeur){
        this.hauteur=hauteur;
        this.largeur= largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }



    @Override
    public double calculerSurface(){
        return hauteur*largeur;
    }

}
