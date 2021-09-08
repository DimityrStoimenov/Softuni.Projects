import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfParticipants = Integer.parseInt(scan.nextLine());
        double entranceFee = Double.parseDouble(scan.nextLine());
        double prizePerDeckChair = Double.parseDouble(scan.nextLine());
        double prizePerBeachUmbrella = Double.parseDouble(scan.nextLine());
        double tax = numberOfParticipants * entranceFee;
        double prizeUmbrellas = Math.ceil(numberOfParticipants * 1.0 /2) * prizePerBeachUmbrella;
        double  prizeChairs = Math.ceil(numberOfParticipants * 0.75) * prizePerDeckChair;
        double totalCost = prizeUmbrellas + tax + prizeChairs;
        System.out.printf("%.2f lv.",totalCost);
    }
}
