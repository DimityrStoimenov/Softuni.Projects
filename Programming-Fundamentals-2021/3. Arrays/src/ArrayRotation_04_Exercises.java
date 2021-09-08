import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arraysOfNumbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int numberOfRotations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfRotations ; i++) {
            int temp = arraysOfNumbers[0];
            for (int j = 0; j < arraysOfNumbers.length -1 ; j++) {
              arraysOfNumbers[j] = arraysOfNumbers[j+1];
            }
            arraysOfNumbers[arraysOfNumbers.length - 1] = temp;
        }
        for (int arraysOfNumber : arraysOfNumbers) {
            System.out.print(arraysOfNumber + " ");
        }

    }
}
