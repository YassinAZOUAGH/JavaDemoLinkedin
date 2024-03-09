package com.linkedin.exercice;

public class Rectangle extends Forme {

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculerSurface() {
        return x*y;
    }
}
