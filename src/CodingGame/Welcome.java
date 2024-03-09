package CodingGame;

import java.util.HashMap;

public class Welcome {
    // Base de données des messages d'accueil par langue
    private static final HashMap<String, String> languages = new HashMap<>();
    static {
        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german", "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian", "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");
    }

    public static String greet(String language) {
        // Vérifier si la langue est présente dans la base de données
        if (languages.containsKey(language)) {
            // Si oui, retourner le message d'accueil correspondant
            return languages.get(language);
        } else {
            // Sinon, retourner le message d'accueil en anglais par défaut
            return languages.get("english");
        }
    }

    public static void main(String[] args) {
        System.out.println(greet("french"));   // Output: Bienvenue
        System.out.println(greet("german"));   // Output: Willkommen
        System.out.println(greet("welsh")); // Output: Welcome (par défaut en anglais)
    }
}
