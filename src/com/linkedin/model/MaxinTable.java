package com.linkedin.model;

public class MaxinTable {

    public static void main(String[] args) {
        int[] tableau = {10,50,30,90,74,10,54,98,21,2,845};
        int resultat =  maxinTable(tableau);
        System.out.println("le Max dan la table  tableau  est: "+resultat);
    }

    public static int maxinTable(int[] tableau){
    int max =tableau[0];
    for (int i =1; i<=tableau.length-1; i++){
        if(tableau[i]>max){
            max = tableau[i];
        }

    }
        return max;
    }
}
