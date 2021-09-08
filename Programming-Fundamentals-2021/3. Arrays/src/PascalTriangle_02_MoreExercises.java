import java.util.Scanner;

public class PascalTriangle_02_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfRows = Integer.parseInt(scan.nextLine());
        long[][] pascalArray = new long [numberOfRows][];
        for (int i = 0; i < numberOfRows ; i++) {
            pascalArray[i] = new long[i+1];
            for (int j = 0; j < i + 1 ; j++) {
              if (j > 0 && j < pascalArray[i]. length - 1) {
                  pascalArray[i][j] = pascalArray[i-1][j-1] + pascalArray[i-1][j];
              } else {
                  pascalArray[i][j] = 1;
              }
            }
            for (int j = 0; j < pascalArray[i].length ; j++) {
                System.out.print(pascalArray[i][j] + " ");
            }
            System.out.println();

        }
    }
}
