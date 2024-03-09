package OtherExercices;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderx {
    public static void main(String[] args) throws IOException {

        String chemin = "C:/Users/yassi/Desktop/JavaDemoLinkedin/txt.txt";

        String contenu = lireFichier(chemin);
        System.out.println(contenu);
    }

    public static String lireFichier(String chemin) throws IOException {
        StringBuilder string = new StringBuilder();
        BufferedReader lecture = new BufferedReader(new FileReader(chemin));
        String line;
        while ((line = lecture.readLine()) != null){
            string.append(line).append("\n");
        }
        return string.toString();

    }
}
