import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        String[] labyrinth = scan.nextLine().split("\\|");
        int roomCounter = 0;
        for (int i = 0; i <= labyrinth.length - 1; i++) {
                String[] dungeonsRoom = labyrinth[i].split("\\s+");
                String command = dungeonsRoom[0];
                roomCounter++;
                if (command.equals("potion")) {
                    int additionalHealth = Integer.parseInt(dungeonsRoom[1]);
                    int health = initialHealth;
                    initialHealth += additionalHealth;
                    if (initialHealth > 100) {
                        initialHealth = 100;
                        health = 100 - health;
                        System.out.printf("You healed for %d hp.%n", health);
                    } else {
                        System.out.printf("You healed for %d hp.%n", additionalHealth);
                    }
                    System.out.printf("Current health: %d hp.%n", initialHealth);

                } else if (command.equals("chest")) {
                    int additionalBitcoins = Integer.parseInt(dungeonsRoom[1]);
                    initialBitcoins += additionalBitcoins;
                    System.out.printf("You found %d bitcoins.%n", additionalBitcoins);
                } else {
                    int reducedHealth = Integer.parseInt(dungeonsRoom[1]);
                    initialHealth -= reducedHealth;
                    if (initialHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", roomCounter);
                        return;
                    }
                }
            }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n",initialBitcoins);
        System.out.printf("Health: %d", initialHealth);

    }
}
