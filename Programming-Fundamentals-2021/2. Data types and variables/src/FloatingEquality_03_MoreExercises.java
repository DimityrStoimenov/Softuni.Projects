import java.util.Scanner;

public class FloatingEquality_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberOne = Double.parseDouble(scan.nextLine());
        double numberTwo = Double.parseDouble(scan.nextLine());
        double subtract ;
        if(numberOne > numberTwo) {
            subtract = numberOne - numberTwo;
            if ( subtract <= 0.000001) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else if (numberOne < numberTwo) {
            subtract = numberTwo - numberOne;
            if ( subtract <= 0.000001) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

        } else {
            System.out.println("True");
        }
    }
}
