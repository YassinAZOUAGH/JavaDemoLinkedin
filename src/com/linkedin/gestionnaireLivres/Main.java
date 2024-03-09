package com.linkedin.gestionnaireLivres;

public class Main {
    public static void main(String[] args) {

        Livre livre1 = new Livre("Tazourakht", "Yassin", 2024);
        Livre livre2 = new Livre("Beni bouayach", "noureddine", 2022);
        Livre livre3 = new Livre("hoceima", "noureddine", 2019);
        Livre livre4 = new Livre("Tanger", "noureddine", 2021);

        GestionnaireLivres gestionnaireLivres = new GestionnaireLivres();

        gestionnaireLivres.addBock(livre1);
        gestionnaireLivres.addBock(livre2);
        gestionnaireLivres.addBock(livre3);
        gestionnaireLivres.addBock(livre4);

        System.out.println("---------------------------------------------");

        gestionnaireLivres.showBocks(gestionnaireLivres.collection);

        System.out.println("---------------------------------------------");
        gestionnaireLivres.searchBookByAuthor("noureddine");


        System.out.println("---------------------------------------------");
        gestionnaireLivres.searchBookPublierBeforYear(2022);

    }
}
