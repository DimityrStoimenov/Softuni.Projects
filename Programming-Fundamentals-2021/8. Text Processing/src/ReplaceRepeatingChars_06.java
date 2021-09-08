import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder builder = new StringBuilder();
        char base = text.charAt(0);
        for (int i = 0; i <= text.length() - 1; i++) {
            char currentChar = text.charAt(i);
            if (base == currentChar) {
                continue;
            }
            builder.append(base);
            base = text.charAt(i);
        }
        builder.append(text.charAt(text.length()- 1));
        System.out.print(builder);
    }
}

