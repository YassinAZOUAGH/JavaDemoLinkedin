package com.linkedin.form;

public class Cercle extends Form {
    private final double PI= 3.14;
    private int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }


    @Override
    public double calculerSurface(){
        return rayon*PI;
    }
}
