import java.util.Scanner;

public class ReversedChars_07_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);
        System.out.printf("%c %c %c", third,second,first);
    }
}
