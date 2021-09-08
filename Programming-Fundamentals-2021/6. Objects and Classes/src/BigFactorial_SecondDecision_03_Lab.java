import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_SecondDecision_03_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = Integer.parseInt(scan.nextLine());
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= factorial ; i++) {
          bigInteger =  bigInteger.multiply(new BigInteger(""+ i));
        }
        System.out.println(bigInteger);
    }
}
