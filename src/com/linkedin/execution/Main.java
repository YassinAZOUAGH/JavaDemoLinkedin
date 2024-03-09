package com.linkedin.execution;

import com.linkedin.model.Voiture;

public class Main {

    public static void main(String[] args) {

        Voiture v = new Voiture("Audi","Noir",4);

        v.setColor("Blue");
        System.out.println(v.getColor());
    }
}
