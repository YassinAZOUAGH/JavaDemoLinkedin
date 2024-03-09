package CodingGame;

public class ReverseString {
    public static String reverseString(String str) {
        // Création d'un objet StringBuilder avec la chaîne d'entrée
        StringBuilder reversedBuilder = new StringBuilder(str);

        // Inversion de la chaîne à l'aide de la méthode reverse() de StringBuilder
        reversedBuilder.reverse();

        // Retourner la chaîne inversée
        return reversedBuilder.toString();
    }

    public static void main(String[] args) {
        // Chaîne d'entrée
        String input = "cool";

        // Appeler la fonction pour inverser la chaîne
        String output = reverseString(input);

        // Afficher la chaîne inversée
        System.out.println("Sortie : " + output); // Output: "looc"
    }
}
