package OtherExercices;


public class Redifinition {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Chien chien = new Chien();

        // Appel de la méthode parler() de la classe Animal
        animal.parler();  // Affiche : L'animal parle

        // Appel de la méthode parler() de la classe Chien (redéfinie)
        chien.parler();   // Affiche : Le chien aboie
    }
}



// Classe parente
class Animal {
    public void parler() {
        System.out.println("L'animal parle");
    }
}

// Classe enfant qui redéfinit la méthode parler() de la classe parente
class Chien extends Animal {
    @Override
    public void parler() {
        System.out.println("Le chien aboie");
    }
}


