package com.linkedin2.form;

public class Main {
    public static void main(String[] args) {

        Form rec = new Rectangle(2,3);
        System.out.println("le surface de Rectangles est: "+rec.calculerSurface());

        Form cercle = new Cercle(10);
        System.out.println("le surface de Cercle est: "+cercle.calculerSurface());
    }
}
