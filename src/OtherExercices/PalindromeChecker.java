package OtherExercices;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "esllse";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Pas un palindrome");
        }
    }
    private static boolean isPalindrome(String str) {
        // Supprimer les espaces et la ponctuation, et mettre en minuscules
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Vérifier si la chaîne est un palindrome
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
