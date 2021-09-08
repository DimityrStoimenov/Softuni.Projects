import java.util.Scanner;

public class AddAndSubtract_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        int numberThree = Integer.parseInt(scan.nextLine());
        int sumAndSubtract = sumAndSubtractNumbers(numberOne,numberTwo,numberThree);
        System.out.print(sumAndSubtract);

    }

    private static int sumAndSubtractNumbers(int numberOne, int numberTwo, int numberThree) {
        int result = numberOne + numberTwo;
        return result - numberThree;
    }

}
