import java.util.Scanner;

public class charityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine()); // броя на дните
        int confectioners = Integer.parseInt(scan.nextLine()); // броя на сладкарите
        int cakes = Integer.parseInt(scan.nextLine()); // брой торти
        int corrugations = Integer.parseInt(scan.nextLine()); // брой гофрети
        int pancakes = Integer.parseInt(scan.nextLine()); // брой палачинки

        double priceOfTheCakes = cakes * 45;
        double priceOfTheCorrugations = corrugations * 5.80;
        double priceOfPancakes = pancakes * 3.20;
        double amountPerDay = (priceOfTheCakes + priceOfTheCorrugations + priceOfPancakes) * confectioners;
        double amountOfEntireCampaign = amountPerDay * days;
        double netAmount = amountOfEntireCampaign -(0.125 * amountOfEntireCampaign);
        System.out.printf("%.2f", netAmount);

    }
}
