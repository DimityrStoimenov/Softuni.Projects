import java.util.Scanner;

public class OddOrEvenPosition_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 0; i < n; i++) {
            double currentNumber = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                oddSum += currentNumber;
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
            }
            if (i % 2 == 1) {
                evenSum += currentNumber;
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;

                }
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }

            }
        }
        if (n == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if ((evenMax == -1000000000.0) || (evenMin == 1000000000.0)) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
