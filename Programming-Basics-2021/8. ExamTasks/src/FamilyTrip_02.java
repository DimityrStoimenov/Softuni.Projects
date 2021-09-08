import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double prizePerNight = Double.parseDouble(scan.nextLine());
        int percentAddCosts = Integer.parseInt(scan.nextLine());
        double add = budget * (percentAddCosts * 1.0/100);
        double prizeNights =nights * prizePerNight;
        if(nights > 7) {
            prizeNights -= prizeNights * 0.05;
        }
        double totalCosts = prizeNights + add;
        if(totalCosts <= budget) {
            double left = budget - totalCosts;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", left);
        } else {
            double needed = totalCosts - budget;
            System.out.printf("%.2f leva needed.",needed);
        }
    }
}
