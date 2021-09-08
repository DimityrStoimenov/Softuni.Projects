
import java.util.Scanner;

public class DigitsLettersAndOther_05_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < text.length() ; i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            } else if (Character.isDigit(currentChar)) {
                digits.append(currentChar);
            } else {
                others.append(currentChar);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
