import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int max= Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <n; i++) {
            int currentNumber= Integer.parseInt(scan.nextLine());
            if(currentNumber>max) {
                max= currentNumber;
            }
            sum+= currentNumber;


        }
        sum-=max;
        if(sum == max) {
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        } else {
            System.out.println("No");
            System.out.println("Diff = "+ Math.abs(sum -max));
        }

    }
}
