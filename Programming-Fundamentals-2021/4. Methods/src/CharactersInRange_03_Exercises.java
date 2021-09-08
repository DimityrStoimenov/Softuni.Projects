
import java.util.Scanner;

public class CharactersInRange_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        if ((int) firstChar > (int) secondChar) {
            String anotherSequence = anotherSubsequence(secondChar, firstChar);
            System.out.print(anotherSequence);
        } else {
            String sequence = subsequence(firstChar, secondChar);
            System.out.print(sequence);
        }

    }
    private static String anotherSubsequence(char secondChar, char firstChar) {
        StringBuilder anotherSequence = new StringBuilder();
        for (int i = secondChar; i < firstChar - 1 ; i++) {
         int value = i + 1;
         char currentChar = (char) value;
         anotherSequence.append(currentChar).append(" ");

        }
        return anotherSequence.toString();
    }

    private static String subsequence(char firstChar, char secondChar) {
        StringBuilder sequence = new StringBuilder();
        for (int i = firstChar; i < secondChar - 1 ; i++) {
            int value = i + 1;
            char currentChar = (char) value;
            sequence.append(currentChar).append(" ");
        }
        return sequence.toString();
    }
}


