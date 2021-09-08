
import java.util.Scanner;

public class MultiplicationTable2_11_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplierOne = Integer.parseInt(scan.nextLine());
        int multiplierTwo = Integer.parseInt(scan.nextLine());
        boolean isOverTen = (multiplierOne > 10 || multiplierTwo > 10);
        if (isOverTen ) {
               System.out.printf("%d X %d = %d", multiplierOne,multiplierTwo, multiplierOne * multiplierTwo);
        } else {
            for (int i = multiplierTwo; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", multiplierOne, i, multiplierOne * i);
            }
        }
    }
}
