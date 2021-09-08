import java.util.Scanner;

public class SignInInteger_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer = Integer.parseInt(scan.nextLine());
        typeOfInteger(integer);
    }
    private static void typeOfInteger(int integer) {
        if (integer > 0) {
            System.out.printf("The number %d is positive.", integer);
        } else if ( integer < 0) {
            System.out.printf("The number %d is negative.", integer);
        } else {
            System.out.printf("The number %d is zero.", integer);
        }
    }
}
