import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  Integer.parseInt(scan.nextLine());
        int k = 1;
        int sum = 1;
        System.out.println(k);
        for (int i = 1; i < n; i++) {
          int k2 = 2 * i + k;
            System.out.println(k2);
            sum += k2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
