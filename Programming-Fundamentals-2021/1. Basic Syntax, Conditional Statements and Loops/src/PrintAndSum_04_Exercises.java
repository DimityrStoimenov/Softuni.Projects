import java.util.Scanner;

public class PrintAndSum_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = numberOne; i <= numberTwo; i++) {
            System.out.print( i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
