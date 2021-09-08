
import java.util.Scanner;

public class NxNMatrix_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        matrixNxN(N);
    }

    private static void matrixNxN(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N ; j++) {
                System.out.print(N);
                if( j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

