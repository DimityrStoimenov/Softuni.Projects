import java.util.Scanner;

public class RefactorSpecialNumbers_12_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum;
        int digit;

        for (int i = 1; i <= n; i++) {
            digit = i;
            sum = 0;
            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }
            if((sum == 5) || (sum == 7) || (sum == 11)) {

                System.out.printf("%d -> True%n", i);
            }  else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
