import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine(); // или е Stop или е брой парчета
        int cake = width * length;

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            cake -= pieces;
            if (cake <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
                break;
            }
            command = scan.nextLine();


        }
        if (command.equals("STOP")) {
            System.out.printf("%d pieces are left.", cake);
        }
    }

}
