import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        LinkedHashMap<Character, Integer> characterOccurrences = new LinkedHashMap<>();
        for (int i = 0; i <= text.length() - 1 ; i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {

            } else {
                if (!characterOccurrences.containsKey(currentChar)) {
                    characterOccurrences.put(currentChar, 1);
                } else {
                    characterOccurrences.put(currentChar, characterOccurrences.get(currentChar) + 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : characterOccurrences.entrySet()) {
            System.out.printf("%c -> %d%n", characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
        }
    }
}
