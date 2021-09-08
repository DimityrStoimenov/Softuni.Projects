import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbersOfFirstArray = Arrays.stream(scan.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
        int [] numbersOfSecondArray = Arrays.stream(scan.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i <= numbersOfFirstArray.length - 1 ; i++) {
            if (numbersOfFirstArray[i] == numbersOfSecondArray[i]) {
               sum += numbersOfFirstArray[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
