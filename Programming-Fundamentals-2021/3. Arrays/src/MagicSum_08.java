import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int [] arraysOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
               .toArray();
       int magicNumber = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < arraysOfIntegers.length - 1 ; i++) {
            for (int j = i + 1; j < arraysOfIntegers.length  ; j++) {
                int sum = arraysOfIntegers[i] + arraysOfIntegers[j];
                if (sum == magicNumber) {
                    System.out.print(arraysOfIntegers[i] +  " " + arraysOfIntegers[j]);
                    System.out.println();
                }
            }

        }
    }
}
