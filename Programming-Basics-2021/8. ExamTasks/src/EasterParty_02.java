import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGuests= Integer.parseInt(scan.nextLine());
        double prizeOfEnvelopeForOnePerson= Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        double prizeOfEnvelope= numberOfGuests * prizeOfEnvelopeForOnePerson;
        if(numberOfGuests >= 10 && numberOfGuests <= 15) {
            prizeOfEnvelope -= prizeOfEnvelope * 0.15;
        } else if(numberOfGuests >15 && numberOfGuests <=20) {
            prizeOfEnvelope -= prizeOfEnvelope * 0.20;
        } else if(numberOfGuests > 20) {
            prizeOfEnvelope -= prizeOfEnvelope * 0.25;
        }
        double priceOfCake= budget * 0.10;
        double totalCost = prizeOfEnvelope + priceOfCake;
        if(totalCost <= budget) {
            double leftMoney = budget - totalCost;
            System.out.printf("It is party time! %.2f leva left.",leftMoney);
        } else {
            double neededMoney = totalCost - budget;
            System.out.printf("No party! %.2f leva needed.", neededMoney);
        }
    }
}
