import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArrays_ThirdDecision_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == 'A' || symbol == 'O' || symbol == 'E' || symbol == 'I' || symbol == 'U'
                        || symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u') {
                    sum += symbol * input.length();
                } else {
                    sum += symbol / input.length();
                }

            }
            numbers[i] = sum;

        }
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
