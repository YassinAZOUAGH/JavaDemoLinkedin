package com.linkedin.heritage;

public  abstract class Chien extends Animal{
    public Chien(String nom, int taille, int poids, int age) {
        super(nom, taille, poids, age);
    }

    @Override
    public void manger() {
        System.out.println("Chien manger");
    }
}
