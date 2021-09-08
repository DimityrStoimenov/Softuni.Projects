import java.util.Scanner;

public class RecursiveFibonacci_SecondDecision_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = Integer.parseInt(scan.nextLine());
        long first = 0;
        long second = 1;
        long third = first + second;
        for (int i = 0; i < digit ; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        System.out.println(first);
    }
}
