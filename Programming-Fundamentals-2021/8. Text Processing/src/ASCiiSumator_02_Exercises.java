import java.util.Scanner;

public class ASCiiSumator_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        String text = scan.nextLine();
        int sum = 0;
        for (int i = 0; i <= text.length() - 1 ; i++) {
            char currentChar = text.charAt(i);
            if ((int) currentChar > (int) firstChar && (int) currentChar < (int) secondChar) {
               sum += (int) currentChar;
            }
        }
        System.out.println(sum);
    }
}
