import java.util.Scanner;

public class SmallestThreeNumbers_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int smallestNumber = findTheSmallestNumber(num1,num2,num3);
        System.out.print(smallestNumber);
    }

    private static int findTheSmallestNumber(int x, int y, int z) {
        if( x < y && x < z) {
            return x;
        } else if ( y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }
}
