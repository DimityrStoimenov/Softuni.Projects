import java.util.Scanner;

public class SumDigits_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int residue;
        while (number > 0) {
          residue = number  % 10;
          sum += residue;
          number = number / 10;
        }
        System.out.println(sum);
    }
}
