import java.util.Scanner;

public class NameGame_06_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int maxPoints = 0;
        String winner = " ";
        while (!input.equals("Stop")) {
            int points = 0;

            for (int i = 0; i < input.length(); i++) {
                int num = Integer.parseInt(scan.nextLine());
                if (num == input.charAt(i)) {
                    points += 10;
                } else {
                    points += 2;
                }

            }
            if (points >= maxPoints) {
                maxPoints = points;
                winner = input;
            }
            input = scan.nextLine();

        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);

    }
}



