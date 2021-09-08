import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);
        int num2 = Integer.parseInt(scan.nextLine());
       double result = operations(num1, operator, num2);
        System.out.println(new DecimalFormat("0.##").format(result));

    }

    private static double operations(int num1, char operator, int num2) {
        double result = 0.00;
        if (operator == '+') {
            result = num1 + num2;
        }
        if (operator == '-' && num1 > num2) {
            result = num1 - num2;
        } else if (operator == '-' && num2 > num1) {
            result = num2 - num1;
        }
        if (operator == '*') {
            result = num1 * num2;
        }
        if (operator == '/' && num1 > 0 && num2 > 0) {
            result = num1 * 1.0 / num2;
           
        }
        return result;
    }
}
