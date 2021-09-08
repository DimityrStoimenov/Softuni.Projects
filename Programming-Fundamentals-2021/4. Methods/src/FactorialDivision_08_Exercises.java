import java.util.Scanner;

public class FactorialDivision_08_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long numberOne = Long.parseLong(scan.nextLine());
        long numberTwo = Long.parseLong(scan.nextLine());
        System.out.printf("%.2f", factorial(numberOne) / factorial(numberTwo));
    }

    private static double factorial(long digit) {
        long result = 1;
        for(long i = 2; i <= digit; i ++) {
              result *= i;
        }
        return result;
    }
}
