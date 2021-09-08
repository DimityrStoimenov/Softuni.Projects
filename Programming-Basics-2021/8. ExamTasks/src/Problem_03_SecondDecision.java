import java.util.Scanner;

public class Problem_03_SecondDecision {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;

        if (gender == 'm') {
            if (sport.equals("Gym")) {
                cardPrice = 42;
            } else if (sport.equals("Boxing")) {
                cardPrice = 41;
            } else if (sport.equals("Yoga")) {
                cardPrice = 45;
            } else if (sport.equals("Zumba")) {
                cardPrice = 34;
            } else if (sport.equals("Dances")) {
                cardPrice = 51;
            } else if (sport.equals("Pilates")) {
                cardPrice = 39;
            }
        } else if (gender == 'f') {
            switch (sport) {
                case "Gym":
                    cardPrice = 35;
                    break;
                case "Boxing":
                    cardPrice = 37;
                    break;
                case "Yoga":
                    cardPrice = 42;
                    break;
                case "Zumba":
                    cardPrice = 31;
                    break;
                case "Dances":
                    cardPrice = 53;
                    break;
                case "Pilates":
                    cardPrice = 37;
                    break;
            }
        }

        if (age <= 19) {
            cardPrice = cardPrice - 0.2 * cardPrice; // 0.8 * cardPrice
        }

        if (sum >= cardPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", cardPrice - sum);
        }
    }
}

