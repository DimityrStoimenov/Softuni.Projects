import java.util.Scanner;

public class PascalTriangle_SecondDecision_02_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfColumn;
        int numbersOfRows = Integer.parseInt(scan.nextLine());
        for ( int row = 0; row < numbersOfRows; row++) {
           numberOfColumn = 1;
            for (int column = 0; column <= row; column++) {
                System.out.print(numberOfColumn + " ");
                numberOfColumn = numberOfColumn * (row - column )/(column + 1);

            }
            System.out.println();
        }
    }
}
