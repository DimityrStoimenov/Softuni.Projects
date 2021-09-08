import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] sequenceOfWords = scan.nextLine().split("\\s+");
        Random random = new Random();
        for (int i = 0; i < sequenceOfWords.length ; i++) {
            int randomIndex = random.nextInt(sequenceOfWords.length);
            String temp = sequenceOfWords[i];
            sequenceOfWords[i] = sequenceOfWords[randomIndex];
            sequenceOfWords[randomIndex] = temp;
        }
        System.out.println(String.join(System.lineSeparator(),sequenceOfWords));
    }
}

