import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        double priceWithoutTaxes = 0;
        double taxes;
        double totalPrice;

        while (!userInput.equals("special") && !userInput.equals("regular")) {
            double priceOfComputerPart = Double.parseDouble(userInput);
            if (priceOfComputerPart < 0) {
                System.out.println("Invalid price!");

            } else {
                priceWithoutTaxes += priceOfComputerPart;
            }

            userInput = scan.nextLine();
        }
        if (priceWithoutTaxes == 0 ) {
            System.out.println("Invalid order!");
            return;
        }
        taxes = priceWithoutTaxes * 0.2;
        totalPrice = priceWithoutTaxes + taxes;
        if (userInput.equals("special")) {
            totalPrice = totalPrice - (totalPrice * 0.1);
        }
        isPrintReceipt(taxes,totalPrice,priceWithoutTaxes);
    }

    private static void isPrintReceipt(double taxes, double totalPrice, double priceWithoutTaxes) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n", totalPrice);
    }
}
