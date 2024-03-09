package com.linkedin.form2.form;

public class Cercle implements Form {
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
