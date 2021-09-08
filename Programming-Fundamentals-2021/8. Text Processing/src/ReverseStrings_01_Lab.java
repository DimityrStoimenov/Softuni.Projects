import java.util.Scanner;

public class ReverseStrings_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String text = input;
            String reversedText = "";
            for (int i = input.length() - 1; i >= 0 ; i --) {
                char currentChar = input.charAt(i);
                reversedText += currentChar;
            }
            System.out.printf("%s = %s%n", text, reversedText);
            input = scan.nextLine();
        }
    }
}
