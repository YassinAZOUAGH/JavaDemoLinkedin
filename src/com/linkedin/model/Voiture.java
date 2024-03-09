package com.linkedin.model;

public class Voiture {

    private String marque;
    private String color;
    private int nbrPlace;

    /*public Voiture(){
        System.out.println("constructeur de la voiture");
    }*/

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public Voiture(String marque, String color, int nbrPlace) {
        System.out.println("constructeur de la voiture");
        this.marque = marque;
        this.color = color;
        this.nbrPlace = nbrPlace;
    }

    public void demmarer(){
        System.out.println("voiture démarre");
    }

    public void arreter(){
        System.out.println("arret de la voiture");
    }

    public void accelerer(){
        System.out.println("acceleration de la voiture");
    }

}
