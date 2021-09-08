import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= N ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
            
        }
        System.out.print(factorial);
    }
}
