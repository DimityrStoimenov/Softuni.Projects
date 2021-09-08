import java.util.Scanner;

public class ReplaceRepeatingChars_SecondDecision_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length() - 1 ; i++) {
            char firstChar = text.charAt(i);
            char secondChar = text.charAt(i + 1);
            if (firstChar != secondChar) {
               builder.append(firstChar);
            }

        }
        builder.append(text.charAt(text.length() - 1));
        System.out.print(builder);

    }
}
