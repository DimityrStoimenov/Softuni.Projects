import java.util.Scanner;

public class CaesarCipher_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= text.length() -1 ; i++) {
                char currentChar = text.charAt(i);
                int real = (int) currentChar + 3;
                char current = (char) real;
                builder.append(current);
            }
        System.out.print(builder);
    }
}
