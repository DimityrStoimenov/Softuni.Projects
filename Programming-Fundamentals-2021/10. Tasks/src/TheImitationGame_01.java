import java.util.Scanner;
import java.util.regex.Pattern;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder cryptText = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("Decode")) {
            //•	Move {number of letters}
            //•	Insert {index} {value}
            //•	ChangeAll {substring} {replacement}
            String [] tokens = input.split("\\|");
            String command = tokens[0];
            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(tokens[1]);
                    String substring = cryptText.substring(0,numberOfLetters);
                    String newText = cryptText.toString();
                    String threeLetters = newText.replaceFirst(Pattern.quote(substring), "");
                    cryptText = new StringBuilder(threeLetters).append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    cryptText.insert(index, value);

                    break;
                case "ChangeAll":
                    String textToReplace = tokens[1];
                    String replacement = tokens[2];
                    String text = cryptText.toString();
                    text = text.replace(textToReplace,replacement);
                    cryptText = new StringBuilder(text);
                    break;
            }

            input = scan.nextLine();
        }
        System.out.printf("The decrypted message is: %s", cryptText);
    }
}
