package com.linkedin.singleton;

public class Singleton {
    // Instance unique de la classe Singleton
    private static Singleton instance;

    // Constructeur privé pour empêcher l'instanciation directe
    private Singleton() {}

    // Méthode statique pour obtenir l'instance unique de la classe Singleton
    public static Singleton getInstance() {
        // Crée l'instance si elle n'existe pas encore
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Méthodes de l'instance unique...
}
