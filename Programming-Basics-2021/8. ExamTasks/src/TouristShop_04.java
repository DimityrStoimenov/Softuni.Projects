import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int count = 0;
        String nameOfProduct = scan.nextLine();
        ;
        double discount;
        double prizeOfProducts = 0;
        while (!"Stop".equals(nameOfProduct)) {
            double prizeOfProduct = Double.parseDouble(scan.nextLine());
            count++;
            if (count % 3 == 0) {
                discount = prizeOfProduct * 0.5;
                budget -= discount;
                prizeOfProducts+=discount;
            } else {
                budget -= prizeOfProduct;
                prizeOfProducts += prizeOfProduct;

            }
            if (budget < 0) {
                System.out.println("You don't have enough money!");
                break;
            }
            nameOfProduct = scan.nextLine();

        }
        if (budget > 0) {
            System.out.printf("You bought %d products for %.2f leva.", count, prizeOfProducts);
        } else {
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        }
    }
}
