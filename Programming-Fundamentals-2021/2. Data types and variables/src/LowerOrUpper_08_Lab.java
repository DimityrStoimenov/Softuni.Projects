import java.util.Scanner;

public class LowerOrUpper_08_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char character = scan.nextLine().charAt(0);
        if (character >= 65 && character <= 90) {
            System.out.println("upper-case");
        } else if (character >= 97 && character <= 122) {
            System.out.println("lower-case");
        }
    }
}
