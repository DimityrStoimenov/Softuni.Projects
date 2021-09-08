import java.util.Scanner;

public class VendingMachine_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double coins;
        double vendingMachine = 0;
        String input = scan.nextLine();
        while (!input.equals("Start")) {
            coins = Double.parseDouble(input);
            if( coins == 1) {
                vendingMachine += coins;
            } else if(coins == 2) {
                vendingMachine += coins;
            } else if(coins == 0.1) {
                vendingMachine += coins;
            } else if(coins == 0.2) {
                vendingMachine += coins;
            } else if(coins == 0.5) {
                vendingMachine += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }
            input = scan.nextLine();
        }
        String product;
        input = scan.nextLine();
        while (! input.equals ("End")) {
            product = input;
            switch (product) {
                case "Nuts":
                    if(vendingMachine < 2.0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        vendingMachine -= 2.0;
                        System.out.printf("Purchased %s%n",product);
                    }
                    break;
                case "Water":
                    if(vendingMachine < 0.7) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        vendingMachine -= 0.7;
                        System.out.printf("Purchased %s%n",product);
                    }
                    break;
                case "Crisps":
                    if(vendingMachine < 1.5) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        vendingMachine -= 1.5;
                        System.out.printf("Purchased %s%n",product);
                    }
                    break;
                case "Soda":
                    if(vendingMachine < 0.8) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        vendingMachine -= 0.8;
                        System.out.printf("Purchased %s%n",product);
                    }
                    break;
                case "Coke":
                    if(vendingMachine < 1.0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        vendingMachine -= 1.0;
                        System.out.printf("Purchased %s%n",product);
                    }
                    break;
                default:
                    System.out.println("Invalid product");

            }
            input = scan.nextLine();
        }
        System.out.printf("Change: %.2f%n", vendingMachine);
    }
}
