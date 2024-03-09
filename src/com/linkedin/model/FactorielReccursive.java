package com.linkedin.model;

public class FactorielReccursive {
    public static void main(String[] args) {

        int nombre = 10;
        long resultat = calculerFactoriel(nombre);
        System.out.println("factoriel de "+nombre+" égale à : "+resultat);
    }

    public static long calculerFactoriel(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*calculerFactoriel(n-1);
        }
    }
}
