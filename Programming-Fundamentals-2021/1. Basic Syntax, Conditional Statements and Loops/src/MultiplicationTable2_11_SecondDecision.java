import java.util.Scanner;

public class MultiplicationTable2_11_SecondDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());
        do {
            int result = multiplier * number;
            System.out.printf(" %d X %d = %d%n", number,multiplier, result);
            multiplier++;
        }
        while (multiplier<= 10);
    }
}
