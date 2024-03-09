package OtherExercices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
    public static String lireFichierTexte(String chemin) {
        StringBuilder contenu = new StringBuilder();
        try (BufferedReader lecteur = new BufferedReader(new FileReader(chemin))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                contenu.append(ligne).append("\n");
            }
        } catch (IOException e) {
            // Gestion de l'exception en affichant un message d'erreur
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
        return contenu.toString();
    }

    public static void main(String[] args) {
        String cheminFichier = "C:/Users/yassi/Desktop/JavaDemoLinkedin/txt.txt";
        String contenu = lireFichierTexte(cheminFichier);
        System.out.println("Contenu du fichier : \n" + contenu);
    }
}
