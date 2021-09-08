import java.util.Scanner;

public class evenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int number = 1;
        for (int i =0; i <= n; i= i +2) {
            System.out.println(number);
            number = number * 2 * 2;

        }
    }
}



