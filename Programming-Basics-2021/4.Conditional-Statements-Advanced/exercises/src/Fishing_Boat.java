import java.util.Scanner;

public class Fishing_Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        if (season.equals("Spring")) {
            cost = 3000;
        } else if ((season.equals("Summer")) || (season.equals("Autumn"))) {
            cost = 4200;
        } else if (season.equals("Winter")) {
            cost = 2600;
        }

        if (fishers <= 6) {
            cost *= 0.90;
        } else if (fishers >= 7 && fishers <= 11) {
            cost *= 0.85;
        } else {
            cost *= 0.75;

        }

        if ((fishers % 2 == 0) && (!season.equals("Autumn"))) {
            cost *= 0.95;
        }


        if ((double) budget >= cost) {
            System.out.printf("Yes! You have %.2f leva left.", (double) budget - cost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", cost - (double) budget);
        }

    }
}
