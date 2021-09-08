import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int sum= 0;

        for (int i = 1; i <=n ; i++) {
            int number= scan.nextInt();
            sum = sum + number;

        }
        System.out.println(sum);
    }
}
