import java.util.Scanner;

public class evenOrOddSum_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());

        int evenSum=0;
        int oddSum = 0;
        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(i % 2  == 1) {
                oddSum+=number;
            } else {
                evenSum+=number;
            }
        }

        if(evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d",evenSum);
        } else {
            int difference = Math.abs(oddSum-evenSum);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }

    }
}
