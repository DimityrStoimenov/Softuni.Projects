import java.util.Scanner;

public class GreatestCommonDivisor_TaskBook_06_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= Integer.parseInt(scan.nextLine());
        int b= Integer.parseInt(scan.nextLine());
        while(b != 0) {
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        System.out.println("GCD = " + a);
    }
}
