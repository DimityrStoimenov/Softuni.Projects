import java.util.Scanner;

public class UniquePINCodes_SecondDecision_01_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scan.nextLine());
        int secondDigit = Integer.parseInt(scan.nextLine());
        int thirdDigit = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= firstDigit; i += 2) {
            for (int j = 2; j <= secondDigit; j++) {
                for (int k = 2; k <= thirdDigit; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}

