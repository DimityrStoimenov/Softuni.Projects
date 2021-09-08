import java.util.Arrays;
import java.util.Scanner;

public class EqualsSums_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrayOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int sumLeft = 0;
        int sumRight = 0;
        int index = 0 ;
        boolean isFoundIndex = false;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            sumLeft =0 ;
            sumRight = 0;
            for (int j = 0; j < i ; j++) {
                sumLeft += arrayOfIntegers[j];

            }
            for (int k = i + 1; k < arrayOfIntegers.length; k++) {
                sumRight += arrayOfIntegers[k];
            }
            if (sumLeft == sumRight) {
                index = i;
                isFoundIndex = true;
                break;
            }
        }
        if (isFoundIndex) {
            System.out.print(index);
        } else if (sumLeft == 0 && sumRight == 0) {
            System.out.print("0");
        } else {
            System.out.print("no");
        }
    }
}
