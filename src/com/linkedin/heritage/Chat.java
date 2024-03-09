package com.linkedin.heritage;

public class Chat extends Animal {

    private String color;

    public Chat(String nom, int taille, int poids, int age, String color) {
        super(nom, taille, poids, age);
        this.color= color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void manger() {
        System.out.println("Chat mange");
    }
}
