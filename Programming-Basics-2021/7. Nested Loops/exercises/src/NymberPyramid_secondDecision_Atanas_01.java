import java.util.Scanner;

public class NymberPyramid_secondDecision_Atanas_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int counter = 1;
        boolean isBigger = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.printf("%d ", counter);
                counter++;
                if (counter > n) {
                    isBigger = true;
                    break;
                }
            }
            if (isBigger) {
                break;

            }
            System.out.println();
        }

    }
}

