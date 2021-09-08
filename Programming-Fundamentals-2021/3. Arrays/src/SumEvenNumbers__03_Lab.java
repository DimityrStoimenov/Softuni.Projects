import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers__03_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrayList = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i <= arrayList.length -1 ; i++) {
            int currentDigit = arrayList[i];
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
        }
        System.out.print(sum);
    }
}
