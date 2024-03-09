package com.linkedin.exercice;

public class Main {

    public static void main(String[] args) {

        Forme rec = new Rectangle(2,3);
        System.out.println("rectangle:"+ rec.calculerSurface());


        Forme cer = new Cercle(5);
        System.out.println("cercle:" + cer.calculerSurface());

    }
}
