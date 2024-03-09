package CodingGame;

public class Exercice2 {

        public static String calc(int montant) {
            // Calculer le nombre de billets/pièces de chaque valeur
            int nb100 = montant / 100;
            int reste = montant % 100;
            int nb50 = reste / 50;
            reste %= 50;
            int nb20 = reste / 20;
            reste %= 20;
            int nb10 = reste / 10;
            reste %= 10;
            int nb2 = reste / 2;
            reste %= 2;

            // Concaténer les résultats dans une chaîne de caractères
            String resultat = nb100 + " " + nb50 + " " + nb20 + " " + nb10 + " " + nb2 + " " + reste;

            return resultat;
        }

        public static void main(String[] args) {
            int montant = 990307;
            String resultat = calc(montant);
            System.out.println(resultat); // Devrait afficher "3 0 1 0 2 1"
        }


}
