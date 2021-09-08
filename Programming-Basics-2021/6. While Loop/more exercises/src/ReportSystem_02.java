import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int expectedAmount = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int collectedAmountForCS = 0;
        int collectedAmountForCC = 0;
        int totalSum = 0;
        double averageCS = 0;
        double averageCC = 0;
        int count = 0;
        int countCS = 0;
        int countCC = 0;
        int sum = 0;
        while (!"End".equals(command)) {
            int priceOfItems = Integer.parseInt(command);
            count++;
            if (count % 2 == 1 && (priceOfItems >= 0 && priceOfItems <= 100)) {
                System.out.println("Product sold!");
            } else if (count % 2 == 1 && priceOfItems > 100) {
                System.out.println("Error in transaction!");
            }
            if (count % 2 == 0 && priceOfItems >= 0 && priceOfItems < 10) {
                System.out.println("Error in transaction!");
            } else if (count % 2 == 0 && priceOfItems >= 10) {
                System.out.println("Product sold!");
            }
            if (count % 2 == 1 && (priceOfItems >= 0 && priceOfItems <= 100)) {
                collectedAmountForCS += priceOfItems;
                countCS++;
            } else if (count % 2 == 0 && (priceOfItems >= 10)) {
                collectedAmountForCC += priceOfItems;
                countCC++;
            }
            if (count % 2 == 1 && (priceOfItems >= 0 && priceOfItems <= 100)) {
                sum+=priceOfItems;
            } else if(count % 2 == 0 && (priceOfItems >= 10)) {
                sum+=priceOfItems;
            }
            if (sum >= expectedAmount) {
                averageCS = collectedAmountForCS * 1.0 / countCS;
                System.out.printf("Average CS: %.2f%n", averageCS);
                averageCC = collectedAmountForCC * 1.0 / countCC;
                System.out.printf("Average CC: %.2f", averageCC);
                return;
            }


            command = scan.nextLine();
        }
        System.out.println("Failed to collect required money for charity.");
    }

}
