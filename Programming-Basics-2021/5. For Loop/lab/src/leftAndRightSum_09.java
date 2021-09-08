import java.util.Scanner;

public class leftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        // 2 10 , 90, 60, 40
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int N1 = Integer.parseInt(scan.nextLine());
            leftSum = leftSum +N1;

        }
        for (int i = 1; i <= n; i++) {
            int N1 = Integer.parseInt(scan.nextLine());
            rightSum = rightSum +N1;

        }
        if (leftSum==rightSum) {
            System.out.printf("Yes, sum = %d ", leftSum);
        }else {
           int difference = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d ",difference);
        }

    }
}

