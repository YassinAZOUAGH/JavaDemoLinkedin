package com.linkedin.model;

public class Main {
    public static void main(String[] args) {

        int monTab[];

        monTab = new int[3];

        monTab[0]= 2;
        monTab[1]= 8;
        monTab[2]= 9;

        for(int i =0; i< monTab.length; i++){
            System.out.printf(String.valueOf(monTab[i]));
        }

    }
}
