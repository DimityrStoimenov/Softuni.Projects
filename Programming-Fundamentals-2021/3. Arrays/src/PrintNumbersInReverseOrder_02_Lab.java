
import java.util.Scanner;

public class PrintNumbersInReverseOrder_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int [] numbers = new int[n];
        for (int i = 0; i < n ; i++) {
           numbers[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");

        }
    }
}
