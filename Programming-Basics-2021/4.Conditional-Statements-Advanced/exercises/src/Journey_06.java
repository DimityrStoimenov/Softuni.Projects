import java.util.Scanner;

public class Journey_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine()); // бюджет
        String season = scan.nextLine(); // между "summer" и "winter"

        String destination = " ";
        String choise = " ";
        char sym = '-';
        double cost = 0;
        if (budget <= 100 && season.equals("summer")) {
            destination = "Bulgaria";
            choise = "Camp";
            cost = 0.3 * budget;
            System.out.printf("Somewhere in %s%n ", destination);
            System.out.printf("%s %c %.2f", choise, sym, cost);
        } else if (budget <= 100 && season.equals("winter")) {
            destination = "Bulgaria";
            choise = "Hotel";
            cost = 0.7 * budget;
            System.out.printf("Somewhere in %s%n ", destination);
            System.out.printf("%s %c %.2f", choise, sym, cost);
        }
        if ((budget > 100 && budget<=1000) && (season.equals("summer"))) {
            destination = "Balkans";
            choise = "Camp";
            cost = 0.4 * budget;
            System.out.printf("Somewhere in %s%n ", destination);
            System.out.printf("%s %c %.2f", choise, sym, cost);
        } else if ((budget > 100 && budget<=1000) && (season.equals("winter"))) {
            destination = "Balkans";
            choise = "Hotel";
            cost = 0.8 * budget;
            System.out.printf("Somewhere in %s%n ", destination);
            System.out.printf("%s %c %.2f", choise, sym, cost);
        }
        if ((budget > 1000) && (season.equals("summer"))) {
            destination = "Europe";
            choise = "Hotel";
            cost = 0.9 * budget;
            System.out.printf("Somewhere in %s%n ", destination);
            System.out.printf("%s %c %.2f", choise, sym, cost);
        } else if ((budget > 1000) && (season.equals("winter"))) {
            destination = "Europe";
            choise = "Hotel";
            cost = 0.9 * budget;
            System.out.printf("Somewhere in %s%n ", destination);
            System.out.printf("%s %c %.2f", choise, sym, cost);
        }
    }
}


