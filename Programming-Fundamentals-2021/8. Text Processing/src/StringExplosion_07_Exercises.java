import java.util.Scanner;

public class StringExplosion_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder builder = new StringBuilder();
        int strength = 0;
        for (int i = 0; i <= text.length() - 1 ; i++) {
            char currentChar = text.charAt(i);
            if (currentChar == '>') {
                strength += Integer.parseInt(String.valueOf(text.charAt( i + 1)));
                builder.append('>');
            } else if (strength == 0) {
                builder.append(currentChar);
            } else {
                strength --;
            }
        }
        System.out.println(builder);
    }
}
