package OtherExercices;

public class SystemGC {
    public static void main(String[] args) {
        // Création d'objets pour consommer de la mémoire
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        // Affichage du message avant la collecte des déchets
        System.out.println("Avant la collecte des déchets");

        // Appel explicite à la collecte des déchets
        System.gc();

        // Affichage du message après la collecte des déchets
        System.out.println("Après la collecte des déchets");
    }

}
