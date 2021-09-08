import java.util.Scanner;

public class SortNumbers_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        int numberThree = Integer.parseInt(scan.nextLine());
        if(numberOne > numberTwo && numberOne>numberThree) {
            System.out.println(numberOne);
            if(numberTwo >= numberThree) {
                System.out.println(numberTwo);
                System.out.println(numberThree);
            } else  {
                System.out.println(numberThree);
                System.out.println(numberTwo);
            }
        } else if(numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo);
            if(numberOne >= numberThree) {
                System.out.println(numberOne);
                System.out.println(numberThree);
            } else  {
                System.out.println(numberThree);
                System.out.println(numberOne);
            }
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println(numberThree);
            if (numberOne >= numberTwo) {
                System.out.println(numberOne);
                System.out.println(numberTwo);
            } else {
                System.out.println(numberTwo);
                System.out.println(numberOne);
            }
        } else  {
            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(numberThree);
        }
    }
}
