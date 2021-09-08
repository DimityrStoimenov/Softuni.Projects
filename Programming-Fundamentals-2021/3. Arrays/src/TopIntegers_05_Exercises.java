import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        boolean isTopInteger = false;
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    isTopInteger = false;
                    break;
                } else if (numbers[i] > numbers[j]) {
                    isTopInteger = true;
                }

            }
            if (isTopInteger) {
                build.append(numbers[i]).append(" ");

            }
        }
        System.out.print(build);
        System.out.print(numbers[numbers.length - 1]);
    }
}

