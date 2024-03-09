package com.linkedin2.form;

public class Cercle extends Form {

    public static final double PI = 3.14;
    private int rayon;

    public Cercle(int rayon) {
        super();
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
        return PI*rayon*rayon;
    }
}
