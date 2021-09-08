import java.util.Scanner;

public class MultiplicationTable_10_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplier = Integer.parseInt(scan.nextLine());
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d X %d = %d%n", multiplier, j , multiplier * j);
            }

    }
}
