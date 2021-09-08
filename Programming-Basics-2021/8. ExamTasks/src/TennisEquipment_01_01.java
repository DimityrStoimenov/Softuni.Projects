import java.util.Scanner;

public class TennisEquipment_01_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double prizeOfATennisRacket = Double.parseDouble(scan.nextLine());
        int numberOfTennisRackets = Integer.parseInt(scan.nextLine());
        int numberOfPairsOfSneakers = Integer.parseInt(scan.nextLine());
        double prizeOfAPairOfSneakers= prizeOfATennisRacket / 6;
        double prizeOfAllPairsOfSneakers =prizeOfAPairOfSneakers * numberOfPairsOfSneakers;
        double prizeOfATennisRackets = prizeOfATennisRacket * numberOfTennisRackets;
        double Prize  = prizeOfAllPairsOfSneakers + prizeOfATennisRackets;
        double equipment = Prize * 0.2;
        double prize = Prize + equipment;
        double prizeToBePaidByDjokovic = Math.floor(prize / 8);
        double prizeToBePaidBySponsors = Math.ceil((prize * 7) /8);
        System.out.printf("Price to be paid by Djokovic %.0f%n", prizeToBePaidByDjokovic);
        System.out.printf("Price to be paid by sponsors %.0f", prizeToBePaidBySponsors);

    }
}
