import java.util.Scanner;

public class EvenNumber_12_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d%n", Math.abs(n));
    }
}
