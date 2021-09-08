import java.util.Scanner;

public class Calculations_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        int operationSum = add(numberOne, numberTwo);
        int subtractOperation = subtract(numberOne, numberTwo);
        int multiplierOperation = multiply(numberOne, numberTwo);
        int divideOperation = divide(numberOne, numberTwo);
        if (operation.equals("add")) {
            System.out.print(operationSum);
        } else if (operation.equals("subtract")) {
            System.out.print(subtractOperation);
        } else if (operation.equals("multiply")) {
            System.out.println(multiplierOperation);
        } else {
            System.out.print(divideOperation);
        }

    }

    private static int divide(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

}
