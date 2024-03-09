package com.linkedin.form;

public class Main {
    public static void main(String[] args) {


        Rectangle rec = new Rectangle(2,6);
        System.out.println("la surface de rectangle est "+rec.calculerSurface());

        Form cer = new Cercle(5);
        System.out.println("la surface du cercle est: "+ cer.calculerSurface());
    }
}
