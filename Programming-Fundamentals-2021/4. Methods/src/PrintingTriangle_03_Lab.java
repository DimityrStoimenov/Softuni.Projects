import java.util.Scanner;

public class PrintingTriangle_03_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfRows = Integer.parseInt(scan.nextLine());
        printingTriangle(numberOfRows);
    }

    private static void printingTriangle(int numberOfRows) {
        int counterOfColumns;
        for (int i = 1; i <= numberOfRows; i++) {
            counterOfColumns = 0;
            for (int j = 0; j < i ; j++) {
            counterOfColumns++;
                System.out.print(counterOfColumns + " ");
            }
            System.out.println();
        }
        printingDownTriangle(numberOfRows);
    }

    private static void printingDownTriangle(int numberOfRows) {
        int counterOfColumns;
        for (int i = numberOfRows; i >= 1 ; i--) {
            counterOfColumns = 0;
            for (int j = 1; j < i ; j++) {
                counterOfColumns ++;
                System.out.print(counterOfColumns + " ");

            }
            System.out.println();
        }
    }
}
