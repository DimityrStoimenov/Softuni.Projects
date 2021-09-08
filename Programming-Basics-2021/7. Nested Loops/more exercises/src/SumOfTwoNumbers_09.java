import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startInterval = Integer.parseInt(scan.nextLine());
        int endInterval = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean isFound = false;
        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    return;

                }
            }

        }

            System.out.printf("%d combinations - neither equals %d", count, magicNumber);


    }
}

