import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scan.nextLine());
        int countOfBattles = 0;
        String input = scan.nextLine();
        while (!input.equals("End of battle")) {
            int distanceOfTheEnemy = Integer.parseInt(input);
            if (initialEnergy < distanceOfTheEnemy) {
                if (initialEnergy < 0) {
                    initialEnergy = 0;
                }
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",countOfBattles,
                        initialEnergy);
                return;
            } else {
                initialEnergy -= distanceOfTheEnemy;
                countOfBattles++;
                if (countOfBattles % 3 == 0) {
                    initialEnergy += countOfBattles;
                }
            }

            input = scan.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", countOfBattles,initialEnergy);
    }
}
