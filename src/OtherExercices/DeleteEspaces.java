package OtherExercices;

public class DeleteEspaces {

    public static void main(String[] args) {
        String chaineOriginale = "Ceci est une chaîne avec des espaces";
        String chaineSansEspaces = supprimerEspaces(chaineOriginale);
        System.out.println("Chaîne originale : "+chaineOriginale);
        System.out.println("Chaîne sans espaces : "+chaineSansEspaces);
    }

    public static String supprimerEspaces(String  chaine){

        return chaine.replace(" ", "");
    }
}
