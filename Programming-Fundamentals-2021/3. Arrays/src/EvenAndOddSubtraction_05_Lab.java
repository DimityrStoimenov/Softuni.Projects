import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= numbers.length - 1 ; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                evenSum +=  currentNumber;
            } else {
                oddSum += currentNumber;
            }

        }
        int totalSum = evenSum  - oddSum;
        System.out.print(totalSum);
    }
}
