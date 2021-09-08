import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("Reveal")) {
            String [] tokens = input.split(":\\|:");
            String command = tokens[0];
            switch (command) {
                case "InsertSpace":
                  int index  = Integer.parseInt(tokens[1]);
                  text.insert(index," ");
                  System.out.println(text);
                    break;
                case "Reverse":
                    String substring = tokens[1];
                    String newText = text.toString();
                    if (newText.contains(substring)) {
                        newText = newText.replaceFirst(Pattern.quote(substring), "");
                        StringBuilder build = new StringBuilder(substring).reverse();
                        text = new StringBuilder(newText);
                        text.append(build);
                        System.out.println(text);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String newSubstring = tokens[1];
                    String replacement = tokens[2];
                    String Text = text.toString();
                     Text=Text.replace(newSubstring, replacement);
                     text = new StringBuilder(Text);
                     System.out.println(text);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.printf("You have a new text message: %s", text);
    }
}
