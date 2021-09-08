import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum += Integer.parseInt(scan.nextLine());
        }
        for (int i = 1; i <= n; i++) {
            rightSum += Integer.parseInt(scan.nextLine());
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        }else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.println("No, diff = " + diff);
        }
    }
}

