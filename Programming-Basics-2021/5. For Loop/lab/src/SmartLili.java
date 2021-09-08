import java.util.Scanner;

public class SmartLili {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int years = Integer.parseInt(console.nextLine());
        double washMashinePrice = Double.parseDouble(console.nextLine());
        int toyPrice = Integer.parseInt(console.nextLine());

        double moneySum = 0;
        double brother = 0;
        double toysSum = 0;
        double totalSum = 0;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                moneySum += i * 5;
                brother += 1;
            }
            if (i % 2 != 0)
                toysSum += toyPrice;
            totalSum = moneySum - brother + toysSum;
        }

        if (totalSum >= washMashinePrice) {
            System.out.printf("Yes! %.2f", totalSum - washMashinePrice);
        } else {
            System.out.printf("No! %.2f", washMashinePrice - totalSum);
        }

    }
}
