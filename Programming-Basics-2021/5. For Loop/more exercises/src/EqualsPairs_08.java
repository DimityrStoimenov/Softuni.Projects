import java.util.Scanner;

public class EqualsPairs_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int evenNum=0;
        int oddNum=0;
        for (int i = 0; i < n; i++) {
            int firstNumber = Integer.parseInt(scan.nextLine());
            int secondNumber = Integer.parseInt(scan.nextLine());
            if( i % 2== 0) {
                evenNum= firstNumber+secondNumber;
            } else {
                oddNum= firstNumber+secondNumber;
            }
        }
        if( n>1 &&evenNum == oddNum) {
            System.out.printf("Yes, value=%d", evenNum);

        }
        if (n ==1) {
            System.out.printf("Yes, value=%d", evenNum);
        } else if( n>1 && evenNum>oddNum || oddNum>evenNum)  {
            System.out.printf("No, maxdiff=%d", Math.abs(evenNum-oddNum));
        }
    }
}
