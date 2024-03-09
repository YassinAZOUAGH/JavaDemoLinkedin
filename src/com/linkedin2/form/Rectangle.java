package com.linkedin2.form;

public class Rectangle extends Form {
    private int x;
    private int y;

    public Rectangle(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }

    @Override
    public double calculerSurface() {
        return x*y;
    }
}
