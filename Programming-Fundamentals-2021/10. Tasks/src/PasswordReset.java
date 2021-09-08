import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals("Done")) {
            //•	TakeOdd
            //•	Cut {index} {length}
            //•	Substitute {substring} {substitute}
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            switch(command) {
                case "TakeOdd":
                    text = takeOddCharacters(text);
                    System.out.println(text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String substring = text.substring(index, index +length);
                    text = text.replaceFirst(Pattern.quote(substring),"");
                    System.out.println(text);
                    break;
                case "Substitute":
                    String currentSubstring = tokens[1];
                    String substitute = tokens[2];
                    if (text.contains(currentSubstring)) {
                        text = text.replaceAll(currentSubstring, substitute);
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.printf("Your password is: %s", text);
    }
    private static String takeOddCharacters(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= text.length() - 1 ; i+=2) {
            char currentChar = text.charAt(i);
            builder.append(currentChar);

        }
        return builder.toString();
    }
}
