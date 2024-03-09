package OtherExercices;

class Compteur {

    // Une variable static dans une Class est partagée par toutes les instances (objets) de cette classe
    static int getInstace;

    Compteur(){
        getInstace++;
    }

    public static int getNombreInstances(){

        return getInstace;
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        // Création de plusieurs instances de la classe Compteur
        Compteur compteur1 = new Compteur();
        Compteur compteur2 = new Compteur();
        Compteur compteur3 = new Compteur();
        Compteur compteur4 = new Compteur();

        // Affichage du nombre total d'instances créées
        System.out.println("Nombre total d'instances : " + Compteur.getNombreInstances()); // Affiche 3
    }
}
