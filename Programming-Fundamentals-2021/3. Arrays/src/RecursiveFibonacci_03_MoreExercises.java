import java.util.Scanner;

public class RecursiveFibonacci_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = Integer.parseInt(scan.nextLine());
        if (digit <= 0) {
            System.out.print("0");
        } else if (digit == 1) {
            System.out.print("1");
        } else {
            long [] sequenceOfFibonacci = new long[digit];
            for (int i = 0; i < digit ; i++) {
             if (i == 0 || i == 1)  {
                 sequenceOfFibonacci[i] = 1;
             } else{
                 sequenceOfFibonacci[i] = sequenceOfFibonacci[i -1] + sequenceOfFibonacci[i-2];
             }
            }
            System.out.print(sequenceOfFibonacci[digit - 1]);
        }
    }
}
