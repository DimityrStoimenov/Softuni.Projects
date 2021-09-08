import java.util.Scanner;

public class sumNumbers_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumNumbers=0;
        for (int i = 1; i <=n ; i++) {
          int currentNumber= Integer.parseInt(scan.nextLine());
            sumNumbers+= currentNumber;

        }
        System.out.println(sumNumbers);
    }
}
