import java.util.Scanner;

public class DecryptingMessages_05_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        int numberOfChars = Integer.parseInt(scan.nextLine());
        StringBuilder build = new StringBuilder();
        while (numberOfChars > 0) {
            char currentChar = scan.nextLine().charAt(0);
           int decrypted = (int) currentChar + key;
           char decryptedChar = (char) decrypted;
            build.append(decryptedChar);
            numberOfChars--;
        }
        System.out.println(build);
    }
}
