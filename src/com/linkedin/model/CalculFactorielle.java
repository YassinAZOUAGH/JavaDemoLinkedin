package com.linkedin.model;

public class CalculFactorielle {

    public static void main(String[] args) {
        int nombre = 4; // Remplacez 5 par le nombre pour lequel vous souhaitez calculer la factorielle
        long resultat = calculerFactorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }

    // Méthode récursive pour calculer la factorielle
    public static long calculerFactorielle(int n) {
        if (n == 0 || n == 1) {
            return 1; // La factorielle de 0 et 1 est 1
        } else {
            return n * calculerFactorielle(n - 1); // Appel récursif
        }
    }
}
