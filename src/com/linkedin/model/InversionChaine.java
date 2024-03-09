package com.linkedin.model;

public class InversionChaine {
    public static void main(String[] args) {
         String chaine ="hello world!";
         String resultat = inverseChaine(chaine);
        System.out.println("la chaine inverse est: "+resultat);
    }

    private static String inverseChaine( String input){
        StringBuilder resultat = new StringBuilder();
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("La chaîne est vide ou nulle.");
        }
        else {

            for (int i = input.length()-1; i>= 0; i--){
                resultat.append(input.charAt(i));
                //System.out.println(input.charAt(i));
            }

        }

        return resultat.toString();
    }
}
