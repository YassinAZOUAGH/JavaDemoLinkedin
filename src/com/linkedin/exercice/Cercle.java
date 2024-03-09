package com.linkedin.exercice;

public class Cercle extends Forme {

    private int rayon;
    public static final double PI = 3.14;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }


    @Override
    public double calculerSurface() {
        return rayon * rayon * PI;
    }
}
