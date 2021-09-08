import java.util.Scanner;

public class IntegerOperations_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int divideNumber = Integer.parseInt(scan.nextLine());
        int multiplyer = Integer.parseInt(scan.nextLine());
        int sum = one + two;
        int divide = sum / divideNumber;
        int multiply = divide * multiplyer;
        System.out.println(multiply);
    }
}
