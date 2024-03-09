package com.linkedin.gestionnaireLivres;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireLivres {

    List<Livre> collection = new ArrayList<>();


    public List<Livre> addBock(Livre livre) {
        collection.add(livre);
        //System.out.println(livre.getTitre() +" a bien été ajouter au collection");
        return collection;
    }

    public void showBocks(List<Livre> collection) {
        for (Livre livre : collection) {
            System.out.println("Titre:" + livre.getTitre() + " auteur: " + livre.getAuteur() + " année de publication" + livre.getAnneePublication());
        }
    }

    public void searchBookByAuthor(String auteur) {
        List<Livre> livreAuteur = new ArrayList<>();
        for (Livre livre : this.collection) {
            if (livre.getAuteur() == auteur) {
                livreAuteur.add(livre);
            }
        }

        for (Livre livre: livreAuteur){
            System.out.println("liste de livre de " +auteur +" est: "+ livre.getTitre() +"  "+livre.getAuteur() +" " +livre.getAnneePublication());
        }

    }

    public void searchBookPublierBeforYear(int year){
        List<Livre> booksPublierBeforYear = new ArrayList<>();
        for (Livre livre : this.collection){
            if (livre.getAnneePublication() < year){
                booksPublierBeforYear.add(livre);
            }
        }

        System.out.println("liste de livre publié avant "+year +" sont: ");
        for(Livre livre: booksPublierBeforYear){
            System.out.println("le livre: "+livre.getTitre());
        }
    }


}
