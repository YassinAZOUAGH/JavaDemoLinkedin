package OtherExercices;

public class SommeTableauRecursif {


    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5,10};
        int somme = sommeTableau(tableau, tableau.length);
        System.out.println("La somme des éléments du tableau est : " + somme);
    }



    public static int sommeTableau(int[] tableau, int taille) {
        // Cas de base : lorsque la taille du tableau est 0, la somme est 0
        if (taille == 0) {
            return 0;
        }
        // Appel récursif : la somme est l'élément courant plus la somme des éléments restants
        //System.out.println(tableau[taille - 1] + sommeTableau(tableau, taille - 1));
        System.out.println("indice: "+(taille-1));
        System.out.println("la valeur:  "+tableau[taille-1]);
        return tableau[taille - 1] + sommeTableau(tableau, taille - 1);
    }
}
