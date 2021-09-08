import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        while (numbers.length > 1) {
            int[] sequence = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                sequence[i] = numbers[i] + numbers[i + 1];

            }
            numbers = sequence;
        }
        System.out.print(numbers[0]);
    }
}
