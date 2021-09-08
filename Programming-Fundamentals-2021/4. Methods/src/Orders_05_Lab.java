import java.util.Scanner;

public class Orders_05_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        if (product.equals("coffee") || product.equals("water") || product.equals("coke") || product.equals("snacks")) {
            isPurchase(product,quantity);
        }
    }

    private static void isPurchase(String product, int quantity) {
        switch(product) {
            case "coffee":
                double prize = quantity * 1.50;
                System.out.printf("%.2f", prize);
                break;
            case "water":
                 prize = quantity * 1.00;
                System.out.printf("%.2f", prize);
                break;
            case "coke":
                prize = quantity * 1.40;
                System.out.printf("%.2f", prize);
                break;
            case "snacks":
                prize = quantity * 2.00;
                System.out.printf("%.2f", prize);
                break;
        }
    }
}


