import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int maxPasswords = Integer.parseInt(scan.nextLine());
        int count = 0;
        int A = 35;
        int B = 64;
        while (A <= 55) {
            while (B <= 96) {
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {
                        char x = ((char) A);
                        char y = ((char) B);
                        System.out.printf("%c%c%d%d%c%c|", x, y, i, j, y, x);
                        count++;
                        A++;
                        B++;
                        if (count >= maxPasswords || i == a && j == b) {
                            return;
                        }
                        if (A > 55) {
                            A = 35;
                        }
                        if (B > 96) {
                            B = 64;
                        }
                    }
                }
            }
        }
    }
}
       


