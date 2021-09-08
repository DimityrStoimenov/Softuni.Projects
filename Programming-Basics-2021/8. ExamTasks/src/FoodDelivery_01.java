import java.util.Scanner;
public class FoodDelivery_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfChickenLists= Integer.parseInt(scan.nextLine());
        int numberOfFishLists = Integer.parseInt(scan.nextLine());
        int numberOfVegetarianLists= Integer.parseInt(scan.nextLine());
        double priceOfChickenLists = numberOfChickenLists * 10.35;
       double prizeOfFishLists = numberOfFishLists * 12.40;
       double prizeOfVegetarianLists = numberOfVegetarianLists * 8.15;
       double prize = priceOfChickenLists + prizeOfFishLists + prizeOfVegetarianLists;
       double prizeOdDessert = prize * 0.20;
       double Prize = prize + prizeOdDessert;
       double totalPrize = Prize + 2.50;
        System.out.printf("Total: %.2f", totalPrize);
    }
}
