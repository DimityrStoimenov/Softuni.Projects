import java.util.Scanner;

public class Sequence_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // потребителя въвежда число - n
        // 1 3 7 15 31
        int n= Integer.parseInt(scan.nextLine());
        int k=1;

        while (k<=n) {
            System.out.println(k);
            k =   2 * k + 1;

        }


    }
}
