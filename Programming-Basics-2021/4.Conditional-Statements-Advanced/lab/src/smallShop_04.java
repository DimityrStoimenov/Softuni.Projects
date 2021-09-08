import java.util.Scanner;

public class smallShop_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double cost = 0;

        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    cost = quantity * 0.50;
                } else if (product.equals("water")) {
                    cost = quantity * 0.80;
                } else if (product.equals("beer")) {
                    cost = quantity * 1.20;
                } else if (product.equals("sweets")) {
                    cost = quantity * 1.45;
                } else if (product.equals("peanuts")) {
                    cost = quantity * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    cost = quantity * 0.40;
                } else if (product.equals("water")) {
                    cost = quantity * 0.70;
                } else if (product.equals("beer")) {
                    cost = quantity * 1.15;
                } else if (product.equals("sweets")) {
                    cost = quantity * 1.30;
                } else if (product.equals("peanuts")) {
                    cost = quantity * 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    cost = quantity * 0.45;
                } else if (product.equals("water")) {
                    cost = quantity * 0.70;
                } else if (product.equals("beer")) {
                    cost = quantity * 1.10;
                } else if (product.equals("sweets")) {
                    cost = quantity * 1.35;
                } else if (product.equals("peanuts")) {
                    cost = quantity * 1.55;
                }
                break;
        }
        System.out.printf("%.2f",cost);

    }
}
