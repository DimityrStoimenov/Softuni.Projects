import java.util.Scanner;

public class RefactoringPrimeChecker_04_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = Integer.parseInt(scan.nextLine());
        for (int digit = 2; digit <= range ; digit++) {
            boolean isNotPrime = true;
            for (int divider = 2; divider < digit; divider++) {
            if(digit % divider == 0) {
                isNotPrime = false;
                break;
            }
            }
            System.out.printf("%d -> %b%n",digit,isNotPrime);
        }
    }
}
