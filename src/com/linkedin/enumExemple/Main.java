package com.linkedin.enumExemple;
enum JourSemain {
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE
}
public class Main {
    public static void main(String[] args) {

        JourSemain jour = JourSemain.LUNDI;
        System.out.println(jour);

    }
}
